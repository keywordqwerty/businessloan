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
     private double primeInterestRate;
     private double totalInterestRate;
    public PersonalLoan(){    
    }
    
    public PersonalLoan(int loanNumber, String CustomerLastName, double loanAmt, int term){
       super(loanNumber, CustomerLastName, loanAmt,term);
       double primeInterestRate = getInterestRate();
       this.setInterestRate(primeInterestRate/100);
   }
    
      public double getPrimeInterestRate() {
        return (primeInterestRate+2)/100;
    }

    public void setPrimeInterestRate(double primeInterestRate) {
        this.primeInterestRate = primeInterestRate;
    }
    
    @Override
     public void setInterestRate(double primeInterestRate) {
        // You can directly set the prime interest rate here
        this.primeInterestRate = primeInterestRate;//wat gamit
         this.totalInterestRate = this.primeInterestRate + 0.02;
         super.setInterestRate(this.totalInterestRate);
     }
     
   /* @Override
    public double calculateOwed(){
        return getLoanAmt()+(getLoanAmt() * setInterestRate * getTerm());
    }*/
      @Override
    public double calculateOwed() {
        // Calculate interest for the term
        //OK NA
       // return this.getLoanAmt()*(float)Math.pow(1+this.getPrimeInterestRate(),getTerm());
      // System.out.println("PERSONALLOAN CLASS GETPRIMEINTERESTRATE() RESULT: " + getPrimeInterestRate());
       return this.getLoanAmt() + (getLoanAmt() * (this.getPrimeInterestRate()-0.02) * getTerm());
       //OK NA
    }
}

//OK NA
