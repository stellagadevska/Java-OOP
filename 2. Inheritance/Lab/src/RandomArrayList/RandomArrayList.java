package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    private Random random; // Initialize this…

    public RandomArrayList() {
        this.random = new Random();
    }

    public T getRandomElement() {
        int index = this.random.nextInt(this.size());
        return super.remove(index);
    }
}
