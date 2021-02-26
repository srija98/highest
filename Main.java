package zoho;

public class Sorting {
	
	
	static void selectionsort(int[] a)
	{
	 
	   for(int i=0;i<a.length;i++)
	   {
		   int min_index=i;
		  // System.out.print(a[i]+" kk");
		   for(int j=i+i;j<a.length;j++)
		   {
			   if(a[j] < a[i])
			   {
				   min_index=j;
			   }
			   
		   }
		   int temp=a[min_index];
		   a[min_index]=a[i];
		   a[i]=temp;
		   
		  
	   }
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.print(a[i]+" ");
	   }
	   
	   
	  
	}
	
	
	static void insertionsort(int[] a)
	{
	  int key,j;
	   for(int i=1;i<a.length;i++)
	   {
		  key=a[i];
		  j=i;
		  
		  while(j >0 && a[j-1] > a[j])
		  {
			  int temp=a[j];
			  a[j]=a[j-1];
			  a[j-1]=temp;
			  j--;
		  }
	   }
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.print(a[i]+" ");
	   }
	   
	   
	  
	}
	
	static int partition(int a[],int low,int high)
	{
		int pivot = a[high];
		int i=low-1;
		  //System.out.print("jojo ");
		for(int j=low;j<high;i++)
		{
		
			if(a[j] <= pivot)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				System.out.print("going");
			}
		}
		
		System.out.print(pivot);
		int t =a[i+1];
		a[i+1]=a[high];
		a[high] =t;
		return i+1;
		
		
	}
	
	static void quicksort(int a[],int low,int high)
	{
		if(low < high)
		{
			
			System.out.print("jojo ");
			int pos =partition(a,low,high);
			System.out.print("jojo ");
			quicksort(a,low,pos-1);
			quicksort(a,pos+1,high);
			System.out.print("jojo ");
		}
	}
	
	
	public static void main(String args[])
	{
		int[] a=new int[] {2,6,9,5};
		int[] arr=new int[] {5,4,1,7};
		//selectionsort(arr);
		//insertionsort(arr);
		quicksort(a,0,a.length-1);
		System.out.print("jojo ");
		  for(int i=0;i<a.length;i++)
		   {
			   System.out.print(a[i]+" ooll");
		   }
		
	}
	

}
