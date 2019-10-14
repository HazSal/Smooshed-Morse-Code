import java.util.ArrayList;
import java.util.Scanner;

public class decoder {

	public static void decodeMorsePresets(){
		final long startTime = System.currentTimeMillis();
		String[] msg;
		String input,encoded=null;
		int pCount=0,z=0;
		boolean result = false;
		String[][] morseCode=morseDB.getMorse();
		int[] dotDashCount = new int[2],tempCount;
		ArrayList<String> morsePatternCodes= new ArrayList<String>();
		ArrayList<Integer> morsePatternCount= new ArrayList<Integer>();

		
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
								//tempCount = morseCount(morseCode[y][0]);
								//dotDashCount[0]+=tempCount[0];
								//dotDashCount[1]+=tempCount[1];
								encoded=morseCode[y][0];
								z++;
							}else{
								//tempCount = morseCount(morseCode[y][0]);
								//dotDashCount[0]+=tempCount[0];
								//dotDashCount[1]+=tempCount[1];
								encoded=encoded+morseCode[y][0];	
							}
						}
					}
				}
				morsePatternCodes.add(encoded);
				encoded ="";
				z=0;
			}
			
			//System.out.printf("The amount of dots in the list are: %,d %n",  dotDashCount[0]);
			//System.out.printf("The amount of dashes in the list are: %,d %n",  dotDashCount[1]);
			for (String pattern : morsePatternCodes) {
					for(int w = 0;w<=morsePatternCodes.size()-1;w++){
						if(morsePatternCodes.get(w).equals(pattern)){
						pCount++;
						}
					}
					if(pCount == 13){
						System.out.println("The sequence "+ pattern + " was the code for " + pCount + " different word(s).");
						break;
					}
					pCount = 0;
			}			
			final long endTime = System.currentTimeMillis();
			System.out.println("Total execution time: " + (endTime - startTime));
			result = true;
		}while(result == false);
		
	}
	
	
	
}
