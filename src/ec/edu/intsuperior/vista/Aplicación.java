package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;

public class Aplicación {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        System.out.print("Ingrese el número de cedula de la persona 1 por favor:  ");
        p1.setCedula(leer.next());
        System.out.print("Ingrese el nombre de la persona 1 por favor:  ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese el apellido de la persona 1 por favor:  ");
        p1.setApellido(leer.next());
        System.out.print("Ingrese la dirección de la persona 1 por favor:   ");
        p1.setDirección(leer.next());

        System.out.println(p1.toString());  
        
        System.out.print("Los datos solicitados de la persona 1 son:  \n"
                + "Cedula:  " + p1.getCedula() + "\n"
                + "Nombre y Apeliido:  " + p1.getNombre() + " " + p1.getApellido() + "\n"
                + "Dirección:  " + p1.getDirección() + "\n");

        
        System.out.print("Ingrese el número de cedula de la persona 2 por favor:");
        p2.setCedula(leer.next());
        System.out.print("Ingrese el nombre de la persona 2 por favor:");
        p2.setNombre(leer.next());
        System.out.print("Ingrese el apellido de la persona 2 por favor:  ");
        p2.setApellido(leer.next());
        System.out.print("Ingrese la dirección de la persona2 por favor:");
        p2.setDirección(leer.next());

        System.out.println("-----GRACIAS----"); 
    }

}
