import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // ej 1 a
        System.out.println("Ejercicio 1a");
        Cadena cadena = new Cadena("nos vemos pronto");
        System.out.println(cadena.contarApariciones('o'));
        System.out.println("--------------------------------------------------------------------");

        // ej 1 b
        System.out.println("Ejercicio 1b");
        Numeros numeros = new Numeros(7, 2, 4);
        int numerosOrdenados[] = numeros.ordernar(false);

        for (int num:numerosOrdenados) {
            System.out.println(num);
        }
        System.out.println("--------------------------------------------------------------------");

        // ej 1c
        System.out.println("Ejercicio 1c");
        int vectorNum[] = {4, 7, 2};
        VectorNumeros vector = new VectorNumeros(vectorNum, 3);
        System.out.println(vector.sumarMayorAx());
        System.out.println("--------------------------------------------------------------------");

        // --------------------------------------------------------------------

        // cifrado cesar
        System.out.println("Cifrado Cesar");
        CifradoCesar cifrado = new CifradoCesar("ahola que tal");
        System.out.println(cifrado.cifrar());
    }
}