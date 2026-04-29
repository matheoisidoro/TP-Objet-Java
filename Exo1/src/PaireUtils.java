public class PaireUtils {

    public static <A, B> Paire<B, A> inverser(Paire<A, B> p) {
        return new Paire<>(p.getSecond(), p.getPremier());
    }

    private PaireUtils() {}
}