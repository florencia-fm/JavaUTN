public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int x = 0;
        System.out.println(x);

        int numeros[] = new int[3];
        numeros[0] = 1;
        numeros[1] = 37;
        numeros[2] = 16;

        for(int indice=0;indice<numeros.length;indice++){
            System.out.println(numeros[indice]); // imprime por pantalla cada elemento
        }

        for (int num:numeros){
            System.out.println(num);
        }

        String txt2 = "hola que tal?";
        System.out.println(txt2);
        System.out.println(txt2.replace("hola", "chau"));
        System.out.println(txt2.replace("hola", "chau").toUpperCase());

        String txt3 = "home/user/doc";
        System.out.println(txt3.split("o"));

        String txt4 = "Quiero poner \" adentro ";
        System.out.println(txt4);

        for (int numero=1;numero<9;numero++){
            System.out.println(numero);
        }
    }
}