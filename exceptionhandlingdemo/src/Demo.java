import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {
    public static void main(String[] args) {
        System.out.println("line 1");
        try {
            FileReader fileReader=new FileReader("");
            if(10<20){
                throw new ClassNotFoundException();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("line 2");
    }
}
