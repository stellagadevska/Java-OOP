package RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> random = new RandomArrayList();

        for (int i = 0; i < 10; i++) {
           random.add(i);
        }

        System.out.println(random.getRandomElement());
    }
}
