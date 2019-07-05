package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * Classe utilizada como interface do Mini Paint.
 *
 * @author Rodrigo dos Santos Pequeno - 201600114780
 */
public class MiniPaint extends javax.swing.JFrame {

    /**
     * Creates new form MiniPaint
     */
    public MiniPaint() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    // Métodos getters e setters
    public JPanel getjPanelEditar() {
        return jPanelEditar;
    }

    public void setjPanelEditar(JPanel jPanelEditar) {
        this.jPanelEditar = jPanelEditar;
    }

    public JButton getBtnApagar() {
        return btnApagar;
    }

    public void setBtnApagar(JButton btnApagar) {
        this.btnApagar = btnApagar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JMenuItem getBtnCarregar() {
        return btnCarregar;
    }

    public void setBtnCarregar(JMenuItem btnCarregar) {
        this.btnCarregar = btnCarregar;
    }

    public JButton getBtnCirculo() {
        return btnCirculo;
    }

    public void setBtnCirculo(JButton btnCirculo) {
        this.btnCirculo = btnCirculo;
    }

    public JButton getBtnCirculoPreencher() {
        return btnCirculoPreencher;
    }

    public void setBtnCirculoPreencher(JButton btnCirculoPreencher) {
        this.btnCirculoPreencher = btnCirculoPreencher;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnEditarCor() {
        return btnEditarCor;
    }

    public void setBtnEditarCor(JButton btnEditarCor) {
        this.btnEditarCor = btnEditarCor;
    }

    public JMenuItem getBtnLimparTela() {
        return btnLimparTela;
    }

    public void setBtnLimparTela(JMenuItem btnLimparTela) {
        this.btnLimparTela = btnLimparTela;
    }

    public JButton getBtnOK() {
        return btnOK;
    }

    public void setBtnOK(JButton btnOK) {
        this.btnOK = btnOK;
    }

    public JButton getBtnRetangulo() {
        return btnRetangulo;
    }

    public void setBtnRetangulo(JButton btnRetangulo) {
        this.btnRetangulo = btnRetangulo;
    }

    public JButton getBtnRetanguloPreencher() {
        return btnRetanguloPreencher;
    }

    public void setBtnRetanguloPreencher(JButton btnRetanguloPreencher) {
        this.btnRetanguloPreencher = btnRetanguloPreencher;
    }

    public JMenuItem getBtnSair() {
        return btnSair;
    }

    public void setBtnSair(JMenuItem btnSair) {
        this.btnSair = btnSair;
    }

    public JMenuItem getBtnSalvar() {
        return btnSalvar;
    }

    public void setBtnSalvar(JMenuItem btnSalvar) {
        this.btnSalvar = btnSalvar;
    }

    public JButton getBtnSelecionarCor() {
        return btnSelecionarCor;
    }

    public void setBtnSelecionarCor(JButton btnSelecionarCor) {
        this.btnSelecionarCor = btnSelecionarCor;
    }

    public JButton getBtnTriangulo() {
        return btnTriangulo;
    }

    public void setBtnTriangulo(JButton btnTriangulo) {
        this.btnTriangulo = btnTriangulo;
    }

    public JButton getBtnTrianguloPreencher() {
        return btnTrianguloPreencher;
    }

    public void setBtnTrianguloPreencher(JButton btnTrianguloPreencher) {
        this.btnTrianguloPreencher = btnTrianguloPreencher;
    }

    public JTextField getEditarAltura() {
        return editarAltura;
    }

    public void setEditarAltura(JTextField editarAltura) {
        this.editarAltura = editarAltura;
    }

    public JTextField getEditarBase() {
        return editarBase;
    }

    public void setEditarBase(JTextField editarBase) {
        this.editarBase = editarBase;
    }

    public JTextField getEditarRaio() {
        return editarRaio;
    }

    public void setEditarRaio(JTextField editarRaio) {
        this.editarRaio = editarRaio;
    }

    public JTextField getEditarX() {
        return editarX;
    }

    public void setEditarX(JTextField editarX) {
        this.editarX = editarX;
    }

    public JTextField getEditarY() {
        return editarY;
    }

    public void setEditarY(JTextField editarY) {
        this.editarY = editarY;
    }

    public JLabel getjLabelAltura() {
        return jLabelAltura;
    }

    public void setjLabelAltura(JLabel jLabelAltura) {
        this.jLabelAltura = jLabelAltura;
    }

    public JLabel getjLabelBase() {
        return jLabelBase;
    }

    public void setjLabelBase(JLabel jLabelBase) {
        this.jLabelBase = jLabelBase;
    }

    public JLabel getjLabelCor() {
        return jLabelCor;
    }

    public void setjLabelCor(JLabel jLabelCor) {
        this.jLabelCor = jLabelCor;
    }

    public JLabel getjLabelRaio() {
        return jLabelRaio;
    }

    public void setjLabelRaio(JLabel jLabelRaio) {
        this.jLabelRaio = jLabelRaio;
    }

    public JLabel getjLabelSelecionarCor() {
        return jLabelSelecionarCor;
    }

    public void setjLabelSelecionarCor(JLabel jLabelSelecionarCor) {
        this.jLabelSelecionarCor = jLabelSelecionarCor;
    }

    public JLabel getjLabelX() {
        return jLabelX;
    }

    public void setjLabelX(JLabel jLabelX) {
        this.jLabelX = jLabelX;
    }

    public JLabel getjLabelY() {
        return jLabelY;
    }

    public void setjLabelY(JLabel jLabelY) {
        this.jLabelY = jLabelY;
    }

    public JTable getjTableFiguras() {
        return jTableFiguras;
    }

    public void setjTableFiguras(JTable jTableFiguras) {
        this.jTableFiguras = jTableFiguras;
    }

    public Tela getTelaDeDesenho() {
        return telaDeDesenho;
    }

    public void setTelaDeDesenho(Tela telaDeDesenho) {
        this.telaDeDesenho = telaDeDesenho;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnRetangulo = new javax.swing.JButton();
        btnTriangulo = new javax.swing.JButton();
        btnCirculo = new javax.swing.JButton();
        btnSelecionarCor = new javax.swing.JButton();
        btnRetanguloPreencher = new javax.swing.JButton();
        btnTrianguloPreencher = new javax.swing.JButton();
        btnCirculoPreencher = new javax.swing.JButton();
        jLabelSelecionarCor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFiguras = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanelEditar = new javax.swing.JPanel();
        jLabelX = new javax.swing.JLabel();
        jLabelY = new javax.swing.JLabel();
        jLabelCor = new javax.swing.JLabel();
        jLabelRaio = new javax.swing.JLabel();
        jLabelBase = new javax.swing.JLabel();
        jLabelAltura = new javax.swing.JLabel();
        editarX = new javax.swing.JTextField();
        editarY = new javax.swing.JTextField();
        btnEditarCor = new javax.swing.JButton();
        editarRaio = new javax.swing.JTextField();
        editarBase = new javax.swing.JTextField();
        editarAltura = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        telaDeDesenho = new view.Tela();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCarregar = new javax.swing.JMenuItem();
        btnSalvar = new javax.swing.JMenuItem();
        btnSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnLimparTela = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MiniPaint");

        btnRetangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quadrado.png"))); // NOI18N

        btnTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/triangulo.png"))); // NOI18N

        btnCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circulo.png"))); // NOI18N

        btnSelecionarCor.setBackground(new java.awt.Color(255, 255, 255));

        btnRetanguloPreencher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quadrado_preencher.png"))); // NOI18N

        btnTrianguloPreencher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/triangulo_preencher.png"))); // NOI18N

        btnCirculoPreencher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circulo_preencher.png"))); // NOI18N

        jLabelSelecionarCor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSelecionarCor.setText("COR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSelecionarCor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrianguloPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCirculoPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionarCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnRetangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetanguloPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRetangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetanguloPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrianguloPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCirculoPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSelecionarCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSelecionarCor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(373, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableFiguras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Figura"
            }
        ));
        jScrollPane1.setViewportView(jTableFiguras);
        if (jTableFiguras.getColumnModel().getColumnCount() > 0) {
            jTableFiguras.getColumnModel().getColumn(0).setResizable(false);
        }

        btnEditar.setText("Editar");

        btnApagar.setText("Apagar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnApagar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnApagar))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPanelEditar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Editar Figura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanelEditar.setToolTipText("");

        jLabelX.setText("X");

        jLabelY.setText("Y");

        jLabelCor.setText("COR");

        jLabelRaio.setText("RAIO");

        jLabelBase.setText("BASE");

        jLabelAltura.setText("ALTURA");

        btnOK.setText("OK");

        btnCancelar.setText("CANCELAR");

        javax.swing.GroupLayout jPanelEditarLayout = new javax.swing.GroupLayout(jPanelEditar);
        jPanelEditar.setLayout(jPanelEditarLayout);
        jPanelEditarLayout.setHorizontalGroup(
            jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                        .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelAltura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jLabelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelRaio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(editarBase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(editarX, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarCor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarRaio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarAltura)
                            .addComponent(editarY)))
                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                        .addComponent(btnOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        jPanelEditarLayout.setVerticalGroup(
            jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelX)
                    .addComponent(editarX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelY)
                    .addComponent(editarY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCor, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRaio)
                    .addComponent(editarRaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBase)
                    .addComponent(editarBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAltura)
                    .addComponent(editarAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout telaDeDesenhoLayout = new javax.swing.GroupLayout(telaDeDesenho);
        telaDeDesenho.setLayout(telaDeDesenhoLayout);
        telaDeDesenhoLayout.setHorizontalGroup(
            telaDeDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        telaDeDesenhoLayout.setVerticalGroup(
            telaDeDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        btnCarregar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        btnCarregar.setText("Abrir");
        jMenu1.add(btnCarregar);

        btnSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btnSalvar.setText("Salvar");
        jMenu1.add(btnSalvar);

        btnSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        btnSair.setText("Sair");
        jMenu1.add(btnSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        btnLimparTela.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        btnLimparTela.setText("Limpar Tela");
        jMenu2.add(btnLimparTela);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(telaDeDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(telaDeDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JMenuItem btnCarregar;
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnCirculoPreencher;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarCor;
    private javax.swing.JMenuItem btnLimparTela;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnRetangulo;
    private javax.swing.JButton btnRetanguloPreencher;
    private javax.swing.JMenuItem btnSair;
    private javax.swing.JMenuItem btnSalvar;
    private javax.swing.JButton btnSelecionarCor;
    private javax.swing.JButton btnTriangulo;
    private javax.swing.JButton btnTrianguloPreencher;
    private javax.swing.JTextField editarAltura;
    private javax.swing.JTextField editarBase;
    private javax.swing.JTextField editarRaio;
    private javax.swing.JTextField editarX;
    private javax.swing.JTextField editarY;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelBase;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelRaio;
    private javax.swing.JLabel jLabelSelecionarCor;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JLabel jLabelY;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFiguras;
    private view.Tela telaDeDesenho;
    // End of variables declaration//GEN-END:variables

}
