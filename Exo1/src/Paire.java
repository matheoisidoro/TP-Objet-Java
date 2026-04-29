public class Paire<A, B> {

    private final A premier;
    private final B second;

    public Paire(A premier, B second) {
        this.premier = premier;
        this.second = second;
    }

    public A getPremier() {
        return premier;
    }

    public B getSecond() {
        return second;
    }

    public String toString() {
        return "Premier: " + premier + ", Second: " + second ;
    }
}