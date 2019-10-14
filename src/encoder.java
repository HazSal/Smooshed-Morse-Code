
import java.util.ArrayList;
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
	
	public static void encodeList(){
		//final long startTime = System.currentTimeMillis();
		String[] msg;
		String input,encoded=null;
		int z = 0;
		boolean result = false;
		String[][] morseCode=morseDB.getMorse();
		int[] dotDashCount = new int[2],tempCount;
		
		ArrayList<String> enable1List=morseDB.getWordList();
		
		do{

	    	/*grabs the input and splits it up into individual characters.
	    	loops through and stores the characters' morse code equivalent in encoded.
	    	(only the alphabet can be represented-other characters are ignored)*/
			for(int i = 0;i<=enable1List.size()-1;i++){
				input = enable1List.get(i);
				msg=input.split("");
				
				for(int x = 0;x<=msg.length-1;x++){
					
					for(int y = 0;y<=morseCode.length-1;y++){
						if(msg[x].equals(morseCode[y][1])){
							if(z==0){
								tempCount = morseCount(morseCode[y][0]);
								dotDashCount[0]+=tempCount[0];
								dotDashCount[1]+=tempCount[1];
								encoded=morseCode[y][0];
								z++;
							}else{
								tempCount = morseCount(morseCode[y][0]);
								dotDashCount[0]+=tempCount[0];
								dotDashCount[1]+=tempCount[1];
								encoded=encoded+morseCode[y][0];	
							}
						}
					}
				}
				
				
				System.out.println(encoded);
				encoded ="";
				z=0;
			}
			System.out.printf("The amount of dots in the list are: %,d %n",  dotDashCount[0]);
			System.out.printf("The amount of dashes in the list are: %,d %n",  dotDashCount[1]);
			//final long endTime = System.currentTimeMillis();
			//System.out.println("Total execution time: " + (endTime - startTime));
			result = true;
		}while(result == false);
		
	}
	
	public static int[] morseCount(String morse){
		//used to count the total amount of dots and dashes of the output
		String[] morseSplit = morse.split("");
		int[] dotDashCount = new int[2];
		for(int i = 0;i<=morseSplit.length-1;i++){
			if(morseSplit[i].equals(".")){
				dotDashCount[0]+=1;
			}else{
				dotDashCount[1]+=1;
			}
			
		}
		return dotDashCount;
	}
}
