import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    // Atributos
    private Persona persona;
    private List<Producto> productos;
    private LocalDate fechaCompra;
    private Descuento descuento;

    // Constructor
    public Carrito(Persona persona, Descuento descuento) {
        this.persona = persona;
        this.productos = new ArrayList<>();
        fechaCompra = LocalDate.now();
        this.descuento = descuento;
    }

    // Métodos
    public double precio() throws PrecioInvalidoException {
        double base = 0;
        for (Producto producto:productos) {
            base += producto.getPrecio();
        }
        return base - descuento.calcularDescuento(base);
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
}
