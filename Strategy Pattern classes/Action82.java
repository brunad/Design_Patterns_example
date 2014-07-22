



public class Action82 extends Action8{
	//display current balance -> get the balance from the datastore
	public void a8(DataStore ds){
		System.out.println("Current balance: " + ((DataStore2)ds).getBalance());
	}
}