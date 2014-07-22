


public class Action93 extends Action9{
	//Update the balance, doing the deposit. Get amount of the deposit, penalty and current balance from datastore
	public void a9(DataStore ds){
		((DataStore3)ds).setBalance( ((DataStore3)ds).getBalance()+((DataStore3)ds).getDeposit() );
	}	
}