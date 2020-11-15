package ShoppingSpree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people;
        Map<String, Product> products;

        try {
            people = getPeople(scanner);
            products = getProducts(scanner);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");

            String person = tokens[0];
            String product = tokens[1];

            buyProduct(people, products, person, product);

            input = scanner.nextLine();
        }

        for (Person person : people.values()) {
            System.out.println(person.toString());
        }
    }

    private static void buyProduct(Map<String, Person> people, Map<String, Product> products, String person, String product) {
        try {
            people.get(person).buyProduct(products.get(product));
            System.out.println(person + " bought " + product);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static Map<String, Person> getPeople(Scanner scanner) {
        String[] tokens = scanner.nextLine().split(";");

        Map<String, Person> people = new LinkedHashMap<>();

        for (String token : tokens) {
            String[] peopleInfo = token.split("=");

            Person person = new Person(peopleInfo[0], Double.parseDouble(peopleInfo[1]));
            people.put(person.getName(), person);
        }

        return people;
    }

    private static Map<String, Product> getProducts(Scanner scanner) {
        String[] tokens = scanner.nextLine().split(";");

        Map<String, Product> products = new LinkedHashMap<>();

        for (String token : tokens) {
            String[] productsInfo = token.split("=");

            Product product = new Product(productsInfo[0], Double.parseDouble(productsInfo[1]));
            products.put(product.getName(), product);
        }

        return products;
    }
}
