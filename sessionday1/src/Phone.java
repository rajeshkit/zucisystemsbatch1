public class Phone extends Gsm{
    String phoneName;
    int cost;

    public Phone() {

        System.out.println("no arg Phone class constructor");
    }

    public Phone(String phoneName) {
        System.out.println("Phone class one string constructor");
        this.phoneName = phoneName;
    }

    public Phone(int cost) {
        System.out.println("Phone class one int arg constructor");
        this.cost = cost;
    }

    public Phone(String phoneName, int cost) {
        super();
        System.out.println("two arg Phone class constructor");
        this.phoneName = phoneName;
        this.cost = cost;
    }

    public void display(){
        System.out.println("LED display");
    }

    public static void main(String[] args) {
        Phone phone=new Phone("Iphone",46564);
        System.out.println(phone.cost);
        System.out.println(phone.phoneName);

    }
}
