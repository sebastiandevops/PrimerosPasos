package poo;

import java.util.*;

public class uso_empleado {
    public static void main(String[] args) {
        /*Empleado empleado1 = new Empleado("Maicol Pérez", 85000, 1990, 12, 17);
        Empleado empleado2 = new Empleado("Bairon Suárez", 95000, 1995, 06, 02);
        Empleado empleado3 = new Empleado("Yeimi Sánchez", 105000, 2002, 03, 15);
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        System.out.println("Nombre: " + empleado1.dameNombre() +
        ". Sueldo: " + empleado1.dameSueldo() + ". Fecha de alta: " + empleado1.dameFechaContrato());
        System.out.println("Nombre: " + empleado2.dameNombre() +
        ". Sueldo: " + empleado2.dameSueldo() + ". Fecha de alta: " + empleado2.dameFechaContrato());
        System.out.println("Nombre: " + empleado3.dameNombre() +
        ". Sueldo: " + empleado3.dameSueldo() + ". Fecha de alta: " + empleado3.dameFechaContrato());*/
        Empleado[] misEmpleados = new Empleado[4];

        misEmpleados[0] = new Empleado("Maicol Pérez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Bairon Suárez", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado("Yeimi Sánchez", 105000, 2002, 03, 1);
        misEmpleados[3] = new Empleado("Coraima Moya");
        /*for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i].subeSueldo(5);
        }*/

        for (Empleado e: misEmpleados) {
            e.subeSueldo(5);
        }

        /*for (int i = 0; i < misEmpleados.length; i++) {
            System.out.println("Nombre: " + misEmpleados[i].dameNombre()
            + ". Sueldo: " + misEmpleados[i].dameSueldo()
            + ". Fecha de alta: " + misEmpleados[i].dameFechaContrato());
        }*/

        for (Empleado e: misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre()
            + ". Sueldo: " + e.dameSueldo()
            + ". Fecha de alta: " + e.dameFechaContrato());
        }
    }
}

class Empleado {
    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
    }

    public Empleado(String nom) {
        this(nom, 30000, 2000, 01, 01);
    }

    public String dameNombre() { //GETTER
        return nombre;
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

    private String nombre;
    private double sueldo;
    private Date altaContrato;
}
