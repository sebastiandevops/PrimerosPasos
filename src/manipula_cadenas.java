public class manipula_cadenas {
    public static void main(String[] args) {
        String nombre = "Juan Felipe";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " caracteres.");
        System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));
        int ultima = nombre.length();
        System.out.println("La última letra de " + nombre + " es " + nombre.charAt(ultima - 1));
    }
}
