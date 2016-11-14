/*  Aryaman 2015016
 * Mayank 2015055
 */

package lab8;

public class Main 
{
	public static void main(String[] args)
	{
		
			Producer1 var = new Producer1();
			Thread t1 = new Thread(var);
			t1.start();
			
			Consumer1 con = new Consumer1();
			Thread t2 = new Thread(con);
			t2.start();
			
			
			Producer2 var2 = new Producer2();
			Thread t3 = new Thread(var2);
			t3.start();
			
			Consumer2 con2 = new Consumer2();
			Thread t4 = new Thread(con2);
			t4.start();
			
			Producer3 var3 = new Producer3();
			Thread t5 = new Thread(var3);
			t5.start();
			
			Consumer3 con3 = new Consumer3();
			Thread t6 = new Thread(con3);
			t6.start();
			
			
		
	}
	
}
