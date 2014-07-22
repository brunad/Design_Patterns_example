





//Contains the data for atm3 and the setters/getters
public class DataStore3 extends DataStore{
	private int tmpPin;
	private int tmpBalance;	
	private int deposit;
	private int withdraw;	
	private int pin;
	private int balance;
	
	public void setTmpPin(int x){
		tmpPin=x;
	}
	
	public int getTmpPin(){
		return tmpPin;
	}
	
	public void setTmpBalance(int x){
		tmpBalance=x;
	}
	
	public int getTmpBalance(){
		return tmpBalance;
	}
	
	public void setDeposit(int x){
		deposit=x;
	}
	
	public int getDeposit(){
		return deposit;
	}
	
	public void setWithdraw(int x){
		withdraw=x;
	}
	
	public int getWithdraw(){
		return withdraw;
	}
	
	public void setPin(int x){
		pin=x;
	}
	
	public int getPin(){
		return pin;
	}
	
	public void setBalance(int x){
		balance=x;
	}
	
	public int getBalance(){
		return balance;
	}
}



