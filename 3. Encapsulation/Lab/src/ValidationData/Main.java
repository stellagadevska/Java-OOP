package ValidationData;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            Person person = new Person("First_Name", "Second_Name", 43, 1000);
            System.out.println(person.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
