public class Circulo extends Figura{
    // Atributos de esta figura
    private double radio;

    // Al construir una figura, automáticamente se calcula el área y el perímetro
    public Circulo(double radio){
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }

    /* Sobreescribimos los métodos heredados de la clase madre Figura
    * Los atributos área y perímetro son visibles en el ámbito de Círculo porque en la clase Figura se
    * establecieron como protected en lugar de private */

    @Override
    protected void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }
}
