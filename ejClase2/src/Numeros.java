public class Numeros {
    // Atributos
    private int num1, num2, num3;
    private boolean ascendente = true;

    // Constructor
    public Numeros(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    // Métodos
    public int[] ordernar(boolean ascendente){
        int vector[] = {num1, num2, num3};

        if (ascendente){
            for (int i = 0; i < vector.length; i++) {
                for (int j = 0; j < vector.length - 1; j++) {
                    if (vector[j] > vector[j + 1]) {
                        int aux = vector[j];
                        vector[j] = vector[j + 1];
                        vector[j + 1] = aux;
                    }
                }
            }
        } else {
            for (int i = 0; i < vector.length; i++) {
                for (int j = 0; j < vector.length - 1; j++) {
                    if (vector[j] < vector[j + 1]) {
                        int aux = vector[j];
                        vector[j] = vector[j + 1];
                        vector[j + 1] = aux;
                    }
                }
            }
        }

        return vector;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public boolean isAscendente() {
        return ascendente;
    }

    public void setAscendente(boolean ascendente) {
        this.ascendente = ascendente;
    }
}
