import java.util.*;

public class compression {
	public static void main (String [] args)
	{
		char [] array = {'a','d','g','h'};
		String tostring = String.valueOf(array,1,3);
		System.out.println(tostring);
		String abc = "aabbccccd";
		if (compression(abc) > abc.length())
		{
			return;
		}
		StringBuffer buf = new StringBuffer();
		char first  = abc.charAt(0);
		int count  = 1;
		for (int i = 1 ; i<abc.length();i++)
		{
			if (abc.charAt(i)==first)
			{
				count++;
			}
			else
			{
                buf.append(first);
                buf.append(count);
				count = 1 ;
				first = abc.charAt(i);
			}
		}
		buf.append(first);
		buf.append(count);
		System.out.println(buf.toString());
	}

	public static  int compression (String temp)
	{
		char first  = temp.charAt(0);
		int count  = 1;
		int size = 0;
		for (int i = 1 ; i<temp.length();i++)
		{
			if (temp.charAt(i)==first)
			{
				count++;
			}
			else
			{
				size += 1 + String.valueOf(count).length();
				count = 1 ;
				first = temp.charAt(i);
			}
		}
		size += 1+ String.valueOf(count).length();
		return size;
	}
}
