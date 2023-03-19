import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class PruebaArchivo {
    public static void main(String[] args) throws IOException  {
        // Asignamos a archivo la ruta
        String archivo = "C:\\Users\\fmigu\\Desktop\\archivo.txt";

        // Obtenemos todas las lineas del archivo
        for (String linea: Files.readAllLines(Paths.get(archivo))){
            System.out.println(linea);
        }

        // Escribimos en un archivo llamado "otroArchivo"
        Files.writeString(Paths.get("C:\\Users\\fmigu\\Desktop\\otroarchivo.txt"), "Hola \n que tal?\n");

        // Si escribimos otra cosa de esta forma lo modificaríamos
        Files.writeString(Paths.get("C:\\Users\\fmigu\\Desktop\\otroarchivo.txt"), "Adios");

    }
}
