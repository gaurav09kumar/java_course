class MyRunnable implements Runnable{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("Child thread");
            i++;
        }
    }
}
public class Demo1
{
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		int i = 0;
        while(i<10){ System.out.println("Main thread");
            i++;
        }
		
	}
}
