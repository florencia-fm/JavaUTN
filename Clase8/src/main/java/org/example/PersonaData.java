package org.example;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data @ToString(includeFieldNames = false)
public class PersonaData {
    @NonNull private String nombre;
    @NonNull private String apellido;
}
