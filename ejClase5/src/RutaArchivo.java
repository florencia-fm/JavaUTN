import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class RutaArchivo {
    public static void main(String ruta, char operacion) throws IOException {
        Path archivo = Paths.get(ruta);
        int total = 0;

        switch (operacion){
            case 's':
                total = 0;
                for (String line: Files.readAllLines(archivo)){
                    int numero = Integer.parseInt(line);
                    total += numero;
                }
                System.out.println("El total es: " + total);
                break;
            case 'm':
                total = 1;
                for (String line: Files.readAllLines(archivo)){
                    int numero = Integer.parseInt(line);
                    total *= numero;
                }
                System.out.println("El total es: " + total);
                break;
            default:
                System.out.println("Operación no válida");
        }
    }
}
