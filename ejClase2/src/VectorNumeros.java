public class VectorNumeros {
    // Atributos
    private int vectorNum[];
    private int x;

    // Constructor
    public VectorNumeros(int[] vectorNum, int x) {
        this.vectorNum = vectorNum;
        this.x = x;
    }

    // Métodos
    public int sumarMayorAx(){
        int suma = 0;
        for (int num:vectorNum) {
            if (num > x){
                suma += num;
            }
        }
        return suma;
    }

    public int[] getVectorNum() {
        return vectorNum;
    }

    public void setVectorNum(int[] vectorNum) {
        this.vectorNum = vectorNum;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
