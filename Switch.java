import java.util.Scanner;

public class Switch {
	static String Event = "";
	static int eventNumber;
	static String decision ="";
	private static Scanner k;
	
		static void switchHandle(){
		switch (eventNumber) {
		case 1:		Event = "you feel hungry";
		System.out.println(Event);
			break;
			
		case 2:		Event = "you get in line";
		System.out.println(Event);
			break;
			
		case 3:		Event = "You buy for lunch";
		System.out.println(Event);
			break;
			
		case 4:		Event = "are you thirsty";
		System.out.println(Event);
			break;
			
		case 5:		Event = "You buy a coke";
		System.out.println(Event);
			break;
			
		case 6:		Event = "you get some water";
		System.out.println(Event);
			break;
			
		case 7:		Event = "you eat your food while drinking water";
		System.out.println(Event);
			break;
			
		case 8:		Event = "you eat your food while drinking coke";
		System.out.println(Event);
			break;
			
		case 9:		Event = "You return your tray";
		System.out.println(Event);
			break;
			
		case 10:		Event = "you leave.";
		System.out.println(Event);
			break;
			
		}}
		
	    static void decisionHandle(){
	    	if(decision == "yes"){
	    		eventNumber = 5;
	    		switchHandle();	
				System.out.println(Event);
	    	}
	    	else {
	    		if(decision == "no")
		    		eventNumber = 6;
		    		switchHandle();	
					System.out.println(Event);
	    	}
	    }
	    
		public static void main(String[] args) {
			 k = new Scanner(System.in);
			
	eventNumber = 1;
	switchHandle();	
	eventNumber = 2;
	switchHandle();	
    eventNumber = 3;
	switchHandle();	
	eventNumber = 4;
	switchHandle();	
											decision = k.nextLine();
											decisionHandle();
	eventNumber = 7;
	switchHandle();	
	eventNumber = 8;
	switchHandle();	
	eventNumber = 9;
	switchHandle();	
	eventNumber = 10;
	switchHandle();	
		}
	}
