



public class Action23 extends Action2{
	//get the tmpBalance from the datastore and put it in balance
	public void a2(DataStore ds){
		((DataStore3)ds).setBalance(((DataStore3)ds).getTmpBalance());
	}
}