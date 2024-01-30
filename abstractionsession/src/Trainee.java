public abstract class Trainee extends Technology{
    public void learning(){
       // Technology technology=new Technology();// Has-a
        cloud();
    }


    public static void main(String[] args) {
        Technology t=new Trainee();
        t.learnJava();
    }
}
