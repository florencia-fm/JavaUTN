import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Florencia", "Miguez", LocalDate.parse("1990-07-05"));
        Producto jabonEnPolvo = new Producto("jabón en polvo", "ADS490", 40);
        Producto esponjas = new Producto("esponjas", "ADS402", 10);
        Producto chocolates = new Producto("chocolates","TYU948",100);
        Descuento descuento = new DescuentoPorcentajeConTope(20, 10);
        Carrito carrito = new Carrito(persona, descuento);

        try {
            carrito.agregarProducto(jabonEnPolvo);
            carrito.agregarProducto(esponjas);
            carrito.agregarProducto(chocolates);
            System.out.println(carrito.precio());
        } catch (PrecioInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}