public class Booking {
    private int bookingId;//public setter getter
    private String src;
    private String dst;
    private int ticketCost;
    Booking(){

    }
    public Booking(int bookingId, String src, String dst, int ticketCost) {
        this.bookingId = bookingId;
        this.src = src;
        this.dst = dst;
        this.ticketCost = ticketCost;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }
}
