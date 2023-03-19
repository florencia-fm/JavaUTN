public class Numeros {
    public static void main(int[] numeros, char orden) {
        // Declaración de variables
        boolean ascendente;

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
