import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestionnaireStock {

    private List<Produit> stock = new ArrayList<>();

    interface Filtre {
        boolean accepter(Produit p);
    }

    public void ajouterProduit(Produit produit) {
        stock.add(produit);
    }

    public List<Produit> filtrerEtTrier(String categorie, double prixMax, int quantiteMin) {

        class FiltreCompose implements Filtre {
            @Override
            public boolean accepter(Produit p) {
                return p.getCategorie().equals(categorie)
                        && p.getPrix() <= prixMax
                        && p.getQuantite() >= quantiteMin;
            }
        }

        Filtre filtre = new FiltreCompose();
        List<Produit> resultat = new ArrayList<>();

        for (Produit p : stock) {
            if (filtre.accepter(p)) {
                resultat.add(p);
            }
        }

        resultat.sort(Comparator.comparingDouble(Produit::getPrix));
        return resultat;
    }
}