import java.util.Scanner;


public class Atm3{

	private MdaEfsm m;
	private DataStore3 ds;
	
	public Atm3(MdaEfsm mda, Factory cf3){
		this.m=mda;
		ds=(DataStore3)cf3.getDataStore();
		create();
	}

	public void create(){
		m.create();
		menu();
	}
	
	//Method to display the ATM1's menu
	public void menu(){
		String[] choices={"1-card ","2-pin ","3-deposit ","4-withdraw ","5-balance ","6-lock ","7-unlock","0-exit()"};
		int i;
		int c=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter -1 to quit the program");
		
		while(c!=-1){
			System.out.println("********************\n\n");
			
			for(i=0;i<8;i++){
				System.out.println(choices[i]);
			}
			
			c=sc.nextInt();
			switch (c){
				case 1: System.out.println("\nOperation: card(int x, int y)");
						System.out.println("Enter value of x: ");
						int x=sc.nextInt();
						System.out.println("Enter value of y: ");
						int y=sc.nextInt();
						this.card(x,y);
						break;
				case 2: System.out.println("\nOperation: pin(int x)");
						System.out.println("Enter value of x: ");
						int s=sc.nextInt();
						this.pin(s);
						break;
				case 3: System.out.println("\nOperation: deposit(int d)");
						System.out.println("Enter value of d:");
						int d=sc.nextInt();
						this.deposit(d);
						break;
				case 4: System.out.println("\nOperation: withdraw(int w)");
						System.out.println("Enter value of w:");
						int w=sc.nextInt();
						this.withdraw(w);
						break;
				case 5: System.out.println("\nOperation: balance()");
						this.balance();
						break;
				case 6: this.lock();
						break;
				case 7: this.unlock();
						break;
				case 0: this.exit();break;
				default: break;
			}
			
		}
		
		
	}
	
	public void card(int x, int y){
		ds.setTmpBalance(x);
		ds.setTmpPin(y);
		m.card();
	}
	
	public void pin(int x){
		if(x==ds.getPin()){
			if(ds.getBalance()<100) m.correctBelow();
			else m.correctAbove();
		}else{
			m.incorrectPin(0);
		}
	}
	
	public void deposit(int d){
		ds.setDeposit(d);
		if(ds.getBalance()+d<100) m.depositBelow();
		else m.depositAbove();
	}
	
	public void withdraw(int w){
		ds.setWithdraw(w);
		if(ds.getBalance()-w>0){
			if(ds.getBalance()-w<100) m.withdrawBelow();
			else m.withdrawAbove();
		}
	}
	
	public void balance(){
		m.balance();
	}
	
	public void lock(){
		m.lock();
	}
	
	public void unlock(){
		if(ds.getBalance()<100) m.unlockBelow();
		else m.unlockAbove();
	}
	
	public void exit(){
		m.exit();
	}


} 