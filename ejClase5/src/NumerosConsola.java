import java.util.Scanner;
public class NumerosConsola {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        boolean ascendente;
        Scanner scn = new Scanner(System.in);

        // Ingreso de datos
        try {
            System.out.println("Ingrese 3 números separados por un espacio");
            String numerosStr = scn.nextLine();
                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = Integer.parseInt(numerosStr.split(" ")[i]);
                }
            } catch (Exception e) {
            System.out.println("Error en el ingreso de datos.");
        }

        System.out.println("Ingrese el orden: 'a' para ascendente o 'd' para descendente");
        char orden = scn.nextLine().charAt(0);

        // Validar orden
        if (orden == 'a') {
            ascendente = true;
        } else if (orden == 'd') {
            ascendente = false;
        } else {
            System.out.println("Error: el orden debe ser 'a' o 'd'");
            return;
        }

        // Ordenamiento por burbuja
        if (ascendente){
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length - 1; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        int aux = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = aux;
                    }
                }
            }
        } else {
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length - 1; j++) {
                    if (numeros[j] < numeros[j + 1]) {
                        int aux = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = aux;
                    }
                }
            }
        }

        // Mostrar resultados
        for (int num:numeros) {
            System.out.println(num);
        }
    }
}
