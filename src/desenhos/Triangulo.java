/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenhos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * Classe que define uma Figura2D como um Triângulo.
 *
 * @author Rodrigo dos Santos Pequeno - 201600114780
 */
public class Triangulo extends Figura2D {

    private int base;
    private int altura;

    /**
     * Construtor de um triângulo.
     *
     * @param inicial Point(x,y) que define a localização inicial do triângulo.
     * @param cor Color utilizada para define a cor do triângulo.
     * @param preencher booleano que define se o triângulo será apenas o
     * contorno ou totalmente preenchido.
     * @param base Determina a base do triângulo.
     * @param altura Determina a altura do triângulo.
     */
    public Triangulo(Point inicial, Color cor, boolean preencher, int base, int altura) {
        super(inicial, cor, preencher);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método para retorno da base do triângulo.
     *
     * @return valor da base.
     */
    public int getBase() {
        return base;
    }

    /**
     * Método para definir a base do triângulo.
     *
     * @param base novo valor para a base do triângulo
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Método para retorno da altura do triângulo.
     *
     * @return valor da altura.
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Método para definir a altura do triângulo.
     *
     * @param altura novo valor para a altura do triângulo.
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Método que define como o triângulo será desenhado.
     *
     * @param g
     */
    @Override
    public void desenharFigura(Graphics g) {
        g.setColor(cor);
        int metadeBase = (base / 2);
        int metadeAltura = (altura / 2);
        int[] x = {inicial.x, inicial.x - metadeBase, inicial.x + metadeBase};
        int[] y = {inicial.y - metadeAltura, inicial.y + metadeAltura, inicial.y + metadeAltura};
        if (preencher) {
            g.fillPolygon(x, y, 3);
        } else {
            g.drawPolygon(x, y, 3);
        }

    }
}
