import java.util.Scanner;

public class array {
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 0;
		
	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size : ");
		int n = sc.nextInt();
		 int[] arr = new int[n];
		System.out.println("enter the array values : ");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int size = arr.length;
		for(int i = 0;i<size;i++) {
			for(int j =0;j<size;j++) {
				if(arr[i]<arr[j]) {
				temp  = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
			
		}
		for(int i = 0;i<size;i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println("array length " +size);
		
		
			
			int max = arr[0];
			for(int i = 0;i<arr.length;i++) {
				if(arr[i]<max) {
					max = arr[i];
					
				}
				
				System.out.println("max value " +arr[i]);
			}
			
			
		
			int min = arr[0];
			for(int i = 0;i<arr.length;i++) {
				if(min>arr[0]) {
					min = arr[i];
					
				}
			}
			for(int i = 0;i<size;i++)
		
		System.out.println("min value " +arr[i]);
		
		System.out.println();
		System.out.println("second largest value " +arr[size-2] );
		
		
		int sum = 0;
		for(int i : arr) {
			sum +=i;
		}
		for(int i = 0;i<size;i++)
		System.out.println(" total " +arr[i]);
		
	
		for(int i = 0; i<n/2;i++) {
			temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		for(int i =0;i<size;i++)
		System.out.println("reverse " +arr[i]);
	
	
	
	}
	
	
	}
