package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
    public static void main(String[] args) {

    }
}

abstract class Persona {
    public Persona(String nom) {
        nombre = nom;
    }

    public String dameNombre() {
        return nombre;
    }

    public abstract String dameDescripcion();

    private String nombre;
}

class Empleado2 {
    public Empleado2(String nom, double sue, int agno, int mes, int dia) {
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public double dameSueldo() { //GETTER
        return sueldo;
    }

    public Date dameFechaContrato() { //GETTER
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {//SETTER
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    private double sueldo;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente = 1;

}
