public class Boligrafo implements Dibuja, TieneTinta {

    // Atributos
    private String color;
    private Boolean tieneTinta;

    // Constructor
    public Boligrafo(String color) {
        this.color = color;
        this.tieneTinta = true;
    }

    // Métodos de clase
    /*public void recargarTinta(){
        this.tieneTinta = true;
    }*/

    // Implementación de método Dibujar, de la Interface Dibuja
    public void dibujar() {
        if (this.tieneTinta){
            System.out.println("Dibujando con Boligrafo");
        } else {
            System.out.println("Sin tinta");
        }
    }

    public void recargarTinta(){
        this.tieneTinta = true;
    }
}
