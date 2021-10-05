package array_rotation;
import java.util.*;
import java.io.*;
public class AR {
	PrintStream ps =System.out;
void rotate (int arr[] ,int d)
{
	int i=0;
	int n =arr.length;
	int temp[]=new int[n];
	for(int k=0;k<d;k++)
	{
		temp[k]=arr[k];
	}
	for(int j=0;j<d;j++)
	{
	for (i=0;i<n-1;i++)
	{
		arr[i]=arr[i+1];
	}
	}
	int []result=new int[n];
	System.arraycopy(arr, 0, result, 0, n-d);
	System.arraycopy(temp, 0, result, n-d, d);
	System.out.println(Arrays.toString(result)); 
	//System.arraycopy(temp, 0, result, 0, d);
	//for( i=0;i<n;i++)
	//{
	//	for(int k=0;k<d;k++)
	//	{
	//		arr[i]+=temp[k];
	//	}
   // }
	//for( i=0;i<n;i++)
	//{
	//	ps.print(result[i]+" ");
    //}
	
}
public static void main(String args[]) 
{
	int arr[]= {23, 45, 12, 78, 4, 90, 1, 77, 11, 45, 88, 32, 56, 3};//{1,2,3,4,5};
	int d=2;
	AR ar=new AR();
	ar.rotate(arr,d);
}
}
