



public class Action22 extends Action2{
	//get the tmpBalance from the datastore and put it in balance
	public void a2(DataStore ds){
		((DataStore2)ds).setBalance(((DataStore2)ds).getTmpBalance());
	}
}