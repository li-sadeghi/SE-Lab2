package PaymentServices;

public class PhoneOrderService implements PaymentService, RegisterService {
    @Override
    public void paymentOrder(int foodPrice){
        System.out.println("The price of the order is " + foodPrice + "(Tomans)")
    }

    @Override
    public void registrationOrder(String nameOfCustomer){
        System.out.println("The order of phone is registered for " + nameOfCustomer)
    }
}