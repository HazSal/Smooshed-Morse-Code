
public class morseSystem {

	static Integer option;

	public void runSystem() {
		
			
			do {
				menu.clearScreen();
				menu.menuMain(); //display main menu options
				option = smorse.sc.nextInt();
				
					if(option==1) { // Encode characters to morse(only the english alphabet is implemented)
						encoder.encode();
						
					}
					else if(option==2) { 
						encoder.encodeList();
						
					}
					
					else if(option==3) {  
						System.out.println("N/A: ");
					}
					
					else if(option==4) { 
						System.out.println("N/A: ");
					}
					
					else
						System.out.println("Wrong Option!");
			}while (option!=5);		
	}
	
	
}
