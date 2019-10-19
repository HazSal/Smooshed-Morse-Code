
final class menu {

	 public static void menuMain() {
		System .out.println("/////// -  sMorse -  ///////");
		System.out.println("1. Encode a word using morse.");
		System.out.println("2. Encode a word list."); 
		System.out.println("3. Run Encoding\\Decoding presets");
		System.out.println("4. N/A");
		System.out.println("5. Exit sMorse");
		System.out.print("Enter choice: ");
	}
	 public static void menuPresets() {
		System .out.println("/////// -  sMorse Presets -  ///////");
		System.out.println("1. Find the only sequence that's the code for 13 different words.");
		System.out.println("2. Find the only word that has 15 dashes in a row."); 
		System.out.println("3. Call a word perfectly balanced if its code has the same number of dots as dashes.(Not countermeasures)");
		System.out.println("4. Find the only 13-letter word that encodes to a palindrome.");
		System.out.println("5. --.---.---.-- is one of five 13-character sequences that does not appear in the encoding of any word. Find the other four.");
		System.out.println("6. Return to main menu.");
		System.out.println("7. Exit sMorse");
		System.out.print("Enter choice: ");
	}
	public static void clearScreen()  {  //Empty lines to clear screen
		for (int i=0; i<1; i++)
		    System.out.println();
	   }
}
