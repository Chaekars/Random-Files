import java.lang.*;
import java.io.*;
import java.util.*;
public class musicStuff 
{
	File[] list;
	ArrayList<String> songlist = new ArrayList<String>();
	int numSongs = 0;
	
	public musicStuff(File[] f)
	{
		list = f;
		sort();
	}
	
	public void sort()
	{
		
		for(int i = 0; i < list.length; i++)
		{
			File[] temp = list[i].listFiles();
			try{
			for(int j = 0 ; j < temp.length; j++)
			{
				String s = temp[j].getName();
				String ar[] = s.split("-");
				if((ar[ar.length-1].endsWith(".mp3")||ar[ar.length-1].endsWith(".wma")))
				{	
				songlist.add(ar[ar.length-1].trim());
				numSongs++;
				}
			}}
			catch(NullPointerException e){}
		}
	}
	
	public void songList()
	{
		System.out.println("Songs List: \n");
		Collections.sort(songlist);
		for(String s: songlist)
			System.out.println(s);
	}
	
	public String numSongs()
	{
		return "" + numSongs + " Songs.";
	}
}
