import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        // Arrays

        int numeros[] = new int[]{1,37,16};
        System.out.println(numeros);

        for (int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int numeros2[] = new int[3];
        numeros2[0] = 5;
        numeros2[1] = 78;
        numeros2[2] = 23;
        System.out.println(numeros2);

        for (int num:numeros2){
            System.out.println(num);
        }

        char letras[] = {'a','b','c','d'};
        System.out.println(letras);

        for (char letra:letras){
            System.out.println(letra);
        }

        // Strings

        String txt1 = "Hola!";
        String txt2 = "Chau!";
        System.out.println(txt2.charAt(2));

        String txt3 = txt1 + txt2;
        String txt4 = txt1 + " " + txt2;

        txt1.equals(txt2); // no usar == para comparar Strings
        txt1.equals(txt1);

        txt1.length();

        String str1 = "Prueba";
        String str2 = "Prueba";
        String str3 = new String ("Prueba");

        System.out.println(str1 == str2); // true --> str1 y str2 usan el mismo objeto
        System.out.println(str1 == str3); // false --> str3 es un objeto distinto
        System.out.println(str1.equals(str3));

        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        System.out.println(str1.contains("ue"));
        System.out.println(str1.contains("UE"));
        System.out.println(str1.startsWith("P"));
        System.out.println(str1.endsWith("o"));
        System.out.println(str1.replace("ba", "bita"));

        String txt5 = "hola qué tal?";
        System.out.println(txt5.replace("qué tal", "cómo va").toUpperCase());

        String saludo = "hola que tal?";
        String[] saludoPartido1 = saludo.split(" ");

        System.out.println(saludoPartido1[1]);

        for (String palabrita:saludoPartido1){
            System.out.println(palabrita);
        }

        String txt6 = "Quiero poner \" adentro ";
        System.out.println(txt6);

        String saltoDeLinea = "Hola \n que tal?";
        System.out.println(saltoDeLinea);

        String tabulador = "Hola \t cómo va?";
        System.out.println(tabulador);

        String contraBarra = "Hola \\ kc?";
        System.out.println(contraBarra);

    }
}