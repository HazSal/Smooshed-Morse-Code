import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class morseDB {
	
	public static String[][] getMorse() {
		 String line;
		 String fName="morse.txt";
		 String[][] morseCode  = new String[26][2];//hardcoded for now
		try {
			FileReader fileReader=new FileReader(fName);
			BufferedReader bufferedReader=new BufferedReader(fileReader);

			int i=0;
			while((line=bufferedReader.readLine())!=null) {
				//extract morse code sequence for each letter and store in 2d array
				String[] keypair=line.split(" ");
				morseCode[i][0] = keypair[0];
				morseCode[i][1]	= keypair[1];		
				i++;
			}   
			bufferedReader.close();
		}
		catch(IOException ex){
			System.out.println("File "+fName+" could not be read");
			System.exit(0);
		}	
		return morseCode;
	}
}
