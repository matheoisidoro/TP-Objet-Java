public class PileUtils {

    public static <T> Pile<T> inverser(Pile<T> source) {
        Pile<T> copie    = copierPile(source);
        Pile<T> resultat = new Pile<>();
        while (!copie.estVide()) {
            resultat.empiler(copie.depiler());
        }
        return resultat;
    }

    private static <T> Pile<T> copierPile(Pile<T> source) {
        Pile<T> aux   = new Pile<>();
        Pile<T> copie = new Pile<>();


        while (!source.estVide()) {
            aux.empiler(source.depiler());
        }

        while (!aux.estVide()) {
            T val = aux.depiler();
            source.empiler(val);
            copie.empiler(val);
        }

        return copie;
    }

    private PileUtils() {}
}