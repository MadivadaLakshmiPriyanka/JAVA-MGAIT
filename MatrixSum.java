import java.util.*;
public class MatrixSum 
{

	public static void main(String[] args)throws Exception
	{
		// program to enter two matrices and display
		// sum of the matrics
		
		     Scanner sc=new Scanner(System.in);
		     int m[][]=new int[3][3];
		     int n[][]=new int[3][3];
			 int result[][]=new int[3][3];
								
			    // accepting values for m matrix
				System.out.println("Enter values for first matrix");
					for(int i=0;i<3;i++)
					{
						for(int j=0;j<3;j++)
						{
							m[i][j]=sc.nextInt();
						}
					}
				
					// accepting values for n matrix
				
					System.out.println("Enter values for second matrix");
						for(int i=0;i<3;i++)
						{
							for(int j=0;j<3;j++)
							{
								n[i][j]=sc.nextInt();
							}
						}
				
				
							for(int i=0;i<3;i++)
							{
								for(int j=0;j<3;j++)
								{
									result[i][j]=m[i][j]+n[i][j];
								}
							}
				
				// Printing first matrix
				
				System.out.println("First matrix ");
				
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
					  System.out.print(m[i][j]+"  ");	
					}
					System.out.println();
				}
				
				System.out.println("Second matrix");
				
				// Printing second matrix
				
						for(int i=0;i<3;i++)
						{
							for(int j=0;j<3;j++)
							{
							  System.out.print(n[i][j]+"  ");	
							}
							System.out.println();
						}
						
						System.out.println("Sum matrixj");
						
						// Printing result matrix
						
						for(int i=0;i<3;i++)
						{
							for(int j=0;j<3;j++)
							{
							  System.out.print(result[i][j]+"  ");	
							}
							System.out.println();
						}
		}

}
