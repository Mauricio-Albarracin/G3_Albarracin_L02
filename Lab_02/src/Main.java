public class Main {
    public static void main(String[] args) {
        Bolsa < Chocolatina > bolsaCho = new Bolsa < Chocolatina > (3);
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");  
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);

        for (Chocolatina chocolatina:   bolsaCho){
            System.out.println(chocolatina.getMarca());
        }
        Bolsa<Golosina> bolsaGolo = new Bolsa<>(3);
        Golosina g1 = new Golosina("Caramelo", 10.5);
        Golosina g2 = new Golosina("Gomita", 5.3);
        Golosina g3 = new Golosina("Chocolate", 8.2);
        bolsaGolo.add(g1);
        bolsaGolo.add(g2);
        bolsaGolo.add(g3);

        System.out.println("\nContenido de la bolsa de Golosinas:");
        for (Golosina golosina : bolsaGolo) {
            System.out.println(golosina.getNombre() + " pesa: " + golosina.getPeso() + "g");
        }
    }
}

