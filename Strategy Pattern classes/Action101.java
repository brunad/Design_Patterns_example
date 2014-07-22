



public class Action101 extends Action10{
	//Do the withraw, update the current balance, getting the needed data from the datastore
	public void a10(DataStore ds){
		((DataStore1)ds).setBalance(((DataStore1)ds).getBalance()-((DataStore1)ds).getWithdraw()-((DataStore1)ds).getPenalty());
	}
}