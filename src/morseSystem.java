
public class morseSystem {

	static Integer option;

	public void runSystem() {
		
			do {
				menu.clearScreen();
				menu.menuMain(); //display main menu options
				option = smorse.sc.nextInt();
				
				switch(option) {
				  case 1: // Encode characters to morse(only the english alphabet is implemented)
					  encoder.encode();
					  break;
				  case 2: 
					  encoder.encodeList();
					  break;
				  case 3: //display Preset menu options
					morseSystem.runPreset(); 
					//decoder.decodeMorsePresets();
					break;
				  case 4: 
					  System.out.println("Option unavailable. Please try again.");
					  break;
				  case 5:
					  System.out.println("Have a lovely day!");
					  break;
				  default:
					  System.out.println("Wrong Option!");
					  break;
				}
	}while (option!=5);
}
	public static void runPreset() {
		
		do {
			menu.clearScreen();
			menu.menuPresets(); 
			option = smorse.sc.nextInt();
			
			
			switch(option) {
			  case 1: 
				  decoder.decodeMorsePresets();
				  break;
			  case 2: 
				  System.exit(0);
				  break;
			  case 3: 
				  System.exit(0);
				break;
			  case 4: 
				  System.exit(0);
				  break;
			  case 5:
				  System.exit(0);
				  break;
			  case 6:
				  break;
			  case 7:
				  System.out.println("Have a lovely day!");
				  System.exit(0);
				  break;
			  default:
				  System.out.println("Wrong Option!");
				  break;
			}
		}while (option!=6);		
}
	
	
}
