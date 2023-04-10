package org.example;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor @Data
public class Oferta {
    @NonNull @Getter @Setter
    private Producto producto;
    @NonNull @Getter @Setter
    private Descuento descuento;
    @NonNull @Getter @Setter
    private String fechaDesde;
    @NonNull @Getter @Setter
    private String fechaHasta;
}
