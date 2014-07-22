


public class CheckPin extends State{

	private int id;
	private Operation op;

	//all the states are initalized with the same MdaEfsm and Operation
	public CheckPin(MdaEfsm mda,Operation o){
		this.m=mda;
		this.id=1;
		this.op=o;
	}
	
	public void incorrectPin(int max){
		if(m.getAttempt()<max){
			m.setAttempt(m.getAttempt()+1);
			op.a3();
			op.a4();
		}else{
			op.a4();
			op.a5();
			op.a6();
			m.setAttempt(0);
			m.changeState(0);
		}
	}
	
	public void correctAbove(){
		op.a7();
		m.changeState(2);
	}
	
	public void correctBelow(){
		op.a7();
		m.changeState(3);
	}

}




