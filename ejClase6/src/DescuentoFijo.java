public class DescuentoFijo extends Descuento {
    // Atributos de este descuento
    private double monto;

    // Constructor
    public DescuentoFijo(double monto) {
        this.monto = monto;
    }

    // Sobreescritura del método heredado de la clase madre Descuento
    @Override
    protected double calcularDescuento(double base) {
        return monto;
    }

}
