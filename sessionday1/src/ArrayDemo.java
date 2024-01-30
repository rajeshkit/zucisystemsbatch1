import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayDemo {
    int volume;
    public static void main(String[] args) {
            int[] scores={45,67,668,4546,899};
        for (int s:scores){
            System.out.println(s);
        }
            Arrays.sort(scores);
            for (int s:scores){
                System.out.println(s);
            }
            int element = Arrays.binarySearch(scores,4546);
        System.out.println(element);
        int[] copyScores=Arrays.copyOf(scores,3);
        System.out.println(copyScores);

    }
}
