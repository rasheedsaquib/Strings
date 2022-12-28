package strings;

public class SmallToCap {
	public static void main(String[] args) {

		String word = "A.V college";
		
		System.out.println("Statement Before Converting: \n\n" + word);
		
		System.out.println("\nStatement After Converting is: ");
		
		System.out.println(word.replace("college", "COLLEGE"));
	}

}