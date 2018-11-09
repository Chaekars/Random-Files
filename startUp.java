import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
public class startUp 
{
	public static void main(String args[]) throws IOException
	{
		File folder = new File("F:\\");
		File[] list = folder.listFiles();
		musicStuff mS = new musicStuff(list);
		System.out.println(mS.numSongs());
		mS.songList();
	}
}
