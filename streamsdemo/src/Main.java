import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=new FileInputStream("f:/customerdetails.txt");
        FileWriter fw=new FileWriter("f:/customerdetails.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
       // OutputStream outputStream = new FileOutputStream("output.txt");
        OutputStream outputStream = new FileOutputStream("output.txt");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write("Hello World");

    }
}
