


public class Operation{
	//Reference to the datastore and pointers to the Actions
	private DataStore ds;
	private Action1 p1;
	private Action2 p2;
	private Action3 p3;
	private Action4 p4;
	private Action5 p5;
	private Action6 p6;
	private Action7 p7;
	private Action8 p8;
	private Action9 p9;
	private Action10 p10;

	public void a1(){
		p1.a1(ds);
	}
	
	public void a2(){
		p2.a2(ds);
	}
	
	public void a3(){
		p3.a3();
	}
	
	public void a4(){
		p4.a4();
	}
	
	public void a5(){
		p5.a5();
	}
	
	public void a6(){
		p6.a6();
	}
	
	public void a7(){
		p7.a7();
	}
	
	public void a8(){
		p8.a8(ds);
	}
	
	public void a9(){
		p9.a9(ds);
	}
	
	public void a10(){
		p10.a10(ds);
	}
	
	//Method called by the Driver to initialize the
	//different pointers
	public void configure(Factory cf1){
		ds=cf1.getDataStore();
		p1=cf1.createA1();
		p2=cf1.createA2();
		p3=cf1.createA3();
		p4=cf1.createA4();
		p5=cf1.createA5();
		p6=cf1.createA6();
		p7=cf1.createA7();
		p8=cf1.createA8();
		p9=cf1.createA9();
		p10=cf1.createA10();
	}
	
}









