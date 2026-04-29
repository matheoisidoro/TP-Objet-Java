public class MainPaire {

    public static void main(String[] args) {

        Paire<String, Integer> p1 = new Paire<>("Alice", 42);
        System.out.println(p1); // (Alice, 42)

        Paire<Integer, String> p1Inverse = PaireUtils.inverser(p1);
        System.out.println(p1Inverse); // (42, Alice)

        Paire<Double, Boolean> p2 = new Paire<>(3.14, true);
        System.out.println(
                p2.getPremier().getClass().getSimpleName() + " — " +
                        p2.getSecond().getClass().getSimpleName()
        );
    }
}