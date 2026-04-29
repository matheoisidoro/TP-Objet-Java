import java.util.List;

public class Main{
    public static void main(String[] args) {
        GestionnaireStock gs = new GestionnaireStock();

        gs.ajouterProduit(new Produit("Clavier", "Informatique", 49.99, 10));
        gs.ajouterProduit(new Produit("Souris", "Informatique", 19.99, 25));
        gs.ajouterProduit(new Produit("Ecran", "Informatique", 189.99, 5));
        gs.ajouterProduit(new Produit("Canaper", "Mobilier", 89.99, 8));
        gs.ajouterProduit(new Produit("Table", "Mobilier", 159.99, 3));
        gs.ajouterProduit(new Produit("Manette", "Informatique", 79.99, 15));
        gs.ajouterProduit(new Produit("Lampe", "Mobilier", 29.99, 20));
        gs.ajouterProduit(new Produit("SSD", "Informatique", 99.99, 12));

        System.out.println("Filtre Informatqiue : ");
        List<Produit> r1 = gs.filtrerEtTrier("Informatique", 100.0, 10);
        for (Produit p : r1) {
            System.out.println(p);
        }

        System.out.println("\nFiltre Mobilier :");
        List<Produit> r2 = gs.filtrerEtTrier("Mobilier", 100.0, 5);
        for (Produit p : r2) {
            System.out.println(p);
        }
    }
}