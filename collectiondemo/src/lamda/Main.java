package lamda;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // boolean test(T t);
        Predicate<Integer> p=(e)->e!=0;
        System.out.println(p.test(230));
        // void accept(T t);
        Consumer<String> cons=(e)-> System.out.println(e);
        // R apply(T t);
        Function<Integer,String> fun=(e)->e.longValue()*e.longValue()+"";
        String s=fun.apply(5678);
        System.out.println(s);

        cons.accept("welcome");
        Calculator c=(no1,no2)->no1+no2;
        int total=c.add(354,666);
        System.out.println(total);
        Runnable r=()-> System.out.println(Thread.currentThread().getName());
        r.run();
        // public int compareTo(T o);
        Comparable<Integer> com=e->Integer.compare(e,788);
        int result=com.compareTo(788);
        System.out.println(result);
        //int compare(T o1, T o2);
        Comparator<Integer> comparator=(o1,o2)->o1-o2;
        System.out.println(comparator.compare(56,456));
    }




}
