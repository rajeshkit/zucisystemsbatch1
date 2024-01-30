public class Email {
    public void notification(Booking b){
        // logic to trigger email with booking details
        System.out.println(b.getBookingId()+" "+b.getSrc()+"  "+b.getDst()+"  "+b.getTicketCost());
    }
}
