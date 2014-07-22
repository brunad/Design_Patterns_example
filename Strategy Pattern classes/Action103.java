



public class Action103 extends Action10{
	//Do the withraw, update the current balance, getting the needed data from the datastore
	public void a10(DataStore ds){
		((DataStore3)ds).setBalance(((DataStore3)ds).getBalance()-((DataStore3)ds).getWithdraw());
	}	
}