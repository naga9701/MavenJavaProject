import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the size: " +" " );
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print(" array  values : " +" ");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int temp;
		int start = 0;
		int end = n-1;
		
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println("reverse values : ");
		
		for(int j = 0;j<n;j++) {
			System.out.println(" "+arr[j]);
		}
		
		
		 
	}

}
