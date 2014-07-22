


//Initial State. It’s method create is called when an atm is created, calling the method create()
//in the MdaEfsm. It puts the system in the idle state.

public class Init extends State{

	private int id;
	private Operation op;

	public Init(MdaEfsm mda,Operation o){
		this.id=5;
		this.op=o;
		this.m=mda;
	}
	
	public void create(){
		m.changeState(0);
	}
	
}