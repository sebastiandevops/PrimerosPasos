import java.util.Scanner;

public class Evalua_edad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad, por favor");
        int edad = entrada.nextInt();
        if (edad >= 60) {
            System.out.println("Eres adulto mayor");
        } else if (edad >= 18 && edad < 60) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        entrada.close();
    }
}
