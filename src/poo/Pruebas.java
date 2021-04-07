package poo;

public class Pruebas {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Pepe");
        Empleados trabajador2 = new Empleados("Paco");
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(Empleados.dameIdSiguiente());
    }
}


class Empleados {
    public Empleados(String nom) {
        nombre = nom;
        seccion = "Administración";
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public void cambiaSeccion(String seccion){ //SETTER
        this.seccion = seccion;
    }

    public String devuelveDatos() {
        return "El nombre es: " + nombre + " y la sección es: " + seccion +
        " y el Id es: " + Id;
    }

    public static String dameIdSiguiente() {
        return "El Id siguiente es: " + IdSiguiente;
    }

    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente = 1;
}
