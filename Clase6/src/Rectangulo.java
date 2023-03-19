public class Rectangulo extends Figura{
    // Atributos de esta figura
    private double base;
    private double altura;

    // Al construir una figura, automáticamente se calcula el área y el perímetro
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    /* Sobreescribimos los métodos heredados de la clase madre Figura
     * Los atributos área y perímetro son visibles en el ámbito de Rectángulo porque en la clase Figura se
     * establecieron como protected en lugar de private */

    @Override
    protected void calcularArea() {
        area = base * altura;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = (2 * base) + (2 * altura);
    }
}
