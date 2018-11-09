import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class dungeonDetailer 
{
	private static final File f = new File("textFiles\\randomCastle.txt");
	private Random rand;
	private diceRoller dR;
	
	public dungeonDetailer()
	{
		rand = new Random();
		dR = new diceRoller();
	}
	
	public String createDungeon() throws FileNotFoundException
	{
		Scanner sc = new Scanner(f);
		String s = "";
		while(sc.hasNextLine())
		{
			s += getDesc(sc);
		}
		
		return s;
	}
	
	public String getDesc(Scanner sc)
	{
		String temp = "";
		
		String line = sc.nextLine();
		String arr[] = line.split("[\\s+|...]");
		arr[0] = arr[0].substring(1, arr[0].length());
		int len = Integer.parseInt(arr[0].trim());
		int roll = dR.dNum(len);
		
		for(int i = 1; i < arr.length; i++)
		{
			temp += arr[i] + " ";
		}
		temp += ": ";
		for(int i = 1; i <= len; i++)
		{
			if(i == roll)
			{
				temp += sc.nextLine();
			}
			else
				sc.nextLine();
		}
		return (temp.trim() + "\n");
	}
}
