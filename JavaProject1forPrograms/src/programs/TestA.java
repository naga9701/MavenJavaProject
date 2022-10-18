import java.util.Scanner;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int number = sc.nextInt();
		int rev = 0;
		int original_number = number;
		while(number!=0) {
			rev = rev * 10 + number%10;
			number = number/10;
		}
		System.out.println(rev);
	
	if(original_number == rev) {
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");
	}
}}
