import java.util.Scanner;

public class Pay {
    int paymentId;
    int paymentAmount;
    String paymentTo;
    void preparePayment(){
        Scanner s=new Scanner(System.in);// has-a
        System.out.println("Enter the payment ID");
        paymentId=s.nextInt();
        System.out.println("Enter the payment amount");
        paymentAmount=s.nextInt();
        System.out.println("Enter the to account person name");
        paymentTo=s.nextLine();
        UpiPayment upiPayment=new UpiPayment();
        upiPayment.makePayment(paymentId,paymentTo,paymentAmount);
                                // pass by value
        Payment payment=new Payment(paymentId,paymentAmount,paymentTo);
        upiPayment.makePayment(payment);// pass by reference
    }

}
