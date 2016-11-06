package lab8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiThread implements Runnable {
			public static void main(String[] args) throws InterruptedException {
				Thread t1=new Thread(new MultiThread("rainfall"));
				Thread t2=new Thread(new MultiThread("humidity"));
				Thread t3=new Thread(new MultiThread("temperature"));
				t1.start();
				t2.start();
				t3.start();
				t1.join();t2.join();t3.join();
				for (Float str : list2) {
					System.out.println("list1"+str);}
				for (Float str : list1) {
					System.out.println("list2"+str);}
				for (Float str : list3) {
					System.out.println("list3"+ str);}
				
				
			}
			static ArrayList<Float> list1;
			static ArrayList <Float>list2;
			static ArrayList <Float>list3;
			private String name;
			MultiThread(String aname){
				name=aname;
			}
			private BufferedReader br = null;
			 static ArrayList<Float> list;
			public void run() {
				String line = null;
				int count = 0;
				try {
					br = new BufferedReader(new FileReader(name));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while (true) {
					System.out.println(Thread.currentThread().getName());
					this.list = new ArrayList<Float>();
					synchronized (br) {
						try {
							while ((line = br.readLine()) != null) {
								if (count < 100) {
									Float val=Float.valueOf(line);
									list.add(val);
									count++;
								} else {
							
									count = 0;
									break;
								}
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					try {
						Thread.sleep(100);
						
						if(Thread.currentThread().getName().equals("Thread-0"));
						{
							list1= list;
						}
						if(Thread.currentThread().getName().equals("Thread-1"));
						{
							list2= list;
						}
						if(Thread.currentThread().getName().equals("Thread-2"));
						{
							list3=list;
						}
					
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (line == null)
						break;
				}
//				temp=getlist();

				}

			static List<Float> getlist(){
				return list;
			}

		

			
		
		

	}
		
