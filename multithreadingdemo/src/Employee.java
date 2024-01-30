import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Employee extends Thread{
    public static void main(String[] args) {
        System.err.println("sdfsbdfkjnfkj");
        ExecutorService ex= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10 ; i++) {
            ex.submit(
            new Runnable() {
                @Override
                public void run() {

                }
            });
        }
        System.out.println("Welcome to multithreading");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("*********************************");
        Employee e=new Employee();
        e.setName("add");
        e.start(); // it will call run
        Employee e1=new Employee();
        e1.setName("mutilpy");
        e1.start(); // it will call run
        // e,e1 -scheduling algorithm --> cpu
    }

    @Override
    public void run() {
        show();
    }
    public void show(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
        synchronized (this){
            System.out.println("dfdfff");
        }
    }

}
