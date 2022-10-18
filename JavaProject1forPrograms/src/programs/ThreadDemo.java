
public class ThreadDemo {
	public static void main(String[] args) {
		Display d = new Display();
		myThread t1  = new myThread(d,"nagarjuna");
		t1.start();
	}
}
class Display{
	public void wish(String name) {
		
			for(int i = 0;i<=10;i++) {
				System.out.println("good morning : ");
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}



class myThread extends Thread{
	Display d;
	String name;
	myThread(Display d, String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
	
}