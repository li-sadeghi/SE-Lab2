package PaymentServices;

public class OnSiteOrderService implements RegisterService, PaymentService {
    @Override
    public void paymentOrder(int foodPrice) {
        System.out.println("On-site payment with price: " + foodPrice + " Tomans!");
    }
    
    @Override
    public void registrationOrder(String nameOfCustomer) {
        System.out.println("On-site order registered for " + nameOfCustomer);
    }

}
