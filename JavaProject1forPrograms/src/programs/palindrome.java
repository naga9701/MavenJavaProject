import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc  = new Scanner(System.in);
		System.out.println("enetr the number:");
		String number = Sc.nextLine();
		String original_number = number;
		String rev = "";
		for(int  i = number.length()-1;i>=0;i--){
			rev= rev+number.charAt(i);
			
		}
	System.out.println(rev);
	
	if(original_number.equals(rev)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
	}
}
