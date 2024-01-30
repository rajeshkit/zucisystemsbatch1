import java.io.*;

public class StreamsDemo {
    public static void main(String[] args) throws IOException {

            File filePath=new File("F:/customerdetails.txt");
            InputStream inputStream=new FileInputStream(filePath);
            BufferedInputStream bis=new BufferedInputStream(inputStream);
            int data = 0;
           while((data = bis.read())!=-1) {
               System.out.print((char)data);
           }
        String data1="this is rajesh from zuci system";
        byte[] b=data1.getBytes();
        OutputStream outputStream=new FileOutputStream("f:/zucisystem.txt");
        BufferedOutputStream bos=new BufferedOutputStream(outputStream);
        bos.write(b);

    }
}
