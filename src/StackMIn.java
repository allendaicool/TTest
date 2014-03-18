import java.util.*;

class stackDataMin
{
	public int min;
	public int val;

	public stackDataMin( int a, int b)
	{
		this.min = a ;
		this.val = b;
	}
}

class StackMIn2 extends Stack <stackDataMin> {
	public int findMin ()
	{
		if(super.isEmpty())
		{
			return Integer.MAX_VALUE;
		}
		return super.peek().min;

	}
	public void push ( int val)
	{
		int minval = findMin();
		if ( val < minval)
		{
			minval = val;
		}
		super.push(new stackDataMin(minval, val));
	}
}
//class StackMinVer3 extends Stack<stackdata>
public class StackMIn{
	public static void main(String [] args)
	{
		StackMIn2 table  = new StackMIn2 ();
		table.push(10);	table.push(11);	table.push(5);	table.push(20);	table.push(23);
		System.out.println(table.peek().min);


	}


}