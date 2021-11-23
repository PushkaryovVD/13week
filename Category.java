import java.util.ArrayList;

public class Category {
    String name;
    ArrayList<Product> products;

    public Category() {
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {

        return this.products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", products='" + getProducts() + "'" + "}";
    }

}
