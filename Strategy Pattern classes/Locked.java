


public class Locked extends State{

	private int id;
	private Operation op;

	//all the states are initalized with the same MdaEfsm and Operation
	public Locked(MdaEfsm mda,Operation o){
		this.id=4;
		this.op=o;
		this.m=mda;
	}
	
	public void unlockAbove(){
		op.a7();
		m.changeState(2);
	}
	
	public void unlockBelow(){
		op.a7();
		m.changeState(3);
	}

}