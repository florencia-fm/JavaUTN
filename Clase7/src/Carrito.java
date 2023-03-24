import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Carrito {
    // Atributos
    private Collection<Producto> productos;
    private LocalDate fecha;

    // Constructor
    public Carrito(){
        this.productos = new ArrayList<>();
        this.fecha = LocalDate.now();
    }

    // Métodos
    public Collection<Producto> getProductos() {
        Collection<Producto> items = new ArrayList<>();
        items.addAll(this.productos);
        return items;
    }

    public LocalDate getFecha() {return fecha;}

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void agregarProducto(Producto prod) {
        this.productos.add(prod);
    }
}
