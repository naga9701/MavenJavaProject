import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array range: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter values: ");
		 		int[] arr = new int[10];
		for(int  i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
	for(int i =0;i<n;i++)
	{
		System.out.println(arr[i]);
		
	}

	}
	



}
