import java.util.*;
class intWrapper {
	private int a ;
	public intWrapper(int n)
	{
		this.a = n ;
	}
	public void increment ()
	{
		this.a++;
	}
	public int getVal()
	{
		return this.a;
	}
}


public class kThTolast {
	public static void main (String [] args)
	{
		SingLInkedNode Head = new SingLInkedNode ("F");
		Head.addToTail("O");Head.addToTail("L");Head.addToTail("L");Head.addToTail("O");Head.addToTail("W");
		Head.addToTail("U");Head.addToTail("P");
		intWrapper E = new intWrapper (0);
		
		SingLInkedNode temp = KTh (  Head,  E, 2 );
		System.out.println(temp.getVal());
	}

	public static SingLInkedNode KTh ( SingLInkedNode node, intWrapper E,int k )
	{

		if ( node == null)
		{
			E.increment();
			return null;
		}
		else
		{
			SingLInkedNode temp1 = KTh(node.getNext(),E,k);

			if(E.getVal() ==k )
			{				
                E.increment();
				return node;
				
			}
            E.increment();

			return temp1;
		}

	}
}
