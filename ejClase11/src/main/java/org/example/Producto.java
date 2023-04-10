package org.example;

import lombok.*;
@AllArgsConstructor @Data
public class Producto {
    @NonNull @Getter @Setter
    private String nombre;
    @NonNull @Getter @Setter
    private Object[] peso;
    @NonNull @Getter @Setter
    private float precio;
}
