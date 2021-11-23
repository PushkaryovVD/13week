import java.util.Scanner;

public class Basket {
    Product[] purchased;

    Basket(Product[] purchased) {
        this.purchased = purchased;
    }

    public static void getBasket(Product[] b) {
        for (int i = 0; i < b.length; ++i) {
            if (b[i] == null)
                break;
            System.out.println((i + 1) + ". " + b[i].nameProduct + " ------- " + b[i].cost + " ------- " + b[i].rating);
        }
        System.out.println("0.Back");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0)
            Main.getMenu();
    }
}