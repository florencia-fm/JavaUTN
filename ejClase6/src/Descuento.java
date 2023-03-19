import java.time.LocalDate;

public abstract class Descuento {
    // Atributos comunes a todos los descuentos
    protected LocalDate comienzo;
    protected LocalDate fin;
    protected double base;

    // Métodos get
    public LocalDate getComienzo() {
        return comienzo;
    }

    public LocalDate getFin() {
        return fin;
    }

    // Método abstracto, cada descuento "hijo" sobreescribirá este método para hacer los cálculos de estos atributos
    protected abstract double calcularDescuento(double base);

}
