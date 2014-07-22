import java.util.Scanner;

public class Atm1{

	private MdaEfsm m;
	private DataStore1 ds;
	
	//Constructor, called by the driver, initialize m and ds
	public Atm1(MdaEfsm mda, Factory cf1){
		this.m=mda;
		ds=(DataStore1)cf1.getDataStore();
		create();
	}

	public void create(){
		m.create();
		menu();
	}
	
	//Method to display the ATM1's menu
	public void menu(){
		//All choices are not available in every state, so they are stored in this array
		String[] choices={"1-card ","2-pin ","3-deposit ","4-withdraw ","5-balance ","6-lock ","7-unlock","0-exit()"};
		int i;
		int c=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter -1 to quit the program");
		
		while(c!=-1){
			System.out.println("********************\n\n");
			
			//Print only the available choices to the user.
			for(i=0;i<8;i++){
				System.out.println(choices[i]);
			}
			
			c=sc.nextInt();
			switch (c){
				case 1: System.out.println("\nOperation: card(int x, String y)");
						System.out.println("Enter value of x: ");
						int x=sc.nextInt();
						System.out.println("Enter value of y: ");
						String y=sc.next();
						this.card(x,y);
						break;
				case 2: System.out.println("\nOperation: pin(String x)");
						System.out.println("Enter value of x: ");
						String s=sc.next();
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
				case 6: System.out.println("\nOperation: lock(String x)");
						System.out.println("Enter value of x");
						String st=sc.next();
						this.lock(st);
						break;
				case 7: System.out.println("\nOperation: unlock(String x)");
						System.out.println("Enter value of x");
						String str=sc.next();
						this.unlock(str);
						break;
				case 0: this.exit();break;
				default: break;
			}
			
		}
		
		
	}
	
	public void card(int x, String y){
		ds.setTmpBalance(x); //Store x in tmpBalance in the datastore
		ds.setTmpPin(y); //Store y in tmpPin in the datastore
		m.card();
	}
	
	public void pin(String x){
		if(x.equals(ds.getPin())){ //If input equal to the pin in the datastore
			if(ds.getBalance()<1000) m.correctBelow();
			else m.correctAbove();
		}else{
			m.incorrectPin(3);
		}
	}
	
	public void deposit(int d){
		ds.setDeposit(d); //Store deposit in the datastore
		if(ds.getBalance()+d<1000){
			ds.setPenalty(10); //Store penalty in datastore
		}else{
			ds.setPenalty(0);
		}
		
		if(ds.getBalance()+d<1000) m.depositBelow();
		else m.depositAbove();
	}
	
	public void withdraw(int w){
		ds.setWithdraw(w); //Store withdraw in the datastore
		if(ds.getBalance()-w<1000){
			ds.setPenalty(10);
		}else{
			ds.setPenalty(0);
		}
		
		if(ds.getBalance()-w>0){
			if(ds.getBalance()-w<1000) m.withdrawBelow();
			else m.withdrawAbove();
		}
	}
	
	public void balance(){
		m.balance();
	}
	
	public void lock(String x){
		if(x.equals(ds.getPin())) m.lock();
	}
	
	public void unlock(String x){
		if(x.equals(ds.getPin())){
			if(ds.getBalance()<1000) m.unlockBelow();
			else m.unlockAbove();
		}
	}
	
	public void exit(){
		m.exit();
	}


} 