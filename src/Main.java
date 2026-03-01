import model.Order;
import service.CheckoutSaga;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("1001", 299.99);
        CheckoutSaga saga = new CheckoutSaga();
        saga.checkout(order);
    }
}