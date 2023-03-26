package org.example;

import lombok.*;

@AllArgsConstructor @NoArgsConstructor @ToString
public class Persona {
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String apellido;
}
