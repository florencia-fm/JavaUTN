import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Florencia", "Miguez",LocalDate.parse("1990-07-05"));
        Producto jabonEnPolvo = new Producto("jabón en polvo", "ADS490", 40);
        Producto esponjas = new Producto("esponjas", "ADS402", 10);
        Producto chocolates = new Producto("chocolates","TYU948",100);

        Producto[] productosCarrito = {jabonEnPolvo,esponjas,chocolates};

        Carrito carrito = new Carrito(persona);
        carrito.setProductos(productosCarrito);
        System.out.println(carrito.precio());
    }
}