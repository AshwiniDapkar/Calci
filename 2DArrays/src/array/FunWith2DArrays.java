package array;

import java.util.Random;

public class FunWith2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int[][] my2DArray=new int[2][3];
fill2DArray(my2DArray);
print2DArray(my2DArray);
	}
public static void fill2DArray(int [][] twoArr)
{
	Random rand=new Random();
	for(int i=0;i<twoArr.length;i++)
	{
		for(int j=0;j<twoArr[i].length;j++)
		{
			twoArr[i][j]=rand.nextInt(100);
		}
	}
}
public static void print2DArray(int[][] twoArr)
{
	for(int[] arr:twoArr)
	{
		for(int num:arr) {
		System.out.print(num+" ");
		
	}
	System.out.println();
}*/
		int[][] my2DArray=new int[2][3];
		fill2DArray(my2DArray);
		print2DArray(my2DArray);
		printDouble2DArray(my2DArray);
		
			}
		public static void fill2DArray(int [][] twoArr)
		{
			Random rand=new Random();
			for(int i=0;i<twoArr.length;i++)
			{
				for(int j=0;j<twoArr[i].length;j++)
				{
					twoArr[i][j]=rand.nextInt(100);
				}
			}
		}
		public static void print2DArray(int[][] twoArr)
		{
			for(int[] arr:twoArr)
			{
				for(int num:arr) {
				System.out.print(num+" ");
				
			}
			System.out.println();
		}
		}
			public static void printDouble2DArray(int[][] twoArr)
			{
				for(int[] arr:twoArr)
				{
					for(int num:arr) {
					System.out.print(num*2 +" ");
					
				}
				System.out.println();
			}
}

}
