package thread;

import java.io.BufferedReader;
import java.nio.Buffer;

public class ThreadDemo extends Thread{
	public void run()
	{
		System.out.println("Thread Execute");
	}
	public static void main(String[] args)
	{
	
		ThreadDemo D=new ThreadDemo();
		D.start();
	}

}
