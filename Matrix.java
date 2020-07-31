
public class Matrix 
{
	 void add(int a[][],int b[][])
	{
		int d[][]=new int[3][3];
		int i,j;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				d[i][j]=a[i][j]+b[i][j];
			System.out.println("Sum of matrices: ");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
					System.out.print(d[i][j]+"\t");
				System.out.println();
			}
	}
	 void mul(int a[][],int b[][])
	 {
		 int d[][]=new int[3][3];
		 int i,j,k,sum=0;
		 for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					for(k=0;k<3;k++)
					{
						sum=sum+a[i][k]*b[k][j];
					}
					d[i][j]=sum;
					sum=0;
				}
		 }
		 System.out.println("Product of matrices: ");
		 for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
					System.out.print(d[i][j]+"\t");
				System.out.println();
			}
	}
	public static void main(String[] args)
	{
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{1,3,4},{2,4,3},{1,2,4}};
		Matrix ob=new Matrix();
		ob.add(a, b);
		ob.mul(a, b);
	}	
}
