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
    protected double calcularDescuento(double base) {
        double descuento = super.calcularDescuento(base);
        if (descuento > tope) {
            return tope;
        } else {
            return descuento;
        }
    }
}


