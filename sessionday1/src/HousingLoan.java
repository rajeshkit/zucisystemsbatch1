public class HousingLoan {
    public void loanCheck(){
        //approve or reject - reuse

    }
    public void emiEstimation(){
        Loan loan=new Loan();
        System.out.println("Enter the amount,roi,tenure wanted");
        int principleAmount=45464;
        float rateOfInterest=7.8f;
        int duration=5;
        loan.emi(principleAmount,rateOfInterest,duration); // emi //inheritance
        System.out.println(loan.loanName);
        System.out.println(loan.loanNumber);
        System.out.println(Loan.bankName);
        loan.approval();
    }
}