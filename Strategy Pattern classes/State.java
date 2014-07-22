


//Contains all the methods of the different state, with empty body. So if the user gives a wrong input, 
//the program will do nothing. These methods are overridden in the subclasses of State.

public class State{

	protected MdaEfsm m;

	public void card(){}
	
	public void create(){}
	
	public void exit(){}

	public void incorrectPin(int max){}
	
	public void correctAbove(){}
	
	public void depositAbove(){}
	
	public void withdrawAbove(){}
	
	public void correctBelow(){}
	
	public void depositBelow(){}
	
	public void withdrawBelow(){}
	
	public void balance(){}
	
	public void lock(){}
	
	public void unlockAbove(){}
	
	public void unlockBelow(){}
	

}