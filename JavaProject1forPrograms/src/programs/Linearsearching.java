import java.util.*;

public class Linearsearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,6,2,1,3};
		int data  = 3;
		int found = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==data) {
				System.out.println("element found at index " +i);
				found = 1 ;
				break;
			}	
		}
		if(found == 0) {
			System.out.println("element not found");
		}
		
	}
}
		



