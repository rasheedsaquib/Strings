package strings;
//Specified sequence of character values
public class SpecifiedOfChar {
	
	public static void main(String[] args) {

		String str1 = "Welcome to CoreJava";
		
		String str2 = "to";
		
		System.out.println("Original String: " + str1);
		
		System.out.println("Specified sequence of char values: " + str2);
		
		System.out.println(str1.contains(str2));
	}
}