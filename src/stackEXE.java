
public class stackEXE {
	public int BufferSize = 100;
	public int [] buffer = new int[3*BufferSize];
	public int [] pointer  = { -1,-1,-1};

	void push ( int val , int num) throws Exception
	{
		if (this.pointer[num] +1 >=  BufferSize)
		{
			throw new Exception ("out of space");
		}
		else
		{
			this.pointer[num]++;
			this.buffer[BufferSize*num + pointer[num]] = val;
		}
	}

	int pop (int num) throws Exception
	{
		if ( this.pointer[num] == -1)
		{
			throw new Exception("pop empty stack ");
		}
		else
		{
			int val = buffer[num*BufferSize + pointer[num]];
			buffer[num*BufferSize + pointer[num]] = 0;
			this.pointer[num]--;
			return val;
		}
	}

	int peek (int num) throws Exception
	{
		if ( this.pointer[num] == -1)
		{
			throw new Exception("pop empty stack ");
		}
		else
		{
			int val = buffer[num*BufferSize + pointer[num]];
			return val;
		}
	}

}
