public  class LAndD implements Course{

    @Override
    public void learnJava() {

    }

    @Override
    public void learnCloud() {

    }

    public static void main(String[] args) {
        Course a=new LAndD();
        a.learnCloud();
        a.learnJava();
    }
}
