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
 * Classe que define uma Figura2D como um Circulo.
 *
 * @author Rodrigo dos Santos Pequeno - 201600114780
 */
public class Circulo extends Figura2D {

    private int raio;

    /**
     * Construtor de um circulo
     *
     * @param inicial Point(x,y) que define a localização inicial do circulo.
     * @param cor Color utilizada para define a cor do circulo.
     * @param preencher booleano que define se o circulo será apenas o contorno
     * ou totalmente preenchido.
     * @param raio Determina o raio do circulo.
     */
    public Circulo(Point inicial, Color cor, boolean preencher, int raio) {
        super(inicial, cor, preencher);
        this.raio = raio;
    }

    /**
     * Método para retorno do raio do circulo.
     *
     * @return valor do raio do circulo.
     */
    public int getRaio() {
        return raio;
    }

    /**
     * Método para definir o raio do circulo.
     *
     * @param raio novo valor para o raio do circulo.
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }

    /**
     * Método que define como o circulo será desenhado.
     *
     * @param g
     */
    @Override
    public void desenharFigura(Graphics g) {
        g.setColor(cor);
        if (preencher) {
            g.fillOval(inicial.x - raio, inicial.y - raio, 2 * raio, 2 * raio);

        } else {
            g.drawOval(inicial.x - raio, inicial.y - raio, 2 * raio, 2 * raio);
        }
    }
}
