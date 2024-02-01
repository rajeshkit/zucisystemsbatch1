import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Pms {
    public static void main(String[] args) throws IOException {
        Product product=new Product();
        Scanner s=new Scanner(System.in);
        System.out.println("Product Id");
        product.setProductId(s.nextInt());
        s.nextLine();
        System.out.println("Product name");
        product.setProductName(s.nextLine());
        System.out.println("product cost");
        product.setCost(s.nextInt());
        System.out.println("product date");
        product.setDom(LocalDate.now());
    //serialization - java object to persistent(stream) (file,db)
    //Deserialization - persistent to java object(stream)
        FileOutputStream fis=new FileOutputStream("f:/product.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fis);
        oos.writeObject(product);
        s.close();
        Product p=new Product();
      //  p.close();
    }
}
