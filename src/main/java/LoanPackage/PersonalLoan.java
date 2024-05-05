/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoanPackage;

/**
 *
 * @author Louis Valencia
 */
public class PersonalLoan extends Loan {
    private double setInterestRate;
     private double primeInterestRate;
     private double interestt;
    public PersonalLoan(){    
    }
    
    public PersonalLoan(int loanNumber, String CustomerLastName, double loanAmt, int term){
       super(loanNumber, CustomerLastName, loanAmt,term);
       double primeInterestRate = getInterestRate();
       setInterestRate(100/(primeInterestRate+2));
   }
    
      public double getPrimeInterestRate() {
        return primeInterestRate;
    }

    public void setPrimeInterestRate(double primeInterestRate) {
        this.primeInterestRate = primeInterestRate;
    }
    
    @Override
     public void setInterestRate(double primeInterestRate) {
        // You can directly set the prime interest rate here
        this.primeInterestRate = primeInterestRate;
         double totalInterestRate = primeInterestRate + 0.02;
         super.setInterestRate(totalInterestRate);
        
     }
     
   /* @Override
    public double calculateOwed(){
        return getLoanAmt()+(getLoanAmt() * setInterestRate * getTerm());
    }*/
      @Override
    public double calculateOwed() {
        // Calculate interest for the term
        double interest = getLoanAmt() * getInterestRate() * getTerm();
        // Total amount owed after the term
        return   interest;
    }
}

//OK NA
