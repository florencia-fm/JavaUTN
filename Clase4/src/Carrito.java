import java.time.LocalDate;
public class Carrito {

    // Atributos
    private Producto[] productos;
    private LocalDate fecha;

    // Constructor
    public Carrito(){
        this.productos = new Producto[3];
        this.fecha = LocalDate.now();
    }


    // Métodos
    public Producto[] getProductos(){
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
