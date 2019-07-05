package tratamento;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 * Classe utilizada para restringir em apenas numeros o que será digitado pelo
 * usuario.
 *
 * @author Rodrigo dos Santos Pequeno - 201600114780
 */
public class NameDocumentFilter extends DocumentFilter {

    public NameDocumentFilter() {
    }

    @Override
    public void insertString(FilterBypass fb, int offs, String str, AttributeSet a)
            throws BadLocationException {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return;
            }
        }
        fb.insertString(offs, str, a);
    }

    @Override
    public void replace(FilterBypass fb, int offs, int length, String str, AttributeSet a)
            throws BadLocationException {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return;
            }
        }
        fb.replace(offs, length, str, a);
    }
}
