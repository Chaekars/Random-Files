
public class coinCondenser
{
	private double change = 0;
	
	private int quarter = 0;
	private int dime = 0;
	private int nickel = 0;
	private int penny = 0;
	
	public coinCondenser(double change)
	{
		this.change = change;
		coinCounterO_1();
		}
	
	private void coinCounterO_1()
	{
		double temp = change;
		temp/=.25;
		quarter = (int)temp;
		temp = (change%=.25);
		temp/=.10;
		dime = (int)temp;
		temp = (change%=.10);
		temp/=.05;
		nickel = (int)temp;
		temp = (change%=.05);
		temp/=.01;
		penny = (int)Math.round(temp);
		
	}
	
	private void coinCounterO_n()
	{
		while(change > 0)
		{
			if(change > .25)
			{
				quarter++;
				change -= .25;
				continue;
			}
			else if(change > .10)
			{
				dime++;
				change -= .10;
				continue;
			} 
			else if(change > .05)
			{
				nickel++;
				change -= .05;
				continue;
			}
			else
			{
				penny++;
				change -= .01;
				continue;
			}
		}
	}
	
	public String toString()
	{
		return "Quarters: " + quarter + "\n" +
			   "Dimes: " + dime + "\n" +
			   "Nickels: " + nickel + "\n" +
			   "Pennies: " + penny + "\n";
	}
}
