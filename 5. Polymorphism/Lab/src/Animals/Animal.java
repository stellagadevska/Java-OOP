package Animals;

public class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    protected String getName() {
        return name;
    }

    protected String getFavouriteFood() {
        return favouriteFood;
    }

    public String explainSelf() {
        String output = String.format("I am %s and my favourite food is %s", getName(), getFavouriteFood());
        return output;
    };
}
