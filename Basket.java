public class Basket {
    Category[] categories;

    public Basket() {
    }

    public Basket(Category[] categories) {
        this.categories = categories;
    }

    public Category[] getCategories() {
        return this.categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

}
