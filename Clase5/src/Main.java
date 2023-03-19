public class Main {
    public static void main(String[] args) {
        // Usamos un vector de prueba, esto debería entrar como parámetro en el futuro.
        int numeros[] = new int[] {1, 37, 16};

        // Lo mostramos por pantalla, este paso no es necesario
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Utilizamos la función "sumatoria", definida abajo
        int resultado = sumatoria(numeros);

        // Calculamos el promedio
        resultado = resultado / numeros.length;
        System.out.println(resultado);

        // Repetimos pero habiendo modificado un elemento
        numeros[1] = 20;
        resultado = sumatoria(numeros);
        resultado = resultado / numeros.length;
        System.out.println(resultado);
    }

    private static int sumatoria(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        return suma;
    }
}