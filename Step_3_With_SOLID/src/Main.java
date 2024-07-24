import PaymentServices.OnSiteOrderService;
import PaymentServices.OnlineOrderService;
import PaymentServices.PhoneOrderService;
import PaymentServices.PaymentService;
import PaymentServices.RegisterService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String customerName;
        Order order;
        int customerAnswerForOrder=0;
        int customerAnswerForPaymentMethod=0;
        PaymentService paymentService = null;
        RegisterService registerService = null;

        System.out.println("Enter Customer Name : ");
        customerName = scanner.nextLine();
        order = new Order(customerName);

        //Step 1 : Select Order Items
        while (customerAnswerForOrder!=3){
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("For submit your order enter 3");
            customerAnswerForOrder = scanner.nextInt();

            if(customerAnswerForOrder==1){
                order.addItem(new Food("sandwich",1000));
            } else if(customerAnswerForOrder==2){
                order.addItem(new Food("pizza",2000));
            }


        }

        //Step2 : Select Payment Method
        System.out.println("Enter Your Payment Method (1 for online and 2 for on-site):");
        customerAnswerForPaymentMethod = scanner.nextInt();
        if(customerAnswerForPaymentMethod==1){
            paymentService = new OnlineOrderService()
            registerService = new OnlineOrderService()
            registerService.registrationOrder(customerName);
        } 
        else if(customerAnswerForPaymentMethod==2){
            paymentService = new OnSiteOrderService()
            registerService = new OnSiteOrderService()
            registerService.registrationOrder(customerName);
        }
        else if (customerAnswerForPaymentMethod == 3) {
            paymentService = new PhoneOrderService()
            registerService = new PhoneOrderService()
            registerService.registrationOrder(customerName);
        }
        else{
            System.out.println("Error!")
        }

        //Step3 : pay price
        System.out.println("Pay Price:");
        if(paymentService != null){
            paymentService.paymentOrder(order.getTotalPrice())
        }

        //Finally Print Bill
        System.out.println(order);


    }

}
