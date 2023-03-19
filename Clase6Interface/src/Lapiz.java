public class Lapiz implements Dibuja {
    // Atributos
    private String color;

    // Constructor
    public Lapiz(String color) {
        this.color = color;
    };

    // Implementación de método Dibujar, de la Interface Dibuja
    public void dibujar() {
        System.out.println("Dibujando con Lapiz, color " + color);
    }
}
