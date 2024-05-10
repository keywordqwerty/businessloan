/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoanPackage;

/**
 *
 * @author Louis Valencia
 */


public class BusinessLoan extends Loan{
    private double primeInterestRate;
     private double totalInterestRate;
    public BusinessLoan(){    
    }
    
    public BusinessLoan(int loanNumber, String CustomerLastName, double loanAmt, int term){
       super(loanNumber, CustomerLastName, loanAmt,term);
       double primeInterestRate = getInterestRate();
       System.out.println(primeInterestRate + " <---from businessloan class constructor");
       this.setInterestRate(primeInterestRate/100);
   }
    
      public double getPrimeInterestRate() {
        return (primeInterestRate+1)/100;
    }

    public void setPrimeInterestRate(double primeInterestRate) {
        this.primeInterestRate = primeInterestRate;
    }
    
    @Override
     public void setInterestRate(double primeInterestRate) {
        // You can directly set the prime interest rate here
        this.primeInterestRate = primeInterestRate;//wat gamit
        this.totalInterestRate = this.primeInterestRate + 0.01;
         System.out.println("from setInterestRate from businessloan class: totalInterestRate: " + this.totalInterestRate);
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
        System.out.println("From calculateOwed method in BusinessLoan Class: the getTerm():  " + getTerm());
        System.out.println("from businessloan class: calculateOwed: getprimeinterestrate ->> " + (this.getPrimeInterestRate()-0.02));
        
       //return this.getLoanAmt()*(float)Math.pow(1+(this.getPrimeInterestRate()-0.02),getTerm());
       return this.getLoanAmt() + (this.getLoanAmt() * (this.getPrimeInterestRate()-0.02) * getTerm());
       //OK NA
    }
   }

//OK NA
//getTerm() is not the problem