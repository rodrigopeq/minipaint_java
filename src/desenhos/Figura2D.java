package desenhos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

/**
 * Classe abstrata referente a figuras geometrica.
 *
 * @author Rodrigo dos Santos Pequeno - 201600114780
 */
public abstract class Figura2D implements Serializable {

    protected Point inicial;
    protected Color cor;
    protected boolean preencher;

    /**
     * Construtor de uma figura.
     *
     * @param inicial Point(x,y) que define a localização inicial do figura.
     * @param cor Color utilizada para define a cor da figura.
     * @param preencher booleano que define se o objeto será apenas o contorno
     * ou totalmente preenchida
     */
    public Figura2D(Point inicial, Color cor, boolean preencher) {
        this.inicial = inicial;
        this.cor = cor;
        this.preencher = preencher;
    }

    /**
     * Método para retorno se a figura é preenchida.
     *
     * @return true se for preenchida.
     */
    public boolean isPreencher() {
        return preencher;
    }

    /**
     * Método para definir se a figura é preenchida.
     *
     * @param preencher true se for preenchida.
     */
    public void setPreencher(boolean preencher) {
        this.preencher = preencher;
    }

    /**
     * Método para retorno do ponto inicial para a figura.
     *
     * @return valor (x,y) referente ao ponto inicial.
     */
    public Point getInicial() {
        return inicial;
    }

    /**
     * Método para definir o novo ponto inicial para a figura.
     *
     * @param inicial novo valor (x,y) do ponto inicial.
     */
    public void setInicial(Point inicial) {
        this.inicial = inicial;
    }

    /**
     * Método para retorno da cor da figura.
     *
     * @return Color da figura.
     */
    public Color getCor() {
        return cor;
    }

    /**
     * Método para definir a nova cor da figura.
     *
     * @param cor nova Color da figura.
     */
    public void setCor(Color cor) {
        this.cor = cor;
    }

    /**
     * Método que define como a figura será desenhada.
     *
     * @param g
     */
    public abstract void desenharFigura(Graphics g);

}
