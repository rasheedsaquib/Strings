package strings;
//Print the capital letters
public class PrintCapLetter {
	
	public static void main(String[] args) {

		String str = "Full Stuck Developer";
		
		for (int k = 0; k < str.length(); k++) {
			
			if (Character.isUpperCase(str.charAt(k))) {
				
				System.out.println(str.charAt(k));
			}
		}
	}
}