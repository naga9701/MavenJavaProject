
package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPrograms {

	public static void main(String[] args) {
		
		int[] arr1 = {1,52,74,2,13,15,7,9};
		
		
		int [] arr2 = {25,17,64,31,20,10};
		
		List list = new ArrayList(Arrays.asList(arr1));
		
		list.addAll(Arrays.asList(arr2));
		
		Object[] obj = list.toArray();
	for(int i = 0;i<obj.length;i++) {
		
		System.out.println(obj[i]);
	}
		
		
		
				
				
		
		
	}
	
	
}
