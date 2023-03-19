public abstract class Figura {
    // Atributos comunes a todas las figuras
    protected double area;
    protected double perimetro;

    // Métodos get
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    /* Métodos abstractos, cada figura "hija" sobreescribirá estos métodos para hacer los cálculos de estos atributos
    a su manera */
    protected abstract void calcularArea();
    protected abstract void calcularPerimetro();

}
