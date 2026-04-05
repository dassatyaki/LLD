public class User {
    Cart cart;
    private Integer userId;

    public User(Integer userId) {
        this.userId = userId;
        cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    public Integer getUserId() {
        return userId;
    }
}
