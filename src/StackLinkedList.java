
public class StackLinkedList {

	SingLInkedNode node;

	public StackLinkedList ( )
	{
		this.node = null;
	}
	Object pop ()
	{
		if( node != null)
		{
			Object tmp = this.node.getVal();
			node = node.getNext();
			return tmp;
		}
		return null;
	}

	void push ( Object tmp )
	{
		SingLInkedNode ni = new SingLInkedNode (tmp);
		ni.setNext(node);
		node = ni;
	}

	Object peek()
	{
		if( node != null)
		{

			return this.node.getVal();
		}
		return null;
	}
}

