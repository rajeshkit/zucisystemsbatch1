import java.util.Scanner;

public class Passenger {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the booking ID");
        int bId=s.nextInt();
        s.nextLine();
        System.out.println("Enter the source");
        String source=s.nextLine();
        System.out.println("Enter the destination");
        String destintion=s.nextLine();
        System.out.println("Enter the cost");
        int tCost=s.nextInt();
        Email email=new Email();
        Booking book=new Booking();
        book.setBookingId(bId);
        book.setSrc(source);
        book.setDst(destintion);
        book.setTicketCost(tCost);
        email.notification(book);//pass by reference
    }
}
