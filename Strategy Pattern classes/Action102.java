



public class Action102 extends Action10{
	//Do the withraw, update the current balance, getting the needed data from the datastore
	public void a10(DataStore ds){
		((DataStore2)ds).setBalance(((DataStore2)ds).getBalance()-((DataStore2)ds).getWithdraw()-((DataStore2)ds).getPenalty());
	}	
}