import java.util.Scanner;

public class Category {
    String nameCategory;
    Product[] products;

    Category(String nameCategory, Product[] products) {
        this.nameCategory = nameCategory;
        this.products = products;
    }

    public static void getCategory(Category[] c) {
        for (int i = 0; i < c.length; ++i)
            System.out.println("№" + (i + 1) + " " + c[i].nameCategory);
        System.out.println("0.Back");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0)
            Main.getMenu();
        else
            Product.seeProduct(Main.all[number - 1]);

    }
}