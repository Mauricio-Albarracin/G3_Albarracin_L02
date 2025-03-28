public class TestGen {
    public static <T> boolean exist(T[] array, T elemento) {
        for (T item : array) {
            if (item.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};
        
        System.out.println(exist(v, "Sanchez")); // true
        System.out.println(exist(w, 34)); // true

        Golosina[] golosinas = {
            new Golosina("Caramelo", 10.5),
            new Golosina("Gomita", 5.3)
        };
        Chocolatina[] chocolatinas = {
            new Chocolatina("Milka"),
            new Chocolatina("Ferrero")
        };
        
        System.out.println(exist(golosinas, new Golosina("Caramelo", 10.5))); // false (porque falta equals en Golosina)
        System.out.println(exist(chocolatinas, new Chocolatina("Milka"))); // false (porque falta equals en Chocolatina)
    }
}