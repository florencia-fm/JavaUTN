package NuevoNombre;

import lombok.Data;
import lombok.NonNull;

@Data
public class PersonaData {
    @NonNull private String nombre;
    @NonNull private String apellido;
}
