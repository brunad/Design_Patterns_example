


public class Action12 extends Action1{
	//get the tmpPin in the datastore and put it in pin
	public void a1(DataStore ds){
		((DataStore2)ds).setPin(((DataStore2)ds).getTmpPin());
	}
}