public class MainPile {

    public static void main(String[] args) {

        Pile<Integer> pile = new Pile<>();
        pile.empiler(1);
        pile.empiler(2);
        pile.empiler(3);
        pile.empiler(4);
        pile.empiler(5);

        System.out.println("Pile initiale : " + pile);

        int retire = pile.depiler();
        System.out.println("Valeur retiree : " + retire);
        System.out.println("Pile après : " + pile);

        Pile<Integer> inverse = PileUtils.inverser(pile);
        System.out.println("Pile inversee: " + inverse);
        System.out.println("Originale inchangee : " + pile);
    }
}