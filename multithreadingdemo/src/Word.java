public class Word {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread as=new AutoSave();
        System.out.println(as.getState());
        as.start();
        System.out.println(as.getState());
//       Thread g=new Grammer();
//        g.start();
    }
}
