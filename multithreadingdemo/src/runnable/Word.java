package runnable;

public class Word {
    public static void main(String[] args) {
        Runnable as=new AutoSave();
        Thread t=new Thread(as);
        t.start();
        Runnable ty=new Typing();
        Thread t1=new Thread(ty);
        t1.start();
    }
}
