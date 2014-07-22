

public class Ready extends State{

	private int id;
	private Operation op;

	//all the states are initalized with the same MdaEfsm and Operation
	public Ready(MdaEfsm mda, Operation o){
		this.id=2;
		this.op=o;
		this.m=mda;
	}
	
	public void depositAbove(){
		op.a9();
		op.a7();
		m.changeState(2);
	}
	
	public void withdrawBelow(){
		op.a10();
		op.a7();
		m.changeState(3);
	}
	
	public void withdrawAbove(){
		op.a10();
		op.a7();
	}
	
	public void balance(){
		op.a8();
		op.a7();
	}
	
	public void lock(){
		op.a3();
		m.changeState(4);
	}
	
	public void exit(){
		op.a6();
		m.changeState(0);
	}
	
}