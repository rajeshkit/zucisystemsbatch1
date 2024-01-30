import java.io.*;

public class CharacterDemo {
    public static void main(String[] args) throws IOException {
        Reader reader=new FileReader("f:/customerdetails.txt");
        BufferedReader br=new BufferedReader(reader);
        int data = 0;
        StringBuilder sb=new StringBuilder();
        br.readLine();
        while(br.readLine()!=null) {
                sb.append(br);
        }
        String t="kjdfdjkfkjdf dsfbksdbksdfjbsfd";
        FileWriter fw=new FileWriter("f:/df.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        System.out.println(sb);
        //fw.write(t);
        fw.write(t);
        fw.flush();
    }
}
