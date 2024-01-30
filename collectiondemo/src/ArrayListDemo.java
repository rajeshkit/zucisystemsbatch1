import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        LinkedList<Product> alist=new LinkedList(); // doubly Linkedlist
        Product p1=new Product("Tv",4787,56789, LocalDate.now());
        Product p2=new Product("Mobile",8788,46789, LocalDate.now());
        Product p3=new Product("Refrigrator",2345,86789, LocalDate.now());
        Product p4=new Product("AC",866,78765, LocalDate.now());
        alist.add(p1);
        alist.add(p4);
        alist.add(p2);
        alist.add(p3);
        System.out.println(alist);
        Collections.sort(alist,new ProductIdComparator());
        System.out.println(alist);
        Collections.sort(alist,new ProductCostComparator());
        System.out.println(alist);
        Collections.sort(alist,new ProductNameComparator());
        System.out.println(alist);


        }
//        alist.add(4545);
//        alist.add(978);
//        alist.add(56787);
//        alist.add(6745);
//       // alist.add(null);
//        alist.add(8);
//        alist.add(978);
//       // alist.add(null);
//        alist.add(6899);
//        alist.add(6745);
//        alist.get(5);

    }

