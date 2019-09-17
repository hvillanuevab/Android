package pe.com.android.aprendiendoandroid.beans;

public class Persona {

    int id;
    String nombre;
    String apellido;
    String foto;

    public Persona(int id, String nombre, String apellido, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
