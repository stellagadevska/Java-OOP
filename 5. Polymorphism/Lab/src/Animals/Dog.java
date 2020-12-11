package Animals;

public class Dog extends Animal {
    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        String sound = "DJAAF";
        return super.explainSelf() + System.lineSeparator() + sound;
    }
}
