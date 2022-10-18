import java.util.Scanner;

public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter count value:");
		int count = sc.nextInt();
		for(int  i  =2;i<count;i++) {
			
		int c = a+b;
		System.out.println(" " +c);
		a = b;
		b = c;
		}
		
	}

}
