
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = new int[5];//this step declares array and allocate memory,  allocate 5 values in integer a
a[0] = 2;
a[1] = 6;
a[2] = 1;
a[3] = 9;
a[4] = 12;

int b[] = {1,2,3,4,5};
for (int j=0;j<b.length; j++)
{
	
	System.out.println("Array Second "+b[j]);
}
for (int i=0;i<a.length; i++)
{
	
	System.out.println("Array First "+a[i]);
	
}
}

	}


