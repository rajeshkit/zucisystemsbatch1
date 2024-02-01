import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss");
        String stringDate=sdf.format(d);
        System.out.println(stringDate);
        //=================================
        String str="22 SEP 1990";
        SimpleDateFormat sdf1=new SimpleDateFormat("dd MMM yyyy");
        Date uDate=sdf1.parse(str);
        System.out.println(uDate);
    }
}
