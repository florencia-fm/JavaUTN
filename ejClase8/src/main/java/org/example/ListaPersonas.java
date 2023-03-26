package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor @Builder @ToString(includeFieldNames = false)
public class ListaPersonas {
    @Builder.Default @Getter
    private List<Persona> personas = new ArrayList<>();

    public void agregarPersona(Persona persona) {
        this.personas.add(persona);
    }
}