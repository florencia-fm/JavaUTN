public class Sumatoria {
    public static void main(String[] args) {
        int resultado = 0;
        for (int i = 0; i < args.length; i++) {
            int numero = Integer.parseInt(args[i]);
            resultado = resultado + numero;
        }
        System.out.println("La suma es: " + resultado);
    }
}
