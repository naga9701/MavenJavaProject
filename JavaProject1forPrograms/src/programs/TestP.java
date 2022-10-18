import java.util.*;
public class TestP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<JSONObject> l  = new ArrayList<JSONObject>();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add("A");
		System.out.println(l);//10,20,50
		l.add(1, 40);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.set(0, 47);
		System.out.println(l);
		l.add(70);
		System.out.println(l);
	
	
		int index = l.indexOf(47);
		System.out.println(index);
		int i = l.indexOf(70);
		System.out.println(i);
		
			
	
	int i2 = l.lastIndexOf(70);
	System.out.println(i2);
	Object o = l.remove(2);
	System.out.println(o);
	System.out.println(l);
	l.add(null);
	System.out.println(l);
	
	
	
		
		}

}
