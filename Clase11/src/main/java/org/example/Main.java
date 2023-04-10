package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        // Mostrando como se transforma un objeto a JSON
        ObjectMapper objectMapper = new ObjectMapper();
        Producto producto = new Producto("Destornillador", 10, 1.4f);
        String jsonText = objectMapper.writeValueAsString(producto);
        System.out.println(jsonText);
        // {nombre: "Destornillador", "stock": 10, "precio": 1.4}

        // Mostrando como se transforma un JSON a un objeto (una línea)
        String json = "{\"nombre\": \"Destornillador\", \"stock\": 10, \"precio\": 1.4}";
        Producto producto2 = objectMapper.readValue(json, Producto.class);
        System.out.println(producto2);
        // Producto{nombre='Destornillador', stock=10, precio=1.4}

        try {

            // Guardando un objeto en un archivo JSON
            // Instanciamos un libro y lo guardamos en un archivo JSON para persistir los datos.
            Book book = new Book("Thinking in Java", "978-0131872486", 1998,
                new String[]{"Bruce Eckel"});
            ObjectMapper mapper = new ObjectMapper();
            // Pasamos la ruta donde guardamos el archivo y el objeto que queremos persistir.
            mapper.writeValue(Paths.get("book.json").toFile(), book);

            // Lectura del objeto desde el archivo JSON
            // convert a JSON string to a Book object
            Book bookFromJASON = mapper.readValue(Paths.get("book.json").toFile(), Book.class);

            // Print the book
            System.out.println("Leyendo el archivo");
            System.out.println(bookFromJASON);

            // Guardando lista de objetos en archivo (Con formato)
            // Utilizamos ObjectWriter para escribir el objeto en el archivo y DefaulPrettyPrinter para darle formato al archivo.
            ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
            // Inicializamos una lista de libros instanciando libros si corresponde
            List<Book> books = Arrays.asList(
                    book, new Book("Head First Java", "978-0596009205", 2003,
                    new String[]{"Kathy Sierra", "Bert Bates"})
            );

            // Pasamos la ruta donde guardamos el archivo y la lista de objetos que queremos persistir.
            writer.writeValue(Paths.get("books.json").toFile(), books);

            // Lectura de lista de objetos desde el archivo JSON.
            // Convert a JSON array to a list of Books
            List<Book> bookList = Arrays.asList(mapper.readValue(Paths.get("bookList.json").toFile(), Book[].class));

            // print the list of books
            System.out.println("Listando todos los libros del archivo");
            bookList.forEach(System.out::println);

        }
        catch (Exception e) {}
    }
}