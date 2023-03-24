import java.util.*;

public class Main {
    public static void main(String[] args) {
        Producto productoAtun = new Producto("Atun");
        productoAtun.setDescripcion("Enlatado");

        Carrito carrito = new Carrito();
        carrito.agregarProducto(productoAtun);

        Collection<Producto> carritoAntesDelCambio = carrito.getProductos();

        productoAtun.setDescripcion("Cambio de descrión");

        carrito.agregarProducto(new Producto("Papas"));

        System.out.println("Carrito antes del cambio:");
        carritoAntesDelCambio.forEach(prod -> {System.out.println(prod.toString());});
        System.out.println("Carrito actualmente:");
        carrito.getProductos().forEach(prod -> {System.out.println(prod.toString());});

        /*
        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);

        // Using keySet() to get the set view of keys
        System.out.println("The set is: " + hash_map.keySet());

        Iterator<Integer> iterator = hash_map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("Key: " + key + " Value: " + hash_map.get(key));
        }*/

        // Creando lista de strings
        List<String> list = Arrays.asList("10", "6.5", "9.12", "11", "15");

        // Usanod Stream mapToDouble para convertir a double (ToDoubleFunction mapper)
        list.stream().mapToDouble(num -> Double.parseDouble(num)) // Devuelve la lista con sus valores transformados en double
                .filter(num -> (num > 9 )) // Filtra la lista para que solo queden los elementos mayores que 9
                .forEach(System.out::println); // Para cada elemento de la lista imprime su valor (Por eso usamos "::")
    }
}