import java.util.*;
public class adivina_numeroii {
    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 100);
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int intentos = 0;
        do {
            intentos++;
            System.out.println("Introduce un número, por favor");
            num = entrada.nextInt();
            if (aleatorio < num) {
                System.out.println("El número es más bajo");
            } else if (aleatorio > num) {
                System.out.println("El número es más alto");
            }
        } while (num != aleatorio);
        System.out.println("Correcto, lo has conseguido en " + intentos + " intentos.");
        entrada.close();
    }
}
