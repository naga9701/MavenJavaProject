
package programs;

public class Sumof1DArray {

	
	public static void main(String[] args) {
		
		int a[]= {1,5,3,7,2,6,9};
		
		
		int b[] = new int[a.length];
		
		int []sum ;
		for(int i =1 ;i<a.length;i++) {
			
		a[i] = a[i-1]+a[i];
		
	System.out.println(a[i]);
		}
		
		
	}
}
