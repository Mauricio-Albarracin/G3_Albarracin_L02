import java.util.ArrayList;
import java.util.List;

// Clase genérica Cajoneria que almacena cajas de cualquier tipo
public class Cajoneria {
    private List<Caja<?>> cajas; // Lista que almacena objetos Caja

    // Constructor
    public Cajoneria() {
        this.cajas = new ArrayList<>();
    }

    // Método para agregar una caja a la cajoneria
    public void agregarCaja(Caja<?> caja) {
        cajas.add(caja);
    }

    // Método para obtener una caja por índice
    public Caja<?> obtenerCaja(int indice) {
        if (indice >= 0 && indice < cajas.size()) {
            return cajas.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
    }

    // Método para mostrar todas las cajas con su contenido y color
    public void mostrarCajoneria() {
        for (int i = 0; i < cajas.size(); i++) {
            Caja<?> caja = cajas.get(i);
            System.out.println("Caja " + (i + 1) + " - Color: " + caja.obtenerColor() +
                               ", Contenido: " + caja.obtenerContenido());
        }
    }
}
