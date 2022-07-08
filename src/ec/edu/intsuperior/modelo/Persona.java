package ec.edu.intsuperior.modelo;

public class Persona {

    String cedula;
    String nombre;
    String apellido;
    String direccion;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCi() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
 }

    @Override
    public String toString() {
        return "Los datos de la persona solicitada es:\n"
                + "Cedula:" + getCi() + "\n"
                + "Nombre:" + getNombre() + "\n"
                + "Apellido" + getApellido() + "\n"
                + "Direccion" + getDireccion();
