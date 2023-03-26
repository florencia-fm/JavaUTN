package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;
import lombok.ToString;
import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor @Data @ToString(includeFieldNames = false)
public class Persona {
    @NonNull
    private String nombre;
    @NonNull
    private String apellido;
    @NonNull
    private LocalDate fechaNacimiento;
}
