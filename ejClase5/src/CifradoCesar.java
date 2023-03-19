import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CifradoCesar {
    public static void main(boolean cifrado, String rutaEntrada, String rutaSalida, int desplazo) throws IOException {
        // Declaración de variables
        Path archivoEntrada = Paths.get(rutaEntrada);
        Path archivoSalida = Paths.get(rutaSalida);

        String abecedario = "abcdefghijklmnopqrstuvwxyz ";
        String[] abecedarioPartido = abecedario.split("");
        String finalString = "";

        // Cifrado
        try{
            if (cifrado){
                for (String line: Files.readAllLines(archivoEntrada)){
                    String[] linePartida = line.split("");
                    for (String letra:linePartida){
                        for (int i = 0; i < abecedarioPartido.length; i++) {
                            if (letra.equals(abecedarioPartido[i])){
                                if (i < (27 - desplazo)){
                                    finalString = finalString.concat(abecedarioPartido[i+desplazo]);
                                } else {
                                    finalString = finalString.concat(abecedarioPartido[i-(27 - desplazo)]);
                                }
                            }
                        }
                    }
                    Files.write(archivoSalida, finalString.getBytes(StandardCharsets.ISO_8859_1));
                }
            } else {
                for (String line: Files.readAllLines(archivoEntrada)){
                    String[] linePartida = line.split("");
                    for (String letra:linePartida){
                        for (int i = 0; i < abecedarioPartido.length; i++) {
                            if (letra.equals(abecedarioPartido[i])){
                                if (i < desplazo){
                                    finalString = finalString.concat(abecedarioPartido[i+(27 - desplazo)]);
                                } else {
                                    finalString = finalString.concat(abecedarioPartido[i-desplazo]);
                                }
                            }
                        }
                    }
                }
                Files.write(archivoSalida, finalString.getBytes(StandardCharsets.ISO_8859_1));
            }
            System.out.println("El procesó terminó correctamente.");
        }catch (Exception e){
            System.out.println("El proceso  falló.");
        };


    }
}
