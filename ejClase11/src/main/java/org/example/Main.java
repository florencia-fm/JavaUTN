package org.example;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String ruta = "src/main/resources/ejemploOfertas.csv";
        Path path = Paths.get(ruta);

        ArrayList<Oferta> ofertas = new ArrayList<Oferta>();

        // Lectura del CSV
        for (String line: Files.readAllLines(path)){
            // Split datos
            String[] datos = line.split(",");

            // Datos Producto
            String nombre = datos[0];
            Object[] peso = new Object[2];
            peso[0] = Float.parseFloat(datos[1]);
            peso[1] = datos[2];
            float precio = Float.parseFloat(datos[3]);

            // Datos Descuento
            String tipo = datos[4];
            float cantidad = Float.parseFloat(datos[5]);
            float tope = Float.parseFloat(datos[6]);

            // Datos Oferta
            String fechaDesde = datos[7];
            String  fechaHasta = datos[8];

            // Instancias de objetos
            Producto producto = new Producto(nombre, peso, precio);
            Descuento descuento = new Descuento(tipo, cantidad, tope);
            Oferta oferta = new Oferta(producto, descuento, fechaDesde, fechaHasta);

            // Agregar a lista de ofertas
            ofertas.add(oferta);
        }

        // Guardar lista en archivo JSON
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(Paths.get("src/main/resources/ejemploOfertas.json").toFile(), ofertas);

    }
}