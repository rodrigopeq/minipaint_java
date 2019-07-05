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
 * Classe que define uma Figura2D como um Retângulo.
 *
 * @author Rodrigo dos Santos Pequeno - 201600114780
 */
public class Retangulo extends Figura2D {

    private int base;
    private int altura;

    /**
     * Construtor de um retângulo.
     *
     * @param inicial Point(x,y) que define a localização inicial do retângulo.
     * @param cor Color utilizada para define a cor do retângulo.
     * @param preencher booleano que define se o retângulo será apenas o
     * contorno ou totalmente preenchido.
     * @param base Determina a base do retângulo.
     * @param altura Determina a altura do retângulo.
     */
    public Retangulo(Point inicial, Color cor, boolean preencher, int base, int altura) {
        super(inicial, cor, preencher);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método para retorno da base do retângulo.
     *
     * @return valor da base.
     */
    public int getBase() {
        return base;
    }

    /**
     * Método para definir a base do retângulo.
     *
     * @param base novo valor para a base do retângulo
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Método para retorno da altura do retângulo.
     *
     * @return valor da altura.
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Método para definir a altura do retângulo.
     *
     * @param altura novo valor para a altura do retângulo.
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Método que define como o retângulo será desenhado.
     *
     * @param g
     */
    @Override
    public void desenharFigura(Graphics g) {
        g.setColor(cor);
        if (preencher) {
            g.fillRect(inicial.x - (base / 2), inicial.y - (altura / 2), base, altura);
        } else {
            g.drawRect(inicial.x - (base / 2), inicial.y - (altura / 2), base, altura);;
        }
    }

}
