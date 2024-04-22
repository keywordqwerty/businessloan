/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoanPackage;

/**
 *
 * @author Louis Valencia
 */



/*Loan – A public abstract class that implements the LoanConstants interface. A Loan includes a
loan number, customer last name, amount of loan, interest rate, and term. The constructor requires
data for each of the fields except interest rate. Do not allow loan amounts over $100,000. Force any
loan term that is not one of the three defined in the LoanConstants interface to a short term, one
year loan. Create a toString() method that displays all the loan data.*/

public abstract class Loan implements LoanConstants{
    private int loanNumber;
    private String customerLastName;
    private double loanAmt;
    private double interestRate;
    private int term;

    
 
    //GETTERS
    public int getLoanNumber() {
        return loanNumber;
    }
    public String getCustomerLastName() {
        return customerLastName;
    }

    public double getLoanAmt() {
        return loanAmt;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTerm() {
        return term;
    }
    
    
//SETTERS
    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public void setLoanAmt(double loanAmt) {
        if(loanAmt > maxLoanAmt){
            loanAmt = 100000;
            System.out.println("Loan Capacity is only at 100,000");
        }else{
            this.loanAmt = loanAmt;
        }
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setTerm(int term) {
        if(term == shortTerm || term == mediumTerm || term == longTerm){
            this.term = term;
        }else{
        this.term = shortTerm;
        }
    }
    
    
    
    
    @Override
    public String toString(){
      String disp = "Loan Number: "+ loanNumber +"\n Customer Name: " +
              customerLastName+"\n Loan Amount: " +loanAmt+"\n Interest Rate: "+interestRate+"\n Term: "+term;
      return disp;
    }
    
    
      public Loan(int loanNumber, String CustomerLastName, double loanAmt, double interestRate, int term){
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        this.loanAmt = loanAmt;
        this.term = term;
        this.interestRate = 0.0;
        }
}
