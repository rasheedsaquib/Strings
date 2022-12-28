package strings;
//First letter into capital
public class FirstLetterCap {

	public static void main(String[] args) {

		String f = "full stuck developer";

		String firstLetter = f.substring(0, 1);
		
		String remainingLetters = f.substring(1, f.length());

		firstLetter = firstLetter.toUpperCase();

		f = firstLetter + remainingLetters;
		
		System.out.println("Name: " + f);

	}
}