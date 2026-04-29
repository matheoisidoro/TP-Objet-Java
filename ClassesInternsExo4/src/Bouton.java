import java.util.ArrayList;
import java.util.List;

class Bouton {
    private String label;
    private List<ClickListener> clickListeners = new ArrayList<>();
    private List<KeyListener> keyListeners = new ArrayList<>();
    private List<HoverListener> hoverListeners = new ArrayList<>();

    public Bouton(String label) {
        this.label = label;
    }

    public void addClickListener(ClickListener listener) {
        clickListeners.add(listener);
    }

    public void addKeyListener(KeyListener listener) {
        keyListeners.add(listener);
    }

    public void addHoverListener(HoverListener listener) {
        hoverListeners.add(listener);
    }

    public void simulerClic(int x, int y) {
        System.out.println("[" + label + "] clic");
        for (ClickListener listener : clickListeners) {
            listener.onClick(x, y);
        }
    }

    public void simulerTouche(char c) {
        System.out.println("[" + label + "] touche");
        for (KeyListener listener : keyListeners) {
            listener.onKeyPress(c);
        }
    }

    public void simulerSurvol(boolean entre) {
        System.out.println("[" + label + "] survol");
        for (HoverListener listener : hoverListeners) {
            listener.onHover(entre);
        }
    }
}