import java.util.Scanner;

public class encoder {
	
	public static void encode(){
		Scanner sc = new Scanner(System.in);
		String[] msg;
		String input,encoded=null;
		int y = 0;
		boolean result = false;
		String[][] morseCode=morseDB.getMorse();
		
		do{
			System.out.println("Please enter the word you wish to encode.");
	 		input = sc.nextLine();
	    	msg = input.split("");
	    	/*grabs the input and splits it up into individual characters.
	    	loops through and stores the characters' morse code equivalent in encoded.
	    	(only the alphabet can be represented-other characters are ignored)*/
			for(int i = 0;i<=msg.length-1;i++){
				for(int x = 0;x<=morseCode.length-1;x++){
					if(msg[i].equals(morseCode[x][1])){
						if(y==0){
							encoded=morseCode[x][0];
							y++;
						}else{
							encoded=encoded+morseCode[x][0];	
						}
					}
				}
			}
			System.out.println("Your encoded word is " + encoded);
			encoded ="";
			result = true;
		}while(result == false);
		
	}
	
}
