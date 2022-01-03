package AtmMAchine;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Map;


public class OptionMenu  extends Account {
	
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'  ###,##0.00");
	
	HashMap<Integer,Integer> data =  new HashMap<Integer, Integer>();
	
	// Validate login  customer number and pin

	public void getLogin() throws IOException {
		int x= 1;
		do {
			try {
				data.put(9876543 , 9876);
				data.put(87654321, 8765);
				System.out.println("Welcome to the ATM PROJECT");
				System.out.println("Enter Customer Number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter  your Pin Number : ");
				setPinNumber(menuInput.nextInt());
		
		}catch (Exception e ) {
			System.out.println("\n"+"Invalid Character(s) . Only Numbers ." +"\n");
			x=2;
			
		}for(Map.Entry <Integer,Integer> entry : data.entrySet()) {
			if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()) {
				getAccountType();
			}
		}
		System.out.println("\n  + Wrong Customer Number or Pin Number. " +"\n");
	}while(x==1);
	}
	
// Display Account Type  menu with Selection

   public void  getAccountType() {
	   System.out.println("Select Acccount you want To Acess : ");
	   System.out.println("Type 1 - Checking Account");
	   System.out.println("Type 2 - Saving Account");
	   System.out.println("Type 3 - Exit");
	   System.out.println("Choice: ");
	   
	   selection = menuInput.nextInt();
	   
	   switch(selection) {
	   case 1 : 
		   getChecking();
		   break; 
	   case 2 : 
		   getSaving();
		   break;
	   case 3 : 
		   System.out.println("Thank You  for Using ATM  , Bye. ");
		   break;
		default :
			System.out.println("\n" + "Invalid Choice" +"\n");
			getAccountType(); 
			
	   }
	}
       public void getChecking() {
    	   System.out.println("Select Acccount you want To Acess : ");
    	   System.out.println("Type 1 - View Balance");
    	   System.out.println("Type 2 - Withdraw fund");
    	   System.out.println("Type 3 - Deposit fund");
    	   System.out.println("Type 4 - Exit");
    	   System.out.println("Choice: ");
    	   
    	   selection = menuInput.nextInt();
    	   switch (selection) {
    	   case 1 :
    		   System.out.println("Checking Account Balance : " + moneyFormat.format(getCheckingBalance()));
    		   getAccountType();
    		   break;
    		   
    		   case 2 :
    			   getCheckingWithdrawInput();
    			   getAccountType();
    			   break;
    			   
    		   case 3 :
    			   getCheckingDepositInput();
    			   getAccountType();
    			   break;
    			   
    		   case 4 :
    			  System.out.println("Thank You  for Using ATM  , Bye. ");
    			    break;
    			   
    			   
    		   default :
    				System.out.println("\n" + "Invalid Choice" +"\n");
    				getChecking();    
    			   
    	   }
       }  
    			   
       public void getSaving() {
    	   System.out.println("Select Acccount you want To Acess : ");
    	   System.out.println("Type 1 - View Balance");
    	   System.out.println("Type 2 - Withdraw fund");
    	   System.out.println("Type 3 - Deposit fund");
    	   System.out.println("Type 4 - Exit");
    	   System.out.println("Choice: ");
    	   
    			   
    	   selection = menuInput.nextInt();
    	   switch (selection) {
    	   case 1 :
    		   System.out.println("Checking Account Balance : " + moneyFormat.format(getSavingBalance()));
    		   getAccountType();
    		   break;
    		   
    		   case 2 :
    			   getSavingWithdrawInput();
    			   getAccountType();
    			   break;
    			   
    		   case 3 :
    			   getSavingDepositInput();
    			   getAccountType();
    			   break;
    			   
    		   case 4 :
    			  System.out.println("Thank You  for Using ATM  , Bye. ");
    			    break;
    			   
    			   
    		   default :
    				System.out.println("\n" + "Invalid Choice" +"\n");
    				getSaving();    
    			   
    	   }
       }  
       
       int selection;
}
    			   
    			   
    			   
    	   
