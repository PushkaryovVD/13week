import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void getMenu() {
        System.out.println("\n Menu");
        System.out.println("1.Category");
        System.out.println("2.Basket");
        System.out.println("3.Billing system");
        System.out.println("0.Exit");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
        case 1: {
            Category.getCategory(all);
            break;
        }
        case 2: {
            Basket.getBasket(card);
            break;
        }
        case 3: {
            Buy();
            break;
        }
        case 0: {
            break;
        }
        }
    }

    public static void Buy() {
        Basket cards = new Basket(card);
        client.purchased = cards;
        System.out.println("Bill");
        for (int i = 0; i < client.purchased.purchased.length; ++i) {
            if (client.purchased.purchased[i] == null)
                break;
            System.out.println((i + 1) + ". " + client.purchased.purchased[i].nameProduct + " ------- "
                    + client.purchased.purchased[i].cost + " ------- " + client.purchased.purchased[i].rating);
        }
        double gc = Product.getCash(client.purchased.purchased);
        System.out.print("Total check -------" + gc);
        LocalDate today = LocalDate.now();

        System.out.print("\nDate: " + today);

    }

    static Product toothpaste = new Product("Toothpaste", 34.0, 4.3);
    static Product cake = new Product("Cake", 60.0, 5.0);
    static Product hand_soup = new Product("Hand_soup", 75.0, 4.9);

    static Product milk = new Product("Milk", 123.0, 4.3);
    static Product sugar = new Product("Sugar", 86.0, 4.2);
    static Product polar = new Product("Polar", 75.0, 5.0);

    static Product[] Bakery = { cake, milk, sugar };
    static Product[] Bath = { milk, hand_soup, polar };

    static Category bakery = new Category("Bakery Product", Bakery);
    static Category bath = new Category("Bath Product", Bath);

    static Category[] all = { bakery, bath };
    static Product[] card;
    static User client;

    public static void main(String[] args) {
        client = new User("admin", "admin");

        Scanner scanner = new Scanner(System.in);
        card = new Product[10];
        System.out.println("Autorization \n Enter login and password:");
        String login = (String) scanner.nextLine();
        String password = (String) scanner.nextLine();
        if (client.isAuth(login, password)) {
            getMenu();
        } else {
            System.exit(1);
        }

    }

}