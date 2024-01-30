public class Samsung extends Phone{// IS-a
    public void doTask(){
        System.out.println(phoneName);
        System.out.println(cost);
        display();
    }

    public static void main(String[] args) {
        Samsung s=new Samsung();
        s.doTask();
    }
}
