



public abstract class Factory{
	//Superclass, declare the methods the concrete
	//factories will implement
	protected DataStore ds;
	
	public DataStore getDataStore(){
		return ds;
	}

	public abstract Action1 createA1();
	public abstract Action2 createA2();
	public abstract Action3 createA3();
	public abstract Action4 createA4();
	public abstract Action5 createA5();
	public abstract Action6 createA6();
	public abstract Action7 createA7();
	public abstract Action8 createA8();
	public abstract Action9 createA9();	
	public abstract Action10 createA10();
}