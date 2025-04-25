package design.pattern.command.dinner;

public class Customer {
    Waitress waitress;
    Order order;

    public Customer(Waitress waitress) {
        this.waitress = waitress;
    }

    public void createOrder(Order order) {
        this.order = order;
    }

    public void placeOrder() {
        waitress.takeOrder(order);
    }
}
