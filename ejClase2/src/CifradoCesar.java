public class CifradoCesar {
    // Atributos
    private String cadena;
    private String abecedario = "abcdefghijklmnopqrstuvwxyz ";

    // Constructor

    public CifradoCesar(String cadena) {
        this.cadena = cadena;
    }

    // Métodos
    public String cifrar(){
        String[] cesarPartido = cadena.split("");
        String[] abecedarioPartido = abecedario.split("");
        String finalString = "";
        for (String letra:cesarPartido){
            for (int i = 0; i < abecedarioPartido.length; i++) {
                if (letra.equals(abecedarioPartido[i])){
                    if (i < 25){
                        finalString = finalString.concat(abecedarioPartido[i+2]);
                    } else {
                        finalString = finalString.concat(abecedarioPartido[i-25]);
                    }
                }
            }
        }
        return finalString;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
}
