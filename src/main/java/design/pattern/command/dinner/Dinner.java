package design.pattern.command.dinner;

public class Dinner {

    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        Cook cook = new Cook();

        Customer customer = new Customer(waitress);
        customer.createOrder(new BurgerAndFriesOrder(cook));
        customer.placeOrder();
    }

}
