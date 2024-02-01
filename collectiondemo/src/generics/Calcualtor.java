package generics;

public class Calcualtor {
    public <T, R> T display(T[] a, R[] b){
        for (T k: a) {
            System.out.println(k);
        }
        return a[0];
    }
    public static void main(String[] args) {
        Calcualtor c=new Calcualtor();
        Integer[] arr = {45,67,45,78,35,7};
       Float[] arr1 = {45f,67f,45f,78f,35f,7f};
        c.display(arr,arr);
    }
//    public <T> T add(T a, T b){
//        System.out.println(a.getClass()+" " +b.getClass());
//        if(a instanceof Integer) {
//            return Integer.valueOf(((Integer) a).intValue()+ ((Integer)b).intValue()));
//        }
//    }


}
