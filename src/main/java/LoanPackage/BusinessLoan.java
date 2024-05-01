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
    
   public BusinessLoan(int loanNumber, String CustomerLastName, double loanAmt, double interestRate, int term){
       super(loanNumber, CustomerLastName, loanAmt, interestRate, term);
       double primeInterestRate = getInterestRate();
       setInterestRate(primeInterestRate+1);
    }
   }

//OK NA