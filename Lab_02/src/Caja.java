// Definición de una clase genérica
public class Caja<T> {
    private T contenido;
    private String color; // Nuevo atributo para el color de la caja

    // Constructor para inicializar el contenido y el color
    public Caja(T contenido, String color) {
        this.contenido = contenido;
        this.color = color;
    }

    // Método para obtener el contenido
    public T obtenerContenido() {
        return contenido;
    }

    // Método para establecer el contenido
    public void establecerContenido(T contenido) {
        this.contenido = contenido;
    }

    // Método para obtener el color de la caja
    public String obtenerColor() {
        return color;
    }

    // Método para cambiar el color de la caja (opcional)
    public void establecerColor(String color) {
        this.color = color;
    }
}
