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
    
   public BusinessLoan(int loanNumber, String CustomerLastName, double loanAmt, int term){ /*check application java kuwang pag implement sa jtable ang owed*/
       super(loanNumber, CustomerLastName, loanAmt, term);
       double primeInterestRate = getInterestRate();
       setInterestRate(primeInterestRate+1);
    }
   
   public double calculateOwed(){
       return getLoanAmt()+(getLoanAmt() * setInterestRate * getTerm());
   }
   }

//OK NA