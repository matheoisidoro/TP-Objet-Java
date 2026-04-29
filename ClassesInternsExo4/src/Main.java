public class Main {
    public static void main(String[] args) {
        Bouton btn = new Bouton("Valider");

        final int[] compteur = {0};

        btn.addClickListener(new ClickListener() {
            @Override
            public void onClick(int x, int y) {
                System.out.println("Coordonnees du clic : (" + x + ", " + y + ")");
            }
        });

        btn.addClickListener(new ClickListener() {
            @Override
            public void onClick(int x, int y) {
                compteur[0]++;
                System.out.println("Nombre de clics : " + compteur[0]);
            }
        });

        btn.addKeyListener(new KeyListener() {
            @Override
            public void onKeyPress(char touche) {
                char c = Character.toLowerCase(touche);
                if ("aeiouy".indexOf(c) >= 0) {
                    System.out.println(touche + " est une voyelle");
                } else {
                    System.out.println(touche + " est une consonne");
                }
            }
        });

        btn.addHoverListener(new HoverListener() {
            @Override
            public void onHover(boolean entre) {
                if (entre) {
                    System.out.println("Info-bulle : cliquez pour valider.");
                } else {
                    System.out.println("Info-bulle masquee.");
                }
            }
        });

        btn.simulerSurvol(true);
        btn.simulerClic(12, 34);
        btn.simulerTouche('A');
        btn.simulerTouche('b');
        btn.simulerClic(50, 80);
        btn.simulerSurvol(false);
    }
}