package org.example;

import lombok.*;
@AllArgsConstructor @Data
public class Descuento {
    @NonNull @Getter @Setter
    private String tipo;
    @NonNull @Getter @Setter
    private float cantidad;
    @NonNull @Getter @Setter
    private float tope;
}
