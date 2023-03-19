import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Encoding {
    public static void main(String[] args) throws IOException {
        Path utfFile = Files.createTempFile("some", ".txt");
        Files.write(utfFile, "un texto \n con eñes ".getBytes()); // UTF 8
        Files.write(utfFile, (System.lineSeparator() + "y acentos á ").getBytes(), StandardOpenOption.APPEND);

        System.out.println(Files.readAllLines(utfFile).size());

        for (String line: Files.readAllLines(utfFile)){
            System.out.println(line);
        }

        Path iso88591File = Files.createTempFile("some", ".txt");
        Files.write(iso88591File, "otro texto con eñes ".getBytes(StandardCharsets.ISO_8859_1)); // ISO 8859-1

        // Si queremos borras estos archivos temporales debemos hacer lo siguiente
        utfFile.toFile().deleteOnExit();
        iso88591File.toFile().deleteOnExit();
    }
}
