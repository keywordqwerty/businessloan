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
    
    public PersonalLoan(int loanNumber, String CustomerLastName, double loanAmt, int term){
       super(loanNumber, CustomerLastName, loanAmt,term);
       double primeInterestRate = getInterestRate();
       setInterestRate(100/(primeInterestRate+2));
   }
    
    public double calculateOwed(){
        return getLoanAmt()+(getLoanAmt() * setInterestRate * getTerm());
    }
}

//OK NA
