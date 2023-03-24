public class DescuentoPorcentaje extends Descuento {
    // Atributos de este descuento
    protected double porcentaje;
    protected double precio;

    // Constructor
    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    // Sobreescritura del método heredado de la clase madre Descuento
    @Override
    protected double calcularDescuento(double precio) throws PrecioInvalidoException {
        if (precio <= 0) {
            throw new PrecioInvalidoException(precio);
        } else {
            return (precio * porcentaje / 100);
        }
    }
}