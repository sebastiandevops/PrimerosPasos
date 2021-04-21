import java.io.EOFException;

import javax.swing.JOptionPane;

public final class CompruebaMail {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String elMail = JOptionPane.showInputDialog("Introduce mail");

        try {
            examinaMail(elMail);
        } catch (Exception e) {
            System.out.println("el Email no es correcto");
        }
    }

    static void examinaMail(String mail) throws EOFException {
        int arroba = 0;
        boolean punto = false;
        final int myNumber = 7;
        if (mail.length() <= myNumber) {
            //ArrayIndexOutOfBoundsException miExcepcion;
            //miExcepcion = new ArrayIndexOutOfBoundsException();
            throw new EOFException();
        } else {
            for (int i = 0; i < mail.length(); i++) {
                if (mail.charAt(i) == '@') {
                    arroba++;
                }
                if (mail.charAt(i) == '.') {
                    punto = true;
                }
            }
            if (arroba == 1 && punto) {
                System.out.println("Es correcto");
            } else {
                System.out.println("No es correcto");
            }
        }
    }
}
