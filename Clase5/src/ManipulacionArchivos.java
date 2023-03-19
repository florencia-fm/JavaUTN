import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardCopyOption;

public class ManipulacionArchivos {
    public static void main(String[] args) throws IOException {

        // Obtenemos la ruta del archivo
        Path unArch = Paths.get("./recursos/algo.txt");
        System.out.println(unArch.toAbsolutePath());

        Path otroArch = Paths.get("./recursos/algoQueNoExiste.txt");
        System.out.println(Files.exists(otroArch));
        System.out.println(otroArch.toAbsolutePath());
        if (!Files.exists(otroArch)){
            Files.createFile(otroArch);
        }

        Path unTemporal = Files.createTempFile("unPrefijo", ".txt");
        System.out.println(unTemporal);

        System.out.println(Files.isDirectory(unTemporal));
        Files.copy(unArch, otroArch, StandardCopyOption.REPLACE_EXISTING);
        Files.move(otroArch, unTemporal, StandardCopyOption.REPLACE_EXISTING);
    }
}

// %appdata%
