import java.util.*;


public class myQueue<E> {

	public Stack<E> mytable;
	public Stack<E> mytable2;

	private int num;

	public myQueue()
	{
		this.num =0 ;
		mytable = new Stack<E>();
		mytable2 = new Stack <E>();
	}

	public void queue(E data)
	{
		mytable.add(data);
		this.num++;
	}

	public boolean isempty()
	{
		return this.num == 0 ;
	}
	public E deQueue () throws Exception
	{
		if(!mytable2.isEmpty() )
		{
			this.num--;
			return mytable2.pop();

		}
		while (!mytable.isEmpty())
		{
			mytable2.add(mytable.pop());
		}
		if(mytable2.isEmpty())
		{
			throw new Exception ("empty queue");
		}
		else
		{
			this.num--;
			return mytable2.pop();
		}	
	}
	public static void main (String [] args) throws Exception
	{
		myQueue<String> table = new myQueue<String>();
		table.queue("a"); 	table.queue("b"); table.queue("c");table.queue("d");table.queue("e");table.queue("f");
		while(!table.isempty())
		{
			System.out.println(table.deQueue());
		}
	}

}

