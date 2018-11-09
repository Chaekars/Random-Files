
public class PIDayProject 
{
	public static void main(String args[])
	{
		int i = 1;
		double k = 0;
		for(int j = 1; j < 1000000; j++)
		{
			if(j%2 == 1)
			{
				k+=4.0*(1.0/i);
			}
			else
				k-=4.0*(1.0/i);
			System.out.println(k);
			i+=2;
		}
	}
}
