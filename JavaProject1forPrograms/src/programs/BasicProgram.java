
public class BasicProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().isDaemon());
		Thread.currentThread().setDaemon(true);
	}

}
