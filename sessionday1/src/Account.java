public class Account {
    int number; // instance member variable
    static String name="Rajesh";// static member variable
    String type;// instance member variable
    int balance;// instance member variable
    Account(){
        balance=46566;
        number=3434;
        type="Saving";
        Account.name="Rajesh";
    }
    Account(int bal,int num,String tp){
        balance=bal;
        number=num;
        type=tp;
    }
    public static void main(String[] args) {
        Account t=null;
        Account  acc=new Account(46000,4545,"Savings");
        System.out.println(acc.type);
        System.out.println(acc.balance);
        System.out.println(acc.number);
        System.out.println(Account.name);
        t=acc;
        System.out.println(t.type);
        System.out.println(t.balance);
        System.out.println(t.number);
        System.out.println(Account.name);

        Account  acc1=new Account(78780,8888,"Savings");
        t=acc1;
        System.out.println(acc1.type);
        System.out.println(acc1.balance);
        System.out.println(acc1.number);
        System.out.println(Account.name);
        Account  acc2=new Account(2344,9999,"Savings");
        t=acc2;
        System.out.println(acc2.type);
        System.out.println(acc2.balance);
        System.out.println(acc2.number);
        System.out.println(Account.name);
    }
}
