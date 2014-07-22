



public class Overdrawn extends State{

	private int id;
	private Operation op;

	public Overdrawn(MdaEfsm mda,Operation o){
		this.id=3;
		this.op=o;
		this.m=mda;
	}
	
	public void depositBelow(){
		op.a9();
		op.a7();
	}
	
	public void depositAbove(){
		op.a9();
		op.a7();
		m.changeState(2);
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