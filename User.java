public class User {
    String login;
    String password;
    Basket[] basket;

    public User() {
    }

    public User(String login, String password, Basket[] basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket[] getBasket() {
        return this.basket;
    }

    public void setBasket(Basket[] basket) {
        this.basket = basket;
    }

}
