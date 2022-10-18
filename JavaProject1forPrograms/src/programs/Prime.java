import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner  = new Scanner(System.in);
	System.out.println("enter the limit:");
	int limit = scanner.nextInt();
	
	List <Integer> Primenumber = new ArrayList <>();
		for(int numberTocheck = 2; numberTocheck<=limit;numberTocheck++) {
			boolean isPrime = true;  
			for(int factor = 2; factor <= numberTocheck/2; factor++ ) {
				if(numberTocheck%factor == 0) {
					isPrime  = false;
				break;
				}
			}
			if(isPrime) {
				Primenumber.add(numberTocheck);
			}
			}
		System.out.println("theprimes are"+limit +": ");
		for(int number: Primenumber) {
			System.out.println(number);
		
		}
		
}
}