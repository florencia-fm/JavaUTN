public class Main {
    public static void main(String[] args) {
        Pincel pincel = new Pincel(2);
        Lapiz lapiz = new Lapiz("Verde");
        Boligrafo boli = new Boligrafo("Azul");

        pincel.dibujar();
        lapiz.dibujar();
        boli.dibujar();

    }
}