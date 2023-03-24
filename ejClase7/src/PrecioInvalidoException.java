public class PrecioInvalidoException extends Exception {
    // Atributo
    private final double precio;

    // Constructor
    public PrecioInvalidoException(double precio) {
        this.precio = precio;
        if (precio < 0) {
            System.out.println("No se puede calcular un descuento con un precio negativo");
        } else if (precio == 0) {
            System.out.println("No se puede calcular un descuento con un precio igual a cero");
        }
    }
}
