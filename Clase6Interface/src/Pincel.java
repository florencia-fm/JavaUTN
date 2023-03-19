public class Pincel implements Dibuja {
    // Atributos
    private int grosor;

    // Constructor
    public Pincel(int grosor) {
        this.grosor = grosor;
    }

    // Implementación de método Dibujar, de la Interface Dibuja
    public void dibujar() {
        System.out.println("Dibujando con Pincel, grosor " + grosor);
    }
}
