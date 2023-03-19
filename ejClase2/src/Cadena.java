public class Cadena {
    // Atributos
    private String cadena;
    private char letra;
    private int apariciones;

    // Contructor
    public Cadena(String cadena) {
        this.cadena = cadena;
    }

    // Métodos
    public int contarApariciones(char letra){
        this.letra = letra;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra){
                apariciones++;
            }
        }
        return apariciones;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getApariciones() {
        return apariciones;
    }

}
