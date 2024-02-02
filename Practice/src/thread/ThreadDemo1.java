package thread;

import java.io.Serializable;

public class ThreadDemo1 implements Runnable,Serializable
{
	public void run()
	{
		System.out.println("TH");
	}
	public static void main(String[] args) {
		ThreadDemo1 D1= new ThreadDemo1();
		Thread th=new Thread(D1 );
		th.start();
	}

}
