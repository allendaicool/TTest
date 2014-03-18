import java.util.*;

public class rotation {
	public static void main (String [] args)
	{
		int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int temp = 3;
		int Lay = 0 ;
		for ( int i = 0 ; i < temp/2;i++)
		{        	  
			for (int j = 0 ; j < temp-Lay ; j++)
			{
				int sub = matrix[i][j+i];
				matrix[i][j+i] = matrix[temp-i-j][i];
				matrix[temp-i-j][i] = matrix[temp-i][temp-j];
				matrix[temp-i][temp-j] = matrix[j][temp-i];
				matrix[j][temp-i] = sub;
			}
			Lay+= 2;

		}
		for ( int i = 0 ; i < matrix.length;i++)
		{        	  
			for (int j = 0 ; j < matrix[0].length ; j++)
			{
				System.out.println(matrix[i][j]);
			}
		}
	}


}
