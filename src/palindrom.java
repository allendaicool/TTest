import java.util.*;
class result
{
	private boolean tf ;
	private SingLInkedNode node;
	public result (boolean t, SingLInkedNode n )
	{
		this.tf = t ;
		this.node = n ;
	}
	public boolean getTf ()
	{
		return this.tf;
	}
	public SingLInkedNode getNode ()
	{
		return this.node;
	}

	public void setTF (boolean var)
	{
		this.tf = var;
	}
	public void setNode(SingLInkedNode next)
	{
		this.node = next;
	}
}
public class palindrom {
	public static void main (String [] args)
	{
		SingLInkedNode Head = new SingLInkedNode ("r");
		Head.addToTail("a");Head.addToTail("c");Head.addToTail("e");Head.addToTail("c");Head.addToTail("a");
		Head.addToTail("r");//Head.addToTail("");
		int lenght  = listLength ( Head);
		System.out.println(lenght);
		if( IsPalidrom(Head))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}


	}
	/* using iterative method
	 * 
	 */
	public static boolean IsPalidrom( SingLInkedNode node)
	{
		Stack<String> table = new Stack<String>();
		SingLInkedNode slow = node ;
		SingLInkedNode fast = node ;
		while ( fast != null && fast.getNext() != null)
		{
			table.push(slow.getVal());
			slow = slow.getNext();
			fast = fast.getNext().getNext();	
		}
		if ( fast!=null)
		{
			slow =slow.getNext();
		}
		while (!table.isEmpty())
		{
			if(!(table.pop().equals(slow.getVal())))
			{
				return false;
			}
			slow = slow.getNext();
		}
		return true; 
	}

	public static int listLength(SingLInkedNode lst)
	{
		int i = 0;
		while ( lst != null)
		{
			i++;
			lst = lst.getNext();
		}
		return i;
	}

	public static boolean ispali ( SingLInkedNode node,int length  )
	{
		if(length == 0 )
		{
			return false;
		}
		if ( length == 1)
		{
			return true;
		}
		return ispalihelper(node,length).getTf();

	}
	private static result ispalihelper (SingLInkedNode node, int lenght )
	{
		if  (lenght == 1 )
		{
			return new result(true,node.getNext());
		}
		else if( lenght == 2)
		{
			if ( node.getNext().getVal().equals(node.getVal()))
			{
				return new result(true, node.getNext().getNext());
			}
			else
			{
				return new result(false, node.getNext().getNext());
			}
		}
		else
		{
			result have = ispalihelper ( node.getNext(),  lenght-2 );
			if ( !have.getTf() )
			{
				return have;
			}
			else
			{
				if ( have.getNode().getVal().equals(node.getVal()))
				{
					have.setNode(have.getNode().getNext());
					return have;
				}
				else
				{
					have.setTF(false);
					return have;
				}
			}

		}

	}

}
