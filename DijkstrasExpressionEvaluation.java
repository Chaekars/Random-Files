
public class DijkstrasExpressionEvaluation
{
	public static void main(String[] args) 
	{
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		
		String line = "( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )";
		String[] c = line.split(" ");
		
		for(int i = 0; i < c.length; i++)
		{
			switch(c[i])
			{
			case "(" :  break;
			case "+" : ops.push(c[i]);
					    break;
			case "-" : ops.push(c[i]);
						break;	
			case "*" : ops.push(c[i]);
						break;
			case "/" : ops.push(c[i]);
						break;
			case "sqrt" : ops.push(c[i]);
						break;
			case ")" :
				String op = ops.pop();
				double v = vals.pop();
				switch(op)
				{
				case "+" : v = vals.pop() + v;
							break;
				case "-" : v = vals.pop() - v;
							break;
				case "*" : v = vals.pop() * v;
							break;
				case "/" : v = vals.pop() / v;
							break;
				case "sqrt" : v = Math.sqrt(v);
							break;
				}
				vals.push(v);
				break;
			default:
				vals.push(Double.parseDouble(c[i]));
			}
		}
		System.out.println(vals.pop());
	}
}
