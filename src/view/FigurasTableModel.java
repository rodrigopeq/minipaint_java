/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import desenhos.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Classe com objetivo de definir um Modelo para a tabela com a lista das
 * figuras.
 *
 * @author Rodrigo dos Santos Pequeno - 201600114780
 */
public class FigurasTableModel extends AbstractTableModel {

    private ArrayList<Figura2D> figuras;
    private final String[] coluna = {"Figuras"};

    /**
     * Construtor que recebe um ArrayList.
     *
     * @param figuras ArrayList de figuras que será exibido na tabela.
     */
    public FigurasTableModel(ArrayList<Figura2D> figuras) {
        this.figuras = figuras;
    }

    /**
     * Método para retorno nome da coluna da tabela.
     *
     * @param column coluna que deseja saber o nome.
     * @return nome da coluna.
     */
    @Override
    public String getColumnName(int column) {
        return coluna[column];
    }

    /**
     * Método para retorno do numero de linhas.
     *
     * @return valor da quantidade de linhas.
     */
    @Override
    public int getRowCount() {
        return figuras.size();
    }

    /**
     * Método para retorno do numero de colunas.
     *
     * @return valor da quantidade de colunas.
     */
    @Override
    public int getColumnCount() {
        return coluna.length;
    }

    /**
     * Método para retorno do nome do objeto selecionado.
     *
     * @param linha linha do objeto.
     * @param coluna coluna do objeto
     * @return objeto da determinada linha e coluna.
     */
    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return figuras.get(linha).getClass().getSimpleName() + (linha + 1);
        }
        return null;
    }

    /**
     * Método utilizado para atualizar o ArrayList de figuras.
     *
     * @param figuras ArrayList de figuras que será exibido na tabela.
     */
    public void setFiguras(ArrayList<Figura2D> figuras) {
        this.figuras = figuras;
    }

    /**
     * Metodo utilizado para retorna a Figura2D da linha passada como parâmetro.
     *
     * @param linha inteiro referente a linha desejada.
     * @return Figura2D da linha desejada.
     */
    public Figura2D getFigura(int linha) {
        return figuras.get(linha);
    }

    /**
     * Metodo utilizado para atualizar a tabela.
     */
    public void atualizarTabela() {
        this.fireTableDataChanged();
    }

}
