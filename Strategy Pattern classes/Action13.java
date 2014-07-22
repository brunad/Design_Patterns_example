


public class Action13 extends Action1{
	//get the tmpPin in the datastore and put it in pin
	public void a1(DataStore ds){
		((DataStore3)ds).setPin(((DataStore3)ds).getTmpPin());
	}
}