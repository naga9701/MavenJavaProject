import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter array range:");
		
		int range = sc.nextInt();
		
		Scanner s1 = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.println("enter array values:");
		
		for(int i = 0;i<range;i++) {
		
			arr[i]= s1.nextInt();
		
		}
		
		
		for(int i = 0;i<range;i++) {
			System.out.println("array elemmts are :"+arr[i]);
		}

System.out.println("array efor sort:" +Arrays.toString(arr));
Arrays.sort(arr);
System.out.println("array after sort:"+Arrays.toString(arr));
 /*final int SortedArray() {	
		
	for(int i = 0;i<arr.length-1;i++) {
		for(int j = 0;j<arr.length-1;i++) {
			if(arr[j]<arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
	}
	for(int  i = 0;i<arr.length;i++) {
		
	
	System.out.println("array sorted: "+arr[i]);
		
	}

}*/

}
}


