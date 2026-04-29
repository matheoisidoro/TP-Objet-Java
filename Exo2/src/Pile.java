import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Pile<T> {

    private final List<T> elements;

    public Pile() {
        this.elements = new ArrayList<>();
    }

    public void empiler(T element) {
        elements.add(element);
    }

    public T depiler() {
        if (estVide()) {
            throw new NoSuchElementException("Impossible de dépiler");
        }
        return elements.remove(elements.size() - 1);
    }

    public T sommet() {
        if (estVide()) {
            throw new NoSuchElementException("Impossible de lire le sommet ");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean estVide() {
        return elements.isEmpty();
    }

    public int taille() {
        return elements.size();
    }

    public String toString() {
        if (estVide()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = elements.size() - 1; i >= 0; i--) {
            sb.append(elements.get(i));
            if (i > 0) sb.append(" | ");
        }
        sb.append("]");
        return sb.toString();
    }
}