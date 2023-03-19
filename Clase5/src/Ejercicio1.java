import java.util.Scanner;
public class Ejercicio1 {
/*
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese números separados por UN espacio");
        String numeros = scn.nextLine();
        int resultado = 0;
        for (String numerosStr: numeros.split(" ")) {
             int numero = Integer.parseInt(numerosStr);
             resultado = resultado + numero;
        }
        System.out.println(resultado);
    }
 */
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Ingrese números separados por UN espacio");
            String numeros = scn.nextLine();
            int resultado = 0;
            for (String numerosStr : numeros.split(" ")) {
                int numero = Integer.parseInt(numerosStr);
                resultado = resultado + numero;
            }
            System.out.println(resultado);
        }catch (Exception e){
            System.out.println("Error en el ingreso de datos.");
        }
    }
}
