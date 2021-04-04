package matrix;

public class Matrix {

	public static void main(String[] args) {
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{1,3,4},{2,4,3},{1,2,4}};
		int c[][]=new int[3][3];
		int d[][]=new int[3][3];
		System.out.println("matrix addition  is:");
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			c[i][j]=a[i][j]+b[i][j];
			
		System.out.print(c[i][j]+"  ");
			}
			System.out.println();	

	}
		System.out.println();
		System.out.println("matrix multiplication is:");
		System.out.println();
		for(int k=0;k<a.length;k++)
		{
			for(int l=0;l<b.length;l++)
			{
				for(int m=0;m<a.length;m++)
				{
				d[k][l]+=a[k][m]*b[m][l];
				}
				System.out.print(d[k][l]+" ");	
			}
			System.out.println();
		}

}
}
