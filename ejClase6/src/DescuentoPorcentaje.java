public class DescuentoPorcentaje extends Descuento {
    // Atributos de este descuento
    protected double porcentaje;
    protected double base;

    // Constructor
    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    // Sobreescritura del método heredado de la clase madre Descuento
    @Override
    protected double calcularDescuento(double base) {
        return (base * porcentaje / 100);}
}
