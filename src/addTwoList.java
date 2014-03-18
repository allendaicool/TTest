
public class addTwoList {
	public static void main (String [] args)
	{
		SingLInkedNode Head = new SingLInkedNode ("F");
		Head.addToTail("O");Head.addToTail("L");Head.addToTail("L");Head.addToTail("O");Head.addToTail("W");
		Head.addToTail("U");Head.addToTail("P");
		intWrapper E = new intWrapper (0);
		SingLInkedNode tmp = reverseListIterative(Head);
		if( tmp == null)
		{
			System.out.println("it is null");
		}
		while ( tmp != null)
		{

			System.out.println(tmp.getVal());
			tmp = tmp.getNext();
		}
	}

   /*
    * it is  an iterative way to reverse the string
    * 
    * 
    */
	public static SingLInkedNode reverseListIterative ( SingLInkedNode node)
	{
		if ( node.getNext() == null)
		{
			return node;
		}
		else
		{
			SingLInkedNode pre = null;
			SingLInkedNode t1 =  node ;
			SingLInkedNode t2 = node.getNext();

			while ( t2 != null)
			{

				SingLInkedNode tmp = t2.getNext();
             
				t2.setNext(t1);
				t1.setNext(pre);
				pre = t1 ;
				t1 = t2 ;
				t2 = tmp ;
				if( tmp == null)
				{
					return t1;
				}
			}
        return null;
		}

	}




	/*  it is a recursive way to reverse the string 
	 * 
	 * 
	 */
	public static SingLInkedNode reverseList (SingLInkedNode node)
	{
		if ( node.getNext() == null)
		{
			return node ;
		}
		return reverseListHelper ( node,node.getNext());
	}
	private  static SingLInkedNode reverseListHelper (SingLInkedNode node1 , SingLInkedNode node2 )
	{
		if ( node2 ==null)
		{
			return node1 ;
		}

		SingLInkedNode temp = reverseListHelper(node2,node2.getNext());
		node2.setNext(node1);
		node1.setNext(null);
		return temp ;

	}
}
