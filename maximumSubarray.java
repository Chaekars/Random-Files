public class maximumSubarray 
{
	/* This class is meant as a very basic comprehension of finding a maximum sum sub-array
	 * using the divide-and-conquer method. It also requires the use of an external class
	 * which mimics that of tuples found in other languages.*/
	public static void main(String[] args) 
	{
		int arr[] = {18,-20,35,-20,6,-20,80,-20,15,-20,21}; //array
		
		tuple t = findMaximumSubarray(arr,0,arr.length-1); //finds max sub-array bounds and sum
		
		System.out.println(t.low);//prints bottom bound
		System.out.println(t.high);//prints top bound
		System.out.println(t.sum);//prints sum
		for(int i = (int)t.low; i <= (int)t.high; i++) //prints the values found between the two bounds.
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	/*returns tuple containing maximum sub-array bounds and sum*/
	public static tuple findMaximumSubarray(int[] A, int low, int high) 
	{
		if(high == low) //if the bounds are the same, then the max is guaranteed to be the one number
			return new tuple(low,high,A[low]); //ends recursive function
		else
		{
			int mid = (low+high)/2; //finds mid-point
			tuple left = findMaximumSubarray(A,low,mid); //starts finding maximum sum left of mid point
			tuple right = findMaximumSubarray(A,mid+1,high); //starts finding maximum sum right of mid point
			tuple cross = findMaxCrossingSubarray(A,low,mid,high); 
			/*it's possible that the max sum can be found between both the left and right sub-arrays
			 * previously declared*/
			
			if((int)left.sum >= (int)right.sum && (int)left.sum >= (int)cross.sum)
				return left; //returns left if left sum is greater than both cross and right sums
			else if((int)right.sum >= (int)left.sum && (int)right.sum >= (int)cross.sum)
				return right;//returns right if right sum is greater than both cross and left sums
			else
				return cross;//returns cross if cross sum is greater than both left and right sums
		}
	}
	
	/*this method finds a maximum crossing sub-array between the low and high bounds
	 * returns a tuple containing the bounds and sum for the max crossing sub-array.*/
	public static tuple findMaxCrossingSubarray(int[] A, int low, int mid, int high)
	{
		int leftSum = Integer.MIN_VALUE;//sets leftSum essentially to negative infinity
		int maxLeft = -1;//initializes maxLeft to -1
		int sum = 0;//initializes sum to 0
		for(int i = mid; i >= low; i--)
		{
			sum = sum + A[i]; //keeps adding to sum between the mid and low bounds
			if(sum > leftSum) 
			{
				/* if sum is greater than leftSum, that makes it a relative maximum 
				 * sub-array on the left bound*/
				leftSum = sum;
				maxLeft = i;
			}
		}
		int rightSum = Integer.MIN_VALUE;//sets rightSum essentially to negative infinity
		int maxRight = -1;//initializes maxRight to -1
		sum = 0;//sets sum to 0
		for(int j = mid+1; j <= high; j++)
		{
			sum = sum + A[j]; //keeps adding to sum between the mid+1 and high bounds
			if(sum > rightSum)
			{
				/* if sum is greater than rightSum, that makes it a relative maximum
				 * sub-array on the right bound*/
				rightSum = sum;
				maxRight = j;
			}
		}
		return new tuple(maxLeft,maxRight,leftSum+rightSum);
		/*returns tuple containing the max bounds for left and right of crossing sub-array
		 * and the sum of the sub=array*/
	}
}
