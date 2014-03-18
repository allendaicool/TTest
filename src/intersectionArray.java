import java.util.*;
public class intersectionArray {

	public static void main(String [] args)
	{
		int [] A = {5,4,1,2,3}; int [] B =  { 2,5,3,6};
		Arrays.sort(A); Arrays.sort(B);
		int [] C = inter(A,B);
		
		for ( int i= 0 ; i < C.length;i++)
			System.out.println(C[i]);
	}
    public static int[] inter ( int[] A , int[] B)
    {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int i = 0 ; int j = 0;
		while(i<A.length && j<B.length)
		{
			if( A[i] < B[j])
			{
				i++;
			}
			else if( A[i]>B[j])
			{
				j++;
			}
			else
			{
				temp.add(A[i]);i++;j++;
			}
		}
		int [] C = new int[temp.size()];
		for ( int p = 0; p<temp.size();p++)
		{
			C[p] = temp.get(p);
		}
		return C;
    }
	public static int[] union ( int [] A , int[] B)
	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int i = 0 ; int j = 0;
		while(i<A.length && j<B.length)
		{
			if(A[i]<B[j] )
			{
				temp.add(A[i]);
				i++;
			}
			else if (A[i] > B[j])
			{
				temp.add(B[j]);
				j++;
			}
			else
			{
				temp.add(A[i]);
				i++;j++;
			}
		}
		while( j < B.length)
		{
			temp.add(B[j]);
			j++;
		}
		while (i<A.length)
		{
			temp.add(A[i]);
			i++;
		}
		int [] C = new int[temp.size()];
		for ( int p = 0; p<temp.size();p++)
		{
			C[p] = temp.get(p);
		}
		return C;
	}
}
