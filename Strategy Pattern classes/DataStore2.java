





//Contains the data for atm2 and the setters/getters
public class DataStore2 extends DataStore{
	private int tmpPin;
	private float tmpBalance;
	private float penalty;
	private float deposit;
	private float withdraw;	
	private int pin;
	private float balance;
	
	public void setTmpPin(int x){
		tmpPin=x;
	}
	
	public int getTmpPin(){
		return tmpPin;
	}
	
	public void setTmpBalance(float x){
		tmpBalance=x;
	}
	
	public float getTmpBalance(){
		return tmpBalance;
	}
	
	public void setPenalty(float x){
		penalty=x;
	}
	
	public float getPenalty(){
		return penalty;
	}
	
	public void setDeposit(float x){
		deposit=x;
	}
	
	public float getDeposit(){
		return deposit;
	}
	
	public void setWithdraw(float x){
		withdraw=x;
	}
	
	public float getWithdraw(){
		return withdraw;
	}
	
	public void setPin(int x){
		pin=x;
	}
	
	public int getPin(){
		return pin;
	}
	
	public void setBalance(float x){
		balance=x;
	}
	
	public float getBalance(){
		return balance;
	}
}



