import java.util.Scanner;

public class MergeSort {
	
	
	public int[] mergeSort()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size= s.nextInt();
		int [] a= new int[size];
		System.out.println("enter the elements of array to be sorted");
		
		for(int i=0; i<size; i++)
		{
			a[i]= s.nextInt();
		}
		
		int [] b=mergesort(a);
		
		
		return b;
		
		
	}
	
	public int[] mergesort(int[] a)
	{   int left=0;
	     int right=0;
		int mid=a.length / 2;
		if( mid < 1)
		{
			return a;
		}
		if(a.length%2==0)
		{
		left=a.length-mid;
		}
		else  left=a.length-mid+1;
		
		right= a.length-mid;
		int [] Left= new int[left];
		int [] Right= new int[right];
		for(int i=0; i<left ; i++)
		{
			Left[i]=a[i];
		}
		for(int i=mid, j=0; j<right ; i++ , j++)
		{
			Right[j]=a[i];
		}
		mergesort(Left);
		mergesort(Right);
		merge(a , Left, Right);
		
		return a;
	}
	
	public void merge(int [] a , int[] Left , int[] Right)
	{   int i=0,j=0,k=0;
	   int left=Left.length;
	   int  right=Right.length;
		while(i<left && j<right)
		{
			if( Left[i]<Right[j])
			{
				a[k]=Left[i];
				i++;
				k++;
			}
			else
			{
				a[k]=Right[j];
				j++;
				k++;
			}
		}
		while(i<left)
		{
			a[k]=Left[i];
			i++;
			k++;
		}
		
		while(j<right)
		{
			a[k]=Right[j];
			j++;
			k++;
		}
		
	}
	public void display(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	

}
