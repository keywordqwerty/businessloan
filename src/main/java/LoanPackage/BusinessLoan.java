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
    private double setInterestRate;
    private double primeInterestRate;
    public BusinessLoan(){
        
    }
    
   public BusinessLoan(int loanNumber, String CustomerLastName, double loanAmt, int term){ /*check application java kuwang pag implement sa jtable ang owed*/
       super(loanNumber, CustomerLastName, loanAmt, term);
       double primeInterestRate = getInterestRate();
       setInterestRate(primeInterestRate+1);
    }
   
    public double getPrimeInterestRate() {
        return primeInterestRate;
    }
    
    public void setPrimeInterestRate(double primeInterestRate) {
        this.primeInterestRate = (100/(primeInterestRate+1));
    }
   
   /*@Override
   public double calculateOwed(){
       return getLoanAmt()+(getLoanAmt() * setInterestRate * getTerm());
   }*/
    @Override
    public double calculateOwed() {
        double interest = getLoanAmt() * getInterestRate() * getTerm();
        // Total amount owed after the term
        return getLoanAmt() + interest;    
    }
   
   @Override
   public void setInterestRate(double rate){   
       interestRate = rate;
   }
   }

//OK NA