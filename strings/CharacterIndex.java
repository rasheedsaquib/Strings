package strings;
//Character at the given index
public class CharacterIndex {
	
	public static void main(String[] args) {

		String str = "String Tasks";
		
		System.out.println("Original String = " + str);
		
		int index1 = str.charAt(0);
		
		int index2 = str.charAt(11);
		
		System.out.println("The character at position 0 is " + (char) index1);
		
		System.out.println("The character at position 11 is " + (char) index2);
	}
}
