



public class Action21 extends Action2{
	//get the tmpBalance from the datastore and put it in balance
	public void a2(DataStore ds){
		((DataStore1)ds).setBalance(((DataStore1)ds).getTmpBalance());
	}
}