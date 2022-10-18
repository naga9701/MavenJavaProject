import java.util.*;
import java.util.Arrays;
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {10,20,30,40};
		int[] a2 = {10,20,30,40};
		boolean status = Arrays.equals(a1, a2);
		 if(status == true) {
			 System.out.println("arrays are equal");
		 }
		 else {
			 System.out.println("arrays are not equal");
		 }
	//2nd approach
	//boolean status = true;
	if(a1.length==a2.length)
	{
		for( int i =0;i<a1.length;i++)
		{
		
			if(a1[i]!=a2[i]) 
			{
			status = false;
			}
		
		}
	}
	
	else {
			status = false;
		}
	
		if(status == true) {
			System.out.println("arrays are equal");
			
		}
		else {
			System.out.println("arrays are not equal");
		}
	}

}


