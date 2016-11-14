/*  Aryaman 2015016
 * Mayank 2015055
 */


package lab8;

import java.io.*;
import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.*;

public class Producer1 implements Runnable
{
	private ReentrantLock lock = new ReentrantLock();
	public String[] Array = new String[505];
	public static Float[] Temperature = new Float[600];
	public static Float[] Data = new Float[100];
	
	public void run()
	{
		
		try
		{
			FileReader f1 = new FileReader("temperature.txt");
			BufferedReader s1 = new BufferedReader(f1);
			
		
			int i=0;
		
			String row;
			
			while((row = s1.readLine())!= null )
			{
					Array[i] = row;
					
					i++;
			}
			
			i=0;
			int j;
			int k=0;
			for(j=0; j< 504;j++)
			{
				if(!(Array[i].equals("")))
				{
					Temperature[k] = Float.parseFloat(Array[i]);
					k++;
				}
				i++;
				
			}
			
			s1.close();
			
			
		}
		catch(IOException e)
		{
			System.out.println(e.getStackTrace());
		}
	
		
	
		
	synchronized(Temperature)

	{
		synchronized(Data)
		{
		for(int i = 0; i<100;i++)
		{
			Data[i] = Temperature[i];
		}
		Data.notifyAll();
		
		}
		int count = 1;
		while(count!=5)
		{
			try {
				Temperature.wait();
				synchronized(Temperature)
				{

					Temperature.notifyAll();

					System.out.println(Consumer1.min);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			count++;
		}
	}
		
		
		
		
		
	}
	
	public int time()
	{
		Random r = new Random();
		int t = r.nextInt(4) + 1 ;
		return (t*1000);
	}
}
