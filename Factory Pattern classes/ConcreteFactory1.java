


//Inititialize the Actions and datastore for atm1
public class ConcreteFactory1 extends Factory{
	public ConcreteFactory1(){
		ds=new DataStore1();
	}
	
	public Action1 createA1(){
		return (new Action11());
	}
	
	public Action2 createA2(){
		return (new Action21());
	}
	
	public Action3 createA3(){
		return (new Action3());
	}
	
	public Action4 createA4(){
		return (new Action4());
	}
	
	public Action5 createA5(){
		return (new Action5());
	}
	
	public Action6 createA6(){
		return (new Action6());
	}
	
	public Action7 createA7(){
		return (new Action7());
	}
	
	public Action8 createA8(){
		return (new Action81());
	}
	
	public Action9 createA9(){
		return (new Action91());
	}
	
	public Action10 createA10(){
		return (new Action101());
	}
}







