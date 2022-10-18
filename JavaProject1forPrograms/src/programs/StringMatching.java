import java.util.Scanner;

public class StringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s1 = sc.nextLine();
		String rev = "";
		String duplicate = s1;
		for(int i = s1.length()-1;i>=0;i++) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
		
		if(duplicate.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		
		
	}
	

}
