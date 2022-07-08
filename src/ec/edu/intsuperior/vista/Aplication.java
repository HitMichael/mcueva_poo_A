package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona; 
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        System.out.println("Ingrese el numero de la cedula de la persona 1");
        p1.setCedula(leer.next());
        System.out.println("Ingresa el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingresa el apellido de la persona");
        p1.setApellido(leer.next());

       System.out.println("Los datos de la persona solicitada es:  "\n"
                + "C1:" + getCedula() + "\n"
                + "Nombre:" + getNombre() + "\n"
                + "Apellido" + getApellido() + "\n"
                + "Direccion" + getDireccion() );
        
        System.out.println(p1.toString());

        System.out.println("Ingrese el numero de la cedula de la persona 2");
        p2.setCedula (leer.next());
        System.out.println("Ingresa el nombre de la persona");
        p2.setNombre(leer.next());
        System.out.println("Ingresa el apellido de la persona");
        p2.setApellido(leer.next());

        System.out.println(p2.toString());
    }

}
