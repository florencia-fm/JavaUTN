public class Main {
    public static void main(String[] args) {

        // ej 1 a
        int a = 5;
        int b = 14;

        while (a-1 != b){
            System.out.println(a);
            a++;
        }

        // ej 1 b
        a = 5;
        b = 14;

        while (a-1 != b){
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }

        // ej 1 c
        a = 5;
        b = 14;
        boolean pares = false;

        if (pares == true) {
            while (a-1 != b){
                if (a % 2 == 0) {
                    System.out.println(a);
                }
                a++;
            }
        } else {
            while (a-1 != b){
                if (a % 2 != 0) {
                    System.out.println(a);
                }
                a++;
            }
        }

        // ej 1 d
        a = 5;
        b = 14;

        for (b = 14; b > a ; b--) {
            if (b % 2 == 0){
                System.out.println(b);
            }
        }


        // ej 2
        // variables
        double ingresos = 489084;
        int vehiculos = 2;
        int antiguedad = 3;
        int inmuebles = 0;
        boolean lujo = false;

        if ((ingresos >= 489083) || (vehiculos >= 0 && antiguedad < 5) || (inmuebles >= 3) || (lujo == true)){
            System.out.println("Pertenece a ingresos altos");
        } else {
            System.out.println("No pertenece a ingresos altos");
        }
    }
}