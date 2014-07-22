
import java.util.Scanner;

//Contains the main method, initialize Operation and
//the MDA-EFSM, as well as a concrete factory and an
//ATM depending on the user's choice
public class Driver{
	public static void main(String args[]){	
		Operation op=new Operation();
		MdaEfsm mda=new MdaEfsm(op);	
		Scanner sc = new Scanner(System.in);
		System.out.println("Which ATM do you want to use ?");
		int c=sc.nextInt();
		
		if(c==1){
			Factory cf1=new ConcreteFactory1();
			op.configure(cf1);
			Atm1 atm1=new Atm1(mda,cf1);
		}
		
		if(c==2){
			Factory cf2=new ConcreteFactory2();
			op.configure(cf2);
			Atm2 atm2=new Atm2(mda,cf2);
		}
		
		if(c==3){
			Factory cf3=new ConcreteFactory3();
			op.configure(cf3);
			Atm3 atm3=new Atm3(mda,cf3);
		}	
	}
}