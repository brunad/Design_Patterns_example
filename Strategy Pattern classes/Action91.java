


public class Action91 extends Action9{
	//Update the balance, doing the deposit. Get amount of the deposit, penalty and current balance from datastore
	public void a9(DataStore ds){
		((DataStore1)ds).setBalance( ((DataStore1)ds).getBalance()+((DataStore1)ds).getDeposit()-((DataStore1)ds).getPenalty() );
	}
}