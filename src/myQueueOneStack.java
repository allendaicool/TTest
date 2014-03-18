import java.util.*;


public class myQueueOneStack <E>{

	public Stack<E> table;
	
	public myQueueOneStack()
	{
	  this.table = new Stack<E>();
	}
	
	public void enqueue ( E data)
	{
		if (!table.isEmpty())
		{
			E pop = table.pop();
			enqueue(data);
			table.push(pop);		
		}
		else
		{
			table.push(data);
		}
	}
	public boolean isEmpty()
	{
		return table.isEmpty();
	}
	
	public E dequeue () throws Exception
	{
		if ( this.table.isEmpty())
		{
			throw new Exception ("empty queue");
		}
		return this.table.pop();
	}
	public static void main(String[] args) throws Exception
	{
		myQueueOneStack<String> table = new myQueueOneStack<String>();
		table.enqueue("a"); 	table.enqueue("b"); table.enqueue("c");table.enqueue("d");table.enqueue("e");table.enqueue("f");
		while(!table.isEmpty())
		{
			System.out.println(table.dequeue());
		}
	}
}
