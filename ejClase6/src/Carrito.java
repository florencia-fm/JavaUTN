import java.time.LocalDate;

public class Carrito {
    // Atributos
    private Persona persona;
    private Producto[] productos;
    private LocalDate fechaCompra;
    private double descuento;

    // Constructor
    public Carrito(Persona persona) {
        this.persona = persona;
        this.productos = new Producto[3];
        fechaCompra = LocalDate.now();
    }

    // Métodos
    public double precio(Descuento descuento){
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

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
