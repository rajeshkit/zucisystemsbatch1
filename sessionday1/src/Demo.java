import com.sun.source.util.DocTreePathScanner;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Demo {
    int age = 45;// instance variable
    public void display() {
        Object obj=new Object();
        obj.equals("44");
        obj.hashCode();
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.age);
    }
}
