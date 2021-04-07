import javax.swing.JOptionPane;

public class factorial {
    public static void main(String[] args) {
        int result = 1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        for (int i = num; i > 0; i--) {
            result = result * i;
        }
        System.out.println("El factorial de " + num + " es igual a " + result);
    }
}
