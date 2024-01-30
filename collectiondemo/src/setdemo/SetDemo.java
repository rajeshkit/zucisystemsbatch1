package setdemo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        TreeSet<Character> hs=new TreeSet();
        hs.add('r');
        hs.add('a');
        hs.add('j');
        hs.add('e');
        hs.add('s');
        hs.add('h');
        hs.add('r');
        Iterator<Character> itr =hs.iterator();
        System.out.println(hs);
        TreeSet<Product> hs1=new TreeSet();
        Product p1=new Product("Tv",4787,56789, LocalDate.now());
        Product p2=new Product("Mobile",8788,46789, LocalDate.now());
        Product p3=new Product("Refrigrator",2345,86789, LocalDate.now());
        Product p4=new Product("AC",866,78765, LocalDate.now());
        hs1.add(p1);
        hs1.add(p4);
        hs1.add(p2);
        hs1.add(p3);
        System.out.println(hs1);
    }
}
