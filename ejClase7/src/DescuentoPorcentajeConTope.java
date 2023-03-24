public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
    // Atributos de este descuento
    private double tope;

    // Constructor
    public DescuentoPorcentajeConTope(double porcentaje, double tope) {
    super(porcentaje);
    this.tope = tope;
}
    // Sobreescritura del método heredado de la clase madre DescuentoPorcentaje
    @Override
    protected double calcularDescuento(double precio) throws PrecioInvalidoException {
        if (precio <= 0) {
            throw new PrecioInvalidoException(precio);
        } else {
            double descuento = super.calcularDescuento(precio);
            if (descuento > tope) {
                return tope;
            } else {
                return descuento;
            }
        }
    }
}


