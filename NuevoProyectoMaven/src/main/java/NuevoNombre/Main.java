package NuevoNombre;

public class Main {
    public static void main(String[] args) {
        PersonaSinLombok unaPersonaSinLombok = new PersonaSinLombok("Nombre", "Apellido");
        Persona unaPersona = new Persona("Nombre", "Apellido");
        PersonaData unaPersonaData = new PersonaData("Nombre", "Apellido");

        System.out.println(unaPersonaSinLombok.toString());
        System.out.println(unaPersona.toString());
        System.out.println(unaPersonaData.toString());
    }
}