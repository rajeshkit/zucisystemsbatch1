public class AutoSave extends  Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState());
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            System.out.println("Auto save");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
