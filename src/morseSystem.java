
public class morseSystem {

	static Integer option;

	public void runSystem() {
		
			// Creates all objects in the DB
			
			do {
				menu.clearScreen();
				menu.menuMain(); //display main menu options
				option = smorse.sc.nextInt();
				
					if(option==1) { // Weekly Sessions by Theater
						encoder.encode();
						
					}
					else if(option==2) { //Search For Movie Session by Cineplex Theater
						System.out.println("Enter Name of Theater: ");
						
					}
					
					else if(option==3) {  //Search For Movie Session by Movie Title
						System.out.println("Enter Title of Movie: ");
					}
					
					else if(option==4) { //Bookings Menu
						
					}
					
					else
						System.out.println("Wrong Option!");
			}while (option!=5);		
	}
	
	
}
