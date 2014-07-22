


public class Action11 extends Action1{
	//get the tmpPin in the datastore and put it in pin
	public void a1(DataStore ds){
		((DataStore1)ds).setPin(((DataStore1)ds).getTmpPin());
	}
	
}