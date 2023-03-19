import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Manejo de Menu
        Scanner scn = new Scanner(System.in);
        System.out.println("1 para Círculo, 2 para Rectángulo");
        String opcion = scn.nextLine();

        // Definimos una variable figura, usando la clase abstracta "Figura" para el tipo de variable
        Figura fig;
        switch (opcion){
            case "1":
                // Inicializamos la variable con un Círculo, que hereda de la clase Figura.
                fig = new Circulo(1);
                break;
            case "2":
                // Inicializamos la variable con un Rectángulo, que hereda de la clase Figura.
                fig = new Rectangulo(2,2);
                break;
            // Si quisiera agregar la figura Triángulo, sólo debería crear la clase Triangulo y agregarla a este switch
            default:
                throw new RuntimeException("No se ingreso una opción correcta");
        }

        /* Independientemente de cual figura hayamos usaro en la ejecución, estos métodos son parte de la lógica de una
        * Figura (un Circulo tiene área, un Rectángulo tambiém, etc.), por lo que podemos utilizarlos sin encesidad de
        * saber si hacen referencia a un círculo o a un rectángulo específicamente */
        double area = fig.getArea();
        double perimetro = fig.getPerimetro();
                System.out.println("Area: " + area + ". Perímetro: " + perimetro);


    }
}