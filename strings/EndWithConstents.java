package strings;
//Ends with the contents
public class EndWithConstents {

	public static void main(String[] args) {
		
		String str1 = "Rasheed";
		
		String str2 = "Saquib";
		
		String end_str = "ed";

		boolean ends1 = str1.endsWith(end_str);
		
		boolean ends2 = str2.endsWith(end_str);

		System.out.println("\"" + str1 + "\" ends with " + "\"" + end_str + "\"? " + ends1);
		
		System.out.println("\"" + str2 + "\" ends with " + "\"" + end_str + "\"? " + ends2);
	}
}
