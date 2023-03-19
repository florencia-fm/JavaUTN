import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Prueba ej 1
        Numeros.main(new int[]{4, 7, 2}, 'a');

        System.out.println("----------------------");

        // Prueba ej Archivos
        String ruta = "./recursos/archivo.txt";
        try {
            RutaArchivo.main(ruta, 'm');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("----------------------");

        // Prueba Cifrado Cesar
        boolean cifrado = true;
        String rutaEntrada = "./recursos/archivoCifradoEntrada.txt";
        String rutaSalida = "./recursos/archivoCifradoSalida.txt";
        int desplazo = 5;

        try {
            CifradoCesar.main(cifrado, rutaEntrada, rutaSalida, desplazo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("----------------------");
    }
}