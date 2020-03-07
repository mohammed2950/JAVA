package com.isi.java.tictactoe;

import java.net.ServerSocket;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int boardChoice = 0;
		int modeChoice = 0;
		System.out.println("Choose Game Mode");
		System.out.println("1 - FRIEND\n2 - AI MODE\n3 - NETWORKGAME\n4 JOIN NETOWRK- Exit ");
		modeChoice=sc.nextInt();
		try 
		{
			
		
		ServerSocket ss=new ServerSocket(6666);

		}
		catch(Exception e)
		{
			
		}
		while(true)
		{
		
			System.out.println("Choose One Option From The Below");
			System.out.println("1 – 3*3\n2 - 4*4\n3 - 5*5");
			boardChoice = sc.nextInt();
		
				switch(boardChoice)
				{
				case 1:
					new TicTocToe(3);
					break;
				case 2 :
					new TicTocToe(4);
					break;
				case 3:
					new TicTocToe(5);
					break;
				
				
					

				}
				
				switch(modeChoice)
				{
				
				case 4:
					exit();
					break;
				
				}
				
				}
		

	}

	private static void exit()
	{
		
		
		// TODO Auto-generated method stub
		System.exit(0);
		
	}
}
