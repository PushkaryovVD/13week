public class Product {
    String name;
    double cost;
    int rating;

    public Product() {
    }

    public Product(String name, double cost, int rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", cost='" + getCost() + "'" + ", rating='" + getRating() + "'"
                + "}";
    }

}
