public class Loan {
    int loanNumber;
    String loanName;
    static String bankName;
    public void approval(){
        System.out.println("Approved");
    }
    public float emi(int amount,float roi,int tenure){
        return amount*roi/tenure*12;
    }
}
