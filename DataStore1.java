


//Contains the data for atm1 and the setters/getters
public class DataStore1 extends DataStore{
	private String tmpPin;
	private int tmpBalance;
	private int penalty;
	private int deposit;
	private int withdraw;	
	private String pin;
	private int balance;
	
	public void setTmpPin(String x){
		tmpPin=x;
	}
	
	public String getTmpPin(){
		return tmpPin;
	}
	
	public void setTmpBalance(int x){
		tmpBalance=x;
	}
	
	public int getTmpBalance(){
		return tmpBalance;
	}
	
	public void setPenalty(int x){
		penalty=x;
	}
	
	public int getPenalty(){
		return penalty;
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
	
	public void setPin(String x){
		pin=x;
	}
	
	public String getPin(){
		return pin;
	}
	
	public void setBalance(int x){
		balance=x;
	}
	
	public int getBalance(){
		return balance;
	}
}



