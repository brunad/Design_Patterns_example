


public class Action92 extends Action9{
	//Update the balance, doing the deposit. Get amount of the deposit, penalty and current balance from datastore
	public void a9(DataStore ds){
		((DataStore2)ds).setBalance( ((DataStore2)ds).getBalance()+((DataStore2)ds).getDeposit()-((DataStore2)ds).getPenalty() );
	}	
}