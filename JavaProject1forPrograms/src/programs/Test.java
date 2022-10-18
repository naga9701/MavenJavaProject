
public class Test {
	int  i; 
	Test(int i){
		this.i = i;
	}
	 
	public int hashcode() {
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test(100);
		Test t2  = new Test(10);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.equals(t2));
	}
	

}
