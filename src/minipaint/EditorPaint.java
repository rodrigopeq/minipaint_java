package minipaint;

import desenhos.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.text.AbstractDocument;
import view.*;

/**
 * Classe que serve como intermediador entre a interface grafica e as classes e
 * metodos do programa.
 *
 * @author Rodrigo dos Santos Pequeno - 201600114780
 * @version 1.0
 * @since 03/2019
 */
public class EditorPaint implements ActionListener, MouseListener, MouseMotionListener {

    private ArrayList<Figura2D> figurasDesenhadas;
    private static MiniPaint miniPaint;
    private Point pressed, released;
    private Color corAtual, corEditar;
    private int linhaSelecionada;
    private int figuraSelecionada;
    private final FigurasTableModel tableFiguras;

    /**
     * Construtor do editor.
     */
    public EditorPaint() {
        figurasDesenhadas = new ArrayList<>();
        miniPaint = new MiniPaint();
        miniPaint.getjPanelEditar().setVisible(false);
        miniPaint.getTelaDeDesenho().setBackground(Color.RED);
        tableFiguras = new FigurasTableModel(figurasDesenhadas);
        miniPaint.getjTableFiguras().setModel(tableFiguras);
        miniPaint.getTelaDeDesenho().addMouseListener(this);
        miniPaint.getTelaDeDesenho().addMouseMotionListener(this);
        limitaJTextField();
        setCorAtual(Color.BLACK);
        figuraSelecionada = 0;
        linhaSelecionada = -1;
        addActions();
        exibirTodasFiguras();
    }

    /**
     * Método usado para limitar a entrada de dados nos jTextFields.
     */
    public final void limitaJTextField() {
        ((AbstractDocument) miniPaint.getEditarY().getDocument()).setDocumentFilter(new tratamento.NameDocumentFilter());
        ((AbstractDocument) miniPaint.getEditarX().getDocument()).setDocumentFilter(new tratamento.NameDocumentFilter());
        ((AbstractDocument) miniPaint.getEditarBase().getDocument()).setDocumentFilter(new tratamento.NameDocumentFilter());
        ((AbstractDocument) miniPaint.getEditarAltura().getDocument()).setDocumentFilter(new tratamento.NameDocumentFilter());
        ((AbstractDocument) miniPaint.getEditarRaio().getDocument()).setDocumentFilter(new tratamento.NameDocumentFilter());
    }

    /**
     * Método utilizado para adicionar todas as Actions Listener.
     */
    public final void addActions() {
        miniPaint.getBtnEditar().addActionListener(this);
        miniPaint.getBtnApagar().addActionListener(this);
        miniPaint.getBtnCancelar().addActionListener(this);
        miniPaint.getBtnCirculo().addActionListener(this);
        miniPaint.getBtnEditarCor().addActionListener(this);
        miniPaint.getBtnOK().addActionListener(this);
        miniPaint.getBtnRetangulo().addActionListener(this);
        miniPaint.getBtnTriangulo().addActionListener(this);
        miniPaint.getEditarAltura().addActionListener(this);
        miniPaint.getEditarBase().addActionListener(this);
        miniPaint.getEditarRaio().addActionListener(this);
        miniPaint.getEditarX().addActionListener(this);
        miniPaint.getEditarY().addActionListener(this);
        miniPaint.getBtnSelecionarCor().addActionListener(this);
        miniPaint.getBtnCarregar().addActionListener(this);
        miniPaint.getBtnLimparTela().addActionListener(this);
        miniPaint.getBtnSair().addActionListener(this);
        miniPaint.getBtnSalvar().addActionListener(this);
        miniPaint.getBtnRetanguloPreencher().addActionListener(this);
        miniPaint.getBtnTrianguloPreencher().addActionListener(this);
        miniPaint.getBtnCirculoPreencher().addActionListener(this);
    }

    /**
     * Método para definir o title da borda da painel de editar
     *
     * @param title Novo title para a borda
     */
    public void setTitleBorderEditar(String title) {
        miniPaint.getjPanelEditar().setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), title, javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)));
    }

    /**
     * Método para definir a nova cor padrão.
     *
     * @param corAtual nova Color padrão.
     */
    public void setCorAtual(Color corAtual) {
        if (corAtual == null) {
            this.corAtual = (Color.WHITE);
        } else {
            this.corAtual = corAtual;
        }
        miniPaint.getBtnSelecionarCor().setBackground(corAtual);
    }

    /**
     * Método para definir a nova cor da figura editada.
     *
     * @param corEditar nova Color da figura.
     */
    public void setCorEditar(Color corEditar) {
        if (corEditar == null) {
            this.corEditar = (Color.WHITE);
        } else {
            this.corEditar = corEditar;
        }
        miniPaint.getBtnEditarCor().setBackground(corEditar);
    }

    /**
     * Método para limpar a tela de desenho.
     */
    public void limparTela() {
        figurasDesenhadas = new ArrayList<>();
        tableFiguras.setFiguras(figurasDesenhadas);
        tableFiguras.atualizarTabela();
        exibirTodasFiguras();
    }

    /**
     * Método que adiciona uma nova forma à tela de desenho.
     *
     * @param f figura para ser desenhada
     * @return true se foi adicionada com sucesso
     */
    public boolean addFigura(Figura2D f) {
        boolean adicionar = figurasDesenhadas.add(f);
        tableFiguras.fireTableDataChanged();
        exibirTodasFiguras();
        return adicionar;
    }

    /**
     * Método que apagua qualquer forma da tela de desenho.
     */
    public void apagarFigura() {
        linhaSelecionada = miniPaint.getjTableFiguras().getSelectedRow();
        figurasDesenhadas.remove(linhaSelecionada);
        tableFiguras.fireTableRowsDeleted(linhaSelecionada, linhaSelecionada);
        if (!figurasDesenhadas.isEmpty()) {
            if (linhaSelecionada < figurasDesenhadas.size()) {
                miniPaint.getjTableFiguras().setRowSelectionInterval(linhaSelecionada, linhaSelecionada);
            } else if (linhaSelecionada >= figurasDesenhadas.size()) {
                miniPaint.getjTableFiguras().setRowSelectionInterval(linhaSelecionada - 1, linhaSelecionada - 1);
            }
        }

        exibirTodasFiguras();
    }

    /**
     * Método que edita qualquer forma da tela de desenho.
     */
    public void editarFigura() {
        Figura2D atual = tableFiguras.getFigura(linhaSelecionada);
        Figura2D editado;
        if (atual instanceof Retangulo) {
            editado = new Retangulo(new Point(Integer.parseInt(miniPaint.getEditarX().getText()),
                    Integer.parseInt(miniPaint.getEditarY().getText())),
                    miniPaint.getBtnEditarCor().getBackground(),
                    atual.isPreencher(),
                    Integer.parseInt(miniPaint.getEditarBase().getText()),
                    Integer.parseInt(miniPaint.getEditarAltura().getText()));
        } else if (atual instanceof Circulo) {
            editado = new Circulo(new Point(Integer.parseInt(miniPaint.getEditarX().getText()),
                    Integer.parseInt(miniPaint.getEditarY().getText())),
                    miniPaint.getBtnEditarCor().getBackground(),
                    atual.isPreencher(),
                    Integer.parseInt(miniPaint.getEditarRaio().getText()));
        } else {
            editado = new Triangulo(new Point(Integer.parseInt(miniPaint.getEditarX().getText()),
                    Integer.parseInt(miniPaint.getEditarY().getText())),
                    miniPaint.getBtnEditarCor().getBackground(),
                    atual.isPreencher(),
                    Integer.parseInt(miniPaint.getEditarBase().getText()),
                    Integer.parseInt(miniPaint.getEditarAltura().getText()));
        }
        figurasDesenhadas.remove(atual);
        figurasDesenhadas.add(linhaSelecionada, editado);
        exibirTodasFiguras();
        miniPaint.getjPanelEditar().setVisible(false);
    }

    /**
     * Método que carregua um desenho do arquivo
     *
     * @throws ClassNotFoundException Caso o arquivo não possua a classe
     * Figura2D.
     */
    public void carregarFigura() throws ClassNotFoundException {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(miniPaint.getBtnCarregar()) == JFileChooser.APPROVE_OPTION) {
            try {
                FileInputStream arq = new FileInputStream(fileChooser.getSelectedFile());
                try (ObjectInputStream objeto = new ObjectInputStream(arq)) {
                    while (true) {
                        Figura2D figura = (Figura2D) objeto.readObject();
                        figurasDesenhadas.add(figura);
                    }
                }
            } catch (IOException e) {
            }
        }
        tableFiguras.atualizarTabela();
        exibirTodasFiguras();

    }

    /**
     * Método que salva um desenho em um arquivo.
     */
    public void salvarFigura() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(miniPaint.getBtnSalvar()) == JFileChooser.APPROVE_OPTION) {
            try {
                FileOutputStream arq = new FileOutputStream(fileChooser.getSelectedFile() + ".mnp");
                ObjectOutputStream objeto = new ObjectOutputStream(arq);
                for (int i = 0; i < figurasDesenhadas.size(); i++) {
                    objeto.writeObject(figurasDesenhadas.get(i));
                }
            } catch (IOException e) {
            }
        }

    }

    /**
     * Método que atualiza todas as imagens.
     */
    public final void exibirTodasFiguras() {
        miniPaint.getTelaDeDesenho().setFigurasDesenhadas(figurasDesenhadas);
        miniPaint.getTelaDeDesenho().repaint();
    }

    /**
     * Método que define os dados atual da figura selecionada para realizar a
     * edição.
     */
    public void setValoresEditar() {
        linhaSelecionada = miniPaint.getjTableFiguras().getSelectedRow();
        Figura2D atual = tableFiguras.getFigura(linhaSelecionada);
        setTitleBorderEditar("Editar " + atual.getClass().getSimpleName().replace("a", "â") + (linhaSelecionada + 1));
        miniPaint.getEditarX().setText(atual.getInicial().x + "");
        miniPaint.getEditarY().setText(atual.getInicial().y + "");
        miniPaint.getBtnEditarCor().setBackground(atual.getCor());

        if (atual instanceof Circulo) {
            miniPaint.getjLabelBase().setVisible(false);
            miniPaint.getEditarBase().setVisible(false);
            miniPaint.getjLabelAltura().setVisible(false);
            miniPaint.getEditarAltura().setVisible(false);
            miniPaint.getjLabelRaio().setVisible(true);
            miniPaint.getEditarRaio().setVisible(true);

            Circulo c1 = (Circulo) atual;
            miniPaint.getEditarRaio().setText(c1.getRaio() + "");

        } else {
            miniPaint.getjLabelBase().setVisible(true);
            miniPaint.getEditarBase().setVisible(true);
            miniPaint.getjLabelAltura().setVisible(true);
            miniPaint.getEditarAltura().setVisible(true);
            miniPaint.getjLabelRaio().setVisible(false);
            miniPaint.getEditarRaio().setVisible(false);

            if (atual instanceof Triangulo) {
                Triangulo t1 = (Triangulo) atual;
                miniPaint.getEditarBase().setText(t1.getBase() + "");
                miniPaint.getEditarAltura().setText(t1.getAltura() + "");
            } else {
                Retangulo r1 = (Retangulo) atual;
                miniPaint.getEditarBase().setText(r1.getBase() + "");
                miniPaint.getEditarAltura().setText(r1.getAltura() + "");
            }
        }
        miniPaint.getjPanelEditar().setVisible(true);
    }

    /**
     * Método dos eventos caso os botões sejam pressionado.
     *
     * @param e Evento dos botões caso seja pressionado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miniPaint.getBtnRetangulo()) {
            figuraSelecionada = 1;
        } else if (e.getSource() == miniPaint.getBtnTriangulo()) {
            figuraSelecionada = 2;
        } else if (e.getSource() == miniPaint.getBtnCirculo()) {
            figuraSelecionada = 3;
        } else if (e.getSource() == miniPaint.getBtnRetanguloPreencher()) {
            figuraSelecionada = 4;
        } else if (e.getSource() == miniPaint.getBtnTrianguloPreencher()) {
            figuraSelecionada = 5;
        } else if (e.getSource() == miniPaint.getBtnCirculoPreencher()) {
            figuraSelecionada = 6;
        } else if (e.getSource() == miniPaint.getBtnSelecionarCor()) {
            setCorAtual(JColorChooser.showDialog(null, "Selecione uma cor!", corAtual));
        } else if (e.getSource() == miniPaint.getBtnEditarCor()) {
            setCorEditar(JColorChooser.showDialog(null, "Selecione uma cor!", corEditar));
        } else if (e.getSource() == miniPaint.getBtnEditar()) {
            setValoresEditar();
        } else if (e.getSource() == miniPaint.getBtnApagar()) {
            apagarFigura();
        } else if (e.getSource() == miniPaint.getBtnOK()) {
            editarFigura();
        } else if (e.getSource() == miniPaint.getBtnCancelar()) {
            miniPaint.getjPanelEditar().setVisible(false);
        } else if (e.getSource() == miniPaint.getBtnLimparTela()) {
            limparTela();
        } else if (e.getSource() == miniPaint.getBtnSalvar()) {
            salvarFigura();
        } else if (e.getSource() == miniPaint.getBtnCarregar()) {
            try {
                carregarFigura();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EditorPaint.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getSource() == miniPaint.getBtnSair()) {
            miniPaint.dispose();
            miniPaint.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

    }

    /**
     *
     * @param me
     */
    @Override
    public void mouseClicked(MouseEvent me) {
    }

    /**
     * Método para caso a Tela seja pressionada.
     *
     * @param e Evento do mouse
     */
    @Override
    public void mousePressed(MouseEvent e) {
        pressed = new Point(e.getX(), e.getY());
    }

    /**
     * Método para caso a Tela deixe de ser pressionada.
     *
     * @param me Evento do mouse
     */
    @Override
    public void mouseReleased(MouseEvent me) {
        Figura2D novaFigura;
        released = new Point(me.getX(), me.getY());
        int base = Math.abs(2 * (released.x - pressed.x));
        int altura = Math.abs(2 * (released.y - pressed.y));
        int alturaTriangulo = (int) Math.abs((base / 2) * Math.sqrt(3));
        int raio = (int) Math.sqrt(Math.pow(released.x - pressed.x, 2) + Math.pow(released.y - pressed.y, 2));
        switch (figuraSelecionada) {
            case 1:
                novaFigura = new Retangulo(pressed, corAtual, false, base, altura);
                figurasDesenhadas.add(novaFigura);
                break;
            case 2:
                novaFigura = new Triangulo(pressed, corAtual, false, base, alturaTriangulo);
                figurasDesenhadas.add(novaFigura);
                break;
            case 3:
                novaFigura = new Circulo(pressed, corAtual, false, raio);
                figurasDesenhadas.add(novaFigura);
                break;
            case 4:
                novaFigura = new Retangulo(pressed, corAtual, true, base, altura);
                figurasDesenhadas.add(novaFigura);
                break;
            case 5:
                novaFigura = new Triangulo(pressed, corAtual, true, base, alturaTriangulo);
                figurasDesenhadas.add(novaFigura);
                break;
            case 6:
                novaFigura = new Circulo(pressed, corAtual, true, raio);
                figurasDesenhadas.add(novaFigura);
                break;

        }
        tableFiguras.atualizarTabela();
        exibirTodasFiguras();
    }

    /**
     *
     * @param me
     */
    @Override
    public void mouseEntered(MouseEvent me) {
    }

    /**
     *
     * @param me
     */
    @Override
    public void mouseExited(MouseEvent me) {
    }

    /**
     *
     * @param me
     */
    @Override
    public void mouseDragged(MouseEvent me) {
    }

    /**
     *
     * @param me
     */
    @Override
    public void mouseMoved(MouseEvent me) {
    }

    /**
     * Método main para execução do programa.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        EditorPaint x = new EditorPaint();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            miniPaint.setVisible(true);
        });
    }

}
