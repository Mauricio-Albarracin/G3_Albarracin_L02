public class Main {
    public static void main(String[] args) {
        // Crear una cajoneria
        Cajoneria cajoneria = new Cajoneria();

        // Crear cajas con diferentes tipos de contenido y agregarlas a la cajoneria
        Caja<Integer> cajaEnteros = new Caja<>(10, "Azul");
        Caja<String> cajaCadenas = new Caja<>("Hola Mundo", "Rojo");
        Caja<Double> cajaDecimales = new Caja<>(99.99, "Verde");

        // Agregar cajas a la cajoneria
        cajoneria.agregarCaja(cajaEnteros);
        cajoneria.agregarCaja(cajaCadenas);
        cajoneria.agregarCaja(cajaDecimales);

        // Mostrar las cajas almacenadas en la cajoneria
        System.out.println("Contenido de la Cajoneria:");
        cajoneria.mostrarCajoneria();
    }
}
