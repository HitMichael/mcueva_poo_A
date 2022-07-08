package ec.edu.intsuperior.modelo;

public class Clase_1 {

    String nombre;
    String apellido;
    int edad;

    public static void nombre() {
        System.out.println("Michael");
    }

    public static void apellido() {
        System.out.println("De la Cueva");

    }

    public static void ubicacion() {
        System.out.println("Cayambe");
    }

    public static void pais() {
        System.out.println("Ecuador");
    }

    public static void anios() {
        System.out.println("21 anios");
    }

    public void nombre1() {

        Clase_1 c1 = new Clase_1();

        System.out.println("Mi nombre es:   " + c1.nombre);
        c1.nombre = "Michael";
        System.out.println("Mi apellido es:   " + c1.apellido);
        c1.apellido = "De la Cueva";
    }
}
