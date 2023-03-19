import java.time.LocalDate;

public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;

    // Constructor
    public Persona(String nombre, String apellido, LocalDate fechaNac){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    // Métodos
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public LocalDate getFechaNac(){
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac){
        this.fechaNac = fechaNac;
    }


}
