/*  Aryaman 2015016
 * Mayank 2015055
 */


package lab8;
import java.util.*;

public class Consumer1 implements Runnable,Observer
{
	public int ID;
	public static float min;
	public void update(Observable o , Object arg)
	{
		ID = (int) arg;
	}


	public void run()
	{
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	synchronized(Producer1.Data)
	{	
		
		min = Producer1.Temperature[0];
		
			for(int i = 1; i< 500;i++)
			{
			
				if(Producer1.Temperature[i] < min)
				{
					min = Producer1.Temperature[i];
				}	
				if(i==99 || i == 199 || i == 299 || i==399 || i == 499)
				{	
					
					synchronized(Producer1.Temperature)
					{
					Producer1.Temperature.notifyAll();
					}
					
				
					min = Producer1.Temperature[i+1];
					
					try {
						synchronized(Producer1.Temperature)
						{
						Producer1.Temperature.wait();
						}
						} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					//wait
					//return result of computation to producer
				}
	
			
			synchronized(Producer1.Data)
			{	
				
				min = Producer2.Rainfall[0];
				
					for(int i = 1; i< 500;i++)
					{
					
						if(Producer2.Rainfall[i] < min)
						{
							min = Producer2.Rainfall[i];
						}	
						if(i==99 || i == 199 || i == 299 || i==399 || i == 499)
						{	
							
							synchronized(Producer2.Rainfall)
							{
							Producer2.Rainfall.notifyAll();
							}
							
						
							min = Producer2.Rainfall[i+1];
							
							try {
								synchronized(Producer2.Rainfall)
								{
								Producer2.Rainfall.wait();
								}
								} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
							//wait
							//return result of computation to producer
						}
			
					synchronized(Producer1.Data)
					{	
						
						min = Producer3.Humidity[0];
						
							for(int i = 1; i< 500;i++)
							{
							
								if(Producer3.Humidity[i] < min)
								{
									min = Producer3.Humidity[i];
								}	
								if(i==99 || i == 199 || i == 299 || i==399 || i == 499)
								{	
									
									synchronized(Producer3.Humidity)
									{
									Producer3.Humidity.notifyAll();
									}
									
								
									min = Producer3.Humidity[i+1];
									
									try {
										synchronized(Producer3.Humidity)
										{
										Producer3.Humidity.wait();
										}
										} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
									//wait
									//return result of computation to producer
								}
					
					}
			}
	}
	}
}

		
		
