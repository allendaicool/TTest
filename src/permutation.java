import java.util.ArrayList;
public class permutation {
	public static void main (String [] args)
	{

		String a = "abcd";
		ArrayList<String> ouut = permuat(a);
		for ( String aa : ouut)
		{
			System.out.println(aa);
		}
	}

	public static ArrayList<String> permuat( String temp )
	{
		if( temp.length() == 1)
		{
			ArrayList<String> temp1 =  new ArrayList<String> ();
			temp1.add(temp);
			return temp1;
		}
		else
		{
			ArrayList<String> result = permuat ( temp.substring(0,temp.length()-1));
			int fixed = result.size();
			for ( int i = 0 ; i<fixed ; i ++)
			{
				String Nedd = result.remove(0);
				for ( int j = 0; j < Nedd.length();j++)
				{
					//String temp22 = Nedd
					String tempVolve = Nedd.substring(0,j);
					String tempVolve2 = Nedd.substring(j);
					String weWant = tempVolve + temp.substring(temp.length()-1) +tempVolve2 ;
					result.add(weWant);
				}
				String last = Nedd+temp.substring(temp.length()-1);
				result.add(last);
			}
			return result ;
		}


	}


}
