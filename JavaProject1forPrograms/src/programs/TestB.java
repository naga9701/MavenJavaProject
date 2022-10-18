import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String original_string = sc.nextLine();
		String compare_string = original_string;
		String rev = "";
		for(int i = original_string.length()-1;i>=0;i--) {
	
			rev = rev + original_string.charAt(i);
			
		}
		System.out.println(rev);
		if(compare_string.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
			
	}

}
