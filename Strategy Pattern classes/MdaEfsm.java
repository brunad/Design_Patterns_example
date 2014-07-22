

public class MdaEfsm{

	private State[] sl;
	private State cs;
	private int attempt;
	
	public MdaEfsm(Operation o){
		sl=new State[5];
		sl[0]=new Idle(this,o);
		sl[1]=new CheckPin(this,o);
		sl[2]=new Ready(this,o);
		sl[3]=new Overdrawn(this,o);
		sl[4]=new Locked(this,o);
		cs=new Init(this,o);
		attempt=0;
	}

	public void card(){
		cs.card();
	}
	
	public void create(){
		cs.create();
	}
	
	public void exit(){
		cs.exit();
	}
	
	public void incorrectPin(int max){
		cs.incorrectPin(max);
	}
	
	public void correctAbove(){
		cs.correctAbove();
	}
	
	public void depositAbove(){
		cs.depositAbove();
	}
	
	public void withdrawAbove(){
		cs.withdrawAbove();
	}
	
	public void correctBelow(){
		cs.correctBelow();
	}
	
	public void depositBelow(){
		cs.depositBelow();
	}
	
	public void withdrawBelow(){
		cs.withdrawBelow();
	}
	
	public void balance(){
		cs.balance();
	}
	
	public void lock(){
		cs.lock();
	}
	
	public void unlockAbove(){
		cs.unlockAbove();
	}
	
	public void unlockBelow(){
		cs.unlockBelow();
	}
	
	public void changeState(int i){
		cs = sl[i];
	}
	
	public void setAttempt(int x){
		attempt=x;
	}
	
	public int getAttempt(){
		return attempt;
	}
	

}