
public class MultidimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] [] = new int[2][3];
		
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 6;
		a[1][1] = 7;
		a[1][2] = 8;
		System.out.println("Print value at particular location in array  "+a[0][1]);
		
		for (int i=0;i<=a.length-1; i++)// here we use <= hence use -1
		{
			for (int j=0; j<=a.length; j++)
			
			System.out.println("Printing all values using for loop "+a[i][j]);
		}
			
		
		
		int b[] []= {{7,8,9}, {5,6,7}};
		
		System.out.println("Print value at particular location in array  "+b[0][1]);
		for (int k=0;k<b.length; k++) //here we donot use '=' hence we do not use use '-1'
		{
		
			for (int l=0;l<=b.length; l++)// here we always use <=
			
			System.out.println("Printing all values using for loop after defining in one line "+b[k][l]);
		}
			

	}

}
