package ec.edu.intsuperior.modelo;

public class Persona {

    String cedula;
    String nombre;
    String apellido;
    String dirección;

    private static class TipoGenero {

        public TipoGenero() {
        }
    }

    public enum genero {
        MACULINO, FEMENINO
    }
    TipoGenero genero;

    public Persona() {

    }

    public Persona(String cedula, String nombre, String apellido, String dirección, TipoGenero genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = dirección;
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public TipoGenero getGenero() {
        return genero;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Los datos solicitados de la persona son:" + "Cedula: " + getCedula() + "Nombre: " + getNombre()
                + "Apellido: " + getApellido() + "Dirección" + getDirección();
    }
}
