import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

public class cPtester 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(new File("coords.txt"));
		ArrayList<coordPoints> al = new ArrayList<coordPoints>();
		int a = 0;
		while(sc.hasNextLine())
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			coordPoints cP = new coordPoints(x,y);
			al.add(cP);
			a++;
		}
		System.out.println(a + " coordinate points.");
		int sumx = 0;
		int sumy = 0;
		for(int i = 0; i < al.size(); i++)
		{
			sumx += al.get(i).getX();
			sumy += al.get(i).getY();
		}
		System.out.println("Sum of all x values: " + sumx);
		System.out.println("Sum of all y values: " + sumy);
		System.out.println(al);
		
		int minx = al.get(0).getX();
		int miny = al.get(0).getY();
		int minvalx = 0;
		int minvaly = 0;
		for(int i = 1; i < al.size(); i++)
		{
			int x1 = al.get(i).getX();
			int y1 = al.get(i).getY();
			if(x1 > minx)
			{
				minx = x1;
				minvalx = i;
			}
			if(y1 > miny)
			{
				miny = y1;
				minvaly = i;
			}
		}
		
		String arr[][] = new String[al.get(minvaly).getY()+1][al.get(minvalx).getX()];
		for(int i = 0; i < arr.length; i++)
		{
			Arrays.fill(arr[i], "*");
		}
		String s = "a";
		for(int i = 0; i < al.size(); i++)
		{
			int x = al.get(i).getX();
			int y = al.get(i).getY();
			
			arr[arr.length-y-1][x-1] = s;
			s = "" + (char)(s.charAt(0)+1);
		}
		int k = arr.length-1;
		int t = 1;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				if(j == 0)
				{
					System.out.print(k-- + " ");
					
				}
				if(i == arr.length-1)
				{
					System.out.print(t++ + " ");
					continue;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
