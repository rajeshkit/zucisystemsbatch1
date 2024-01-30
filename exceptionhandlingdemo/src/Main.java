import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void multiply() {
        if(10<20) {
            throw new NullPointerException();
        }
    }
    public static void add()  {
       multiply();
    }
    public static void main(String[] args)  { //task
        System.out.println("line 1");
        Main.add();
        System.out.println("line 2");
    }
}