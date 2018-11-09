
public class coordPoints 
{
	private int x;
	private int y;
	
	public coordPoints(int c, int d)
	{
		x = c;
		y = d;
	}
	
	public boolean compare(coordPoints cP)
	{
		if(cP.x()==x && cP.y() == y )
			return true;
		
		return false;
	}
	
	public String toString()
	{
		return "("+x+","+y+")";
	}
	
	public void changeX(int x1)
	{
		x = x1;
	}
	
	public void changeY(int y1)
	{
		y = y1;
	}
	
	public int x()
	{
		return x;
	}
	
	public int y()
	{
		return y;
	}
}
