

public class Idle extends State{

	private int id;
	private Operation op;

	//all the states are initalized with the same MdaEfsm and Operation
	public Idle(MdaEfsm mda,Operation o){
		this.m=mda;
		this.id=0;
		this.op=o;
	}
	
	public void card(){
		op.a1();
		op.a2();
		op.a3();
		m.setAttempt(0);
		m.changeState(1);
	}

}