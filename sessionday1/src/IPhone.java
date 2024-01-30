public class IPhone {
    public void doTask(){
        Phone phone=new Phone();// Has-a
        System.out.println(phone.phoneName);
        System.out.println(phone.cost);
        phone.display();
    }

    public static void main(String[] args) {
        IPhone iPhone=new IPhone();
        iPhone.doTask();
    }
}
