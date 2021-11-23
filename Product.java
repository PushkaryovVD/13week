import java.util.Scanner;

public class Product {
    String nameProduct;
    double cost, rating;

    Product(String nameProduct, double cost, double rating) {
        this.nameProduct = nameProduct;
        this.cost = cost;
        this.rating = rating;
    }

    public static double getCash(Product[] p) {
        double cash = 0.0;
        for (int i = 0; i < p.length; ++i) {
            if (p[i] == null)
                break;
            cash += p[i].cost;
        }
        return cash;
    }

    public static void seeProduct(Category cat) {
        for (int i = 0; i < cat.products.length; ++i) {
            System.out.println((i + 1) + ". " + cat.products[i].nameProduct + " ------- " + cat.products[i].cost
                    + " ------- " + cat.products[i].rating);
        }
        System.out.println("0.Back");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0)
            Category.getCategory(Main.all);
        else
            buyProduct(cat.products[number - 1]);
    }

    private static void buyProduct(Product p) {
        System.out.println("Product " + p.nameProduct + " to " + p.cost + " basket");
        for (int i = 0; i < Main.card.length; ++i) {
            if (Main.card[i] == null) {
                Main.card[i] = p;
                break;
            } else {
                if (i + 1 == Main.card.length && Main.card[i] == null) {
                    System.out.println("Basket full");
                    break;
                }
            }
        }

        Category.getCategory(Main.all);
    }
}