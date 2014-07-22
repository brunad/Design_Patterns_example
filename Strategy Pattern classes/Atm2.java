import java.util.Scanner;

//This class is very similar to ATM1, for detail, you can refer to ATM1's comments
public class Atm2{

	private MdaEfsm m;
	private DataStore2 ds;
	
	public Atm2(MdaEfsm mda, Factory cf2){
		this.m=mda;
		ds=(DataStore2)cf2.getDataStore();
		create();
	}

	public void create(){
		m.create();
		menu();
	}
	
	//Method to display the ATM2's menu
	public void menu(){
		String[] choices={"1-card ","2-pin ","3-deposit ","4-withdraw ","5-balance ","0-exit"};
		int i;
		int c=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter -1 to quit the program");
		
		while(c!=-1){
			System.out.println("********************\n\n");
			
			for(i=0;i<6;i++){
				System.out.println(choices[i]);
			}
			
			c=sc.nextInt();
			switch (c){
				case 1: System.out.println("\nOperation: card(float x, int y)");
						System.out.println("Enter value of x: ");
						float x=sc.nextFloat();
						System.out.println("Enter value of y: ");
						int y=sc.nextInt();
						this.card(x,y);
						break;
				case 2: System.out.println("\nOperation: pin(int x)");
						System.out.println("Enter value of x: ");
						int s=sc.nextInt();
						this.pin(s);
						break;
				case 3: System.out.println("\nOperation: deposit(float d)");
						System.out.println("Enter value of d:");
						float d=sc.nextFloat();
						this.deposit(d);
						break;
				case 4: System.out.println("\nOperation: withdraw(float w)");
						System.out.println("Enter value of w:");
						float w=sc.nextFloat();
						this.withdraw(w);
						break;
				case 5: System.out.println("\nOperation: balance()");
						this.balance();
						break;
				case 0: this.exit();break;
				default: break;
			}
			
		}
		
		
	}
	
	public void card(float x, int y){
		ds.setTmpBalance(x);
		ds.setTmpPin(y);
		m.card();
	}
	
	public void pin(int x){
		if(x==ds.getPin()){
			if(ds.getBalance()<500) m.correctBelow();
			else m.correctAbove();
		}else{
			m.incorrectPin(2);
		}
	}
	
	public void deposit(float d){
		ds.setDeposit(d);
		if(ds.getBalance()+d<500){
			ds.setPenalty(20);
		}else{
			ds.setPenalty(0);
		}
		
		if(ds.getBalance()+d<500) m.depositBelow();
		else m.depositAbove();
	}
	
	public void withdraw(float w){
		ds.setWithdraw(w);
		if(ds.getBalance()-w<500){
			ds.setPenalty(20);
		}else{
			ds.setPenalty(0);
		}
		
		if(ds.getBalance()-w>0){
			if(ds.getBalance()-w<500) m.withdrawBelow();
			else m.withdrawAbove();
		}
	}
	
	public void balance(){
		m.balance();
	}
	
	
	public void exit(){
		m.exit();
	}


} 