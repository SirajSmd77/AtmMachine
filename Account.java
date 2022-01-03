package AtmMAchine;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Account {
	Scanner input = new  Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	// set customer number 
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	//get the customer number
	public int getCustomerNumber() {
		return customerNumber;
	}
	//set the customer number
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	//get the customer number
	
	public int getPinNumber() {
		return pinNumber;
	
	}
	
	// get  checking account Balnce
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	// get saving account Balance 
	 public double getSavingBalance() {
		 return savingBalance;
	 }
	
	 
	 // Calculate of checking account withdraw 
	 public double calcCheckingWithdraw(double amount) {
		 checkingBalance=(checkingBalance-amount);
		 return checkingBalance;
	 }
	 // Calculate of Saving account withdraw 
	 public double calcSavingWithdraw(double amount) {
		 savingBalance=(savingBalance-amount);
		 return savingBalance;
	 }
		
	 // Calculate of checking account deposit
	 public double calcCheckingDeposit(double amount) {
		 checkingBalance=(checkingBalance+amount);
		 return checkingBalance;
	 }
	 // Calculate of saving account deposit
	 public double calcSavingDeposit(double amount) {
		 savingBalance=(savingBalance+amount);
		 return savingBalance;
	 }
	 
	 // customer  Checking account withdraw input 
	 
	  public void getCheckingWithdrawInput() {
		  System.out.println("checking account balance : "+ moneyFormat.format(checkingBalance));
		  System.out.println(" Amount you want to withdraw from checking  Account ");
         double amount  = input.nextDouble();
         
         
         if((checkingBalance-amount)>=0) {
        	 calcCheckingWithdraw(amount);
   		  System.out.println("New checking account balance "+ moneyFormat.format(checkingBalance));
         
         }else {
   		  System.out.println("Balance cannot be negative."+"\n");
   		  	
         }
	  }
	 //customer saving account  withdraw input
	  
	  public void  getSavingWithdrawInput() {
		  System.out.println("saving account balance : "+ moneyFormat.format(savingBalance));
		  System.out.println(" Amount you want to withdraw from saving Account ");
         double amount  = input.nextDouble();
         
         if((savingBalance-amount)>=0) {
        	 calcSavingWithdraw(amount);
   		  System.out.println("New checking account balance "+ savingBalance+ "\n");
         }else {
      		  System.out.println("Balance cannot be negative."+"\n");
      		  	
            }        
         
	  }
	 
	  
	  // customer checking account deposit input
	  public void  getCheckingDepositInput() {
		  System.out.println("saving account balance : "+ moneyFormat.format(checkingBalance));
		  System.out.println(" Amount you want to deposit from saving Account ");
         double amount  = input.nextDouble();
         
	  if((checkingBalance + amount )> =0) {
		  calcCheckingDeposit(amount);
		  
		  System.out.println("New checking account balance "+ moneyFormat.format(checkingBalance));
	         
      }else {
		  System.out.println("Balance cannot be negative."+"\n");
		  	
      }
	  }
	 
	 // customer saving account  deposit input
	  
	  public void  getSavingDepositInput() {
		  System.out.println("saving account balance : "+ moneyFormat.format(savingBalance));
		  System.out.println(" Amount you want to deposit from saving Account ");
         double amount  = input.nextDouble();
	 
         if ((savingBalance + amount > =0) {
   		  calcSavingDeposit(amount);
   		  
   		  System.out.println("New checking account balance "+ moneyFormat.format(savingBalance));
   	         
         }else {
   		  System.out.println("Balance cannot be negative."+"\n");
   		  	
         }
	 
	  } 
	 private int customerNumber;
	 private int pinNumber;
	 private  double checkingBalance=0;
	 private double savingBalance=0;
}
	 
	 