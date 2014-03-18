import java.util.*;

public class RemoveDupHash {
	public static void main (String [] args)
	{
		SingLInkedNode Head = new SingLInkedNode ("F");
		Head.addToTail("O");Head.addToTail("L");Head.addToTail("L");Head.addToTail("O");Head.addToTail("W");
		Head.addToTail("U");Head.addToTail("P");
		/*using hastable to remove the duplicate
		 * from the linked list
		 */
		Hashtable<String,SingLInkedNode > table = new Hashtable<String,SingLInkedNode> ();
		table.put((String) Head.getVal(), Head);
		SingLInkedNode  ptr = Head ;
		
		ArrayList<String> tryString = new ArrayList<String>();
		tryString.add("f"); tryString.add("o");tryString.add("o");tryString.add("p");
		int i = 0 ;
		Hashtable<String,String> table2 = new Hashtable < String,String>();
		table2.put(tryString.get(i), tryString.get(i));
		i++;
		while(i< tryString.size())
		{
		  if(table2.containsKey(tryString.get(i)))
		  {
			  tryString.remove(i);
		  }
		  else
		  {
			  table2.put(tryString.get(i), tryString.get(i));
			  i++;
		  }
			
		}
		for(String temp : tryString)
		{
			System.out.println(temp);
		}
		
		
		while(ptr.getNext() != null)
		{
             if ( table.containsKey(ptr.getNext().getVal()))
             {
            	 ptr.setNext(ptr.getNext().getNext());
             }
             else
             {
            	 
            	 ptr = ptr.getNext();
            	 table.put((String) ptr.getVal(), ptr);
             }
		}
		ptr= Head ;
		while ( ptr!=null)
		{
			System.out.println(ptr.getVal());
			ptr = ptr.getNext();
		}

	}
}
