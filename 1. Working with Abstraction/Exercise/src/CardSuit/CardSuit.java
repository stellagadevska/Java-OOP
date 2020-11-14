package CardSuit;

public enum CardSuit {
    CLUBS(),
    DIAMONDS(),
    HEARTS(),
    SPADES();

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.name());
    }

}
