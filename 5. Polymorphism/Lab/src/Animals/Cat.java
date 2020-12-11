package Animals;

public class Cat extends Animal {
    protected Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        String sound = "MEEOW";
        return super.explainSelf() + System.lineSeparator() + sound;
    }
}
