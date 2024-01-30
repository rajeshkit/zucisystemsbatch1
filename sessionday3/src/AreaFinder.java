public class AreaFinder {
    public  void findArea(int side){
        System.out.println("Area of square:"+side*side);
    }
    public  void findArea(int length,int bredth){
        System.out.println("Area of Rectangle:"+length*bredth);
        System.out.println(34.6f);
    }
    public  void findArea(float radius){
        System.out.println("Area of Circle:"+3.14*radius*radius);
    }
    public  void findArea(String str){
        System.out.println("Area of Rectangle:"+str);
    }
    public void findArea(float radius,boolean b){
        System.out.println("Area of sphere:"+3.14*radius);
    }

    public static void main(String[] args) {
        AreaFinder areaFinder=new AreaFinder();
        areaFinder.findArea(34.6f);
        //jvm - binding
        //1. method name method call resolve - 5 methods
        //2. no of arg - 3 method
        //3. type of arg - resolved
    }

}
