public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Caja con tipo Integer y color Azul
        Caja<Integer> cajaDeEnteros = new Caja<>(10, "Azul");
        System.out.println("Contenido de la caja: " + cajaDeEnteros.obtenerContenido());
        System.out.println("Color de la caja: " + cajaDeEnteros.obtenerColor());

        // Crear una instancia de Caja con tipo String y color Rojo
        Caja<String> cajaDeCadenas = new Caja<>("Hola Mundo", "Rojo");
        System.out.println("Contenido de la caja: " + cajaDeCadenas.obtenerContenido());
        System.out.println("Color de la caja: " + cajaDeCadenas.obtenerColor());
    }
}
