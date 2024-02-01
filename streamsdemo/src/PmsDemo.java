import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PmsDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("f:/product.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
     //   Object obj1=new Product();//implicit object casting
        Product obj =(Product) ois.readObject();
        System.out.println(obj);
        ois.close();
        fis.close();

    }
}
