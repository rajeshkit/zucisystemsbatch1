public class CarLoan extends Loan {
    public void loanCheck(){
        //approve or reject - reuse
        System.out.println(loanName);
        System.out.println(loanNumber);
        System.out.println(Loan.bankName);
        approval();
    }
    public void emiEstimation(){
        System.out.println("Enter the amount,roi,tenure wanted");
        int principleAmount=45464;
        float rateOfInterest=7.8f;
        int duration=5;
        emi(principleAmount,rateOfInterest,duration); // emi //inheritance

    }
}
