
public class SingLInkedNode {

	private Object num;
	private SingLInkedNode next;
	
	public SingLInkedNode(Object n)
	{
		this.num = n;
	}
	public SingLInkedNode getNext()
	{
		return this.next;
	}
	public void setNext(SingLInkedNode a)
	{
		this.next = a ;
	}
	public Object getVal( )
	{
		return this.num;
	}

	public void addToTail(Object n)
	{
		SingLInkedNode temp = new SingLInkedNode(n);
		SingLInkedNode ptr = this;
		while(ptr.getNext() != null)
		{
			ptr = ptr.getNext();
		}
		ptr.next = temp ;
	}
}
