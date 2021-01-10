package Drama;

/** MUHAMMAD HAFIZ BIN SUKHRI 
 * (275414)**/
import java.util.Scanner;
public class MainDrama {

	public static void main(String[] args) {
	Scanner Keyboard = new Scanner (System.in);
	
	System.out.println ("Please Select The Drama Genre Keyword: (R=Romance) (A=Action): "); 
	 char choice = Keyboard.nextLine().charAt(0);
	 
	 
	 Action A = new Action();
	 Action A2 = new Action();
	 Romance R = new Romance();
	 Romance R2 = new Romance();
	 
	 
      
	if (choice == 'A'|| choice == 'a'){ 
			 
		    A.details();

	}		    
		    
		     if (choice == 'R'|| choice == 'r'){
	
		      R.details();
		 
		 
		 

		 
		 
	 }
	}
	}

	
	

		


	



	


