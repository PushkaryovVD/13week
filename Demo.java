import java.util.ArrayList;
import java.util.Arrays;

/**
 * Demo
 */
public class Demo {
    public static void main(String[] args) {

        Category shoes = new Category("shoes", new ArrayList<>(Arrays.asList(new Product("shoes", 123.9, 90))));
        Category tshort = new Category("tshort", new ArrayList<>(Arrays.asList(new Product("tshort", 222.9, 10))));
        System.out.println(shoes.toString());

    }

}