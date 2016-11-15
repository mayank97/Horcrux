/*
 
	Dewansh Gautam 2015025
	Mayank Kumar   2015055
	
*/
package lab5;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class MediaSystem 
{
	public static void RateEdit()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("	1. Edit rating of a song.");
		System.out.println("	2. Edit the rating of a movie.");
		int request = in.nextInt();
		new Database();

		int oldRate = 0;
		int newRate = 0;
		if(request == 1)
		{
			System.out.println("		Enter the name of the song");
			String var = in.next();
			for(int j=0;j < Database.countSong;j++)
			{
				if(var.equals(Database.song[j].getTitle()))
				{
					oldRate = Integer.parseInt(Database.song[j].getRating());
					System.out.println("Enter the new rating");
					int rate = in.nextInt();
					newRate = rate;
					String rating = Integer.toString(rate);
					Database.song[j].setRating(rating);
					Database.write(1);
					break;
					
				}
			}
			System.out.printf("Rating of the song updated from %d to %d",oldRate, newRate);
			System.out.println();
		}
		else if(request == 2)
		{
			System.out.println("		Enter the name of the movie");
			String var = in.next();
			for(int j=0;j < Database.countMovie;j++)
			{
				if(var.equals(Database.movie[j].getTitle()))
				{
					oldRate = Integer.parseInt(Database.movie[j].getRating());
					System.out.println("Enter the new rating");
					int rate = in.nextInt();
					newRate = rate;
					String rating = Integer.toString(rate);
					Database.movie[j].setRating(rating);
					Database.write(2);
					break;
					
				}
			}
			System.out.printf("Rating of the movie updated from %d to %d",oldRate, newRate);
			System.out.println();
		}
		else
		{
			System.out.println("    Enter a valid data");
		}
	}
	
	public static void main(String[] args)
	{
		int sum = 0;
		while(sum!=-1)
		{
		System.out.println("Enter a valid choice(any character between a to h or 5(for encryption/decryption) : ");
		System.out.println("		OR");
		System.out.println("Press 0 to terminate the program.");
		
		
		Scanner in = new Scanner(System.in);
		String order = in.next();
		if((order).equals("0"))
		{
			System.out.println("Program Terminated.");
			break;
		}
		
		if((order).equals("f"))
		{
			RateEdit();
		}
		else if(order.equals("g"))
		{
			System.out.printf("Number of songs in the library : ");
			System.out.println(Database.countSong);
			System.out.printf("Number of movies in the library : ");
			System.out.println(Database.countMovie);
			System.out.println();
		}
		else if(order.equals("c"))
		{
			System.out.println("Enter the value of k");
			int k = in.nextInt();
			DataStructure.TreeSetSong(k);
			DataStructure.TreeSetMovie(k);
		}
		
		else if(order.equals("b"))
		{
			DataStructure.HashMap();
		}
		else if(order.equals("h"))
		{
			System.out.println("Enter the name of the movie : ");
			String movie = in.next();
		
			DataStructure.HashTable(movie);
		}
		else if(order.equals("e"))
		{
			System.out.println("Enter the name of the Director : ");
			String director = in.next();
			DataStructure.HashDirector(director);
		}
		else if(order.equals("d"))
		{

			System.out.println("Enter the genre of song to be searched : ");
			String genre = in.next();
			DataStructure.FindGenre(genre);
		}
		else if(order.equals("a"))
		{
			int i=1;
			Media.Serial(i);
		}
		else if(order.equals("5"))
		{
			File f1 = null;
			try 
			{
				StreamClass f2 = new StreamClass(f1);
				f2.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			System.out.println();
		System.out.println("The Song and Media files has been encrypted to EncrytedSong and EncryptedMovie files respectively.");
		System.out.println("The encrypted files has been decrypted and stored in DecryptedSong and DecryptedMovie respectively.");
		System.out.println();
		}
	
	sum++;
		}
		
		
		
}
	
}
