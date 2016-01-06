package String;

import java.util.HashMap;

public class SumIndex {
	
	public static void main(String [] args)
	{
		
	}
	
//	 public int[] twoSum(int[] nums, int target)
//	 {
//		 HashMap<Integer,Integer> map = new HashMap<Integer , Integer>();
//		 
//		 
//		 for(int i=0 ; i< nums.length ; i++)
//		 {
//			 int x=nums[i];
//		    if(map.containsKey(target-x))
//		   {
//		     return new int[]{map.get(nums[target-x]+1)};
//	        }
//			 
//			 map.put(x, i);
//			 
//		 }
//		 
//		 return new int[]{0,0};
//	
//	 }
	 
	 
	 public int[] twoSum(int[] nums , int target)
	 {
		 
		 for(int i=0; i<nums.length ; i++)
		 {
			  
			 int j= binarySearch(nums , target-nums[i] , i+1);
			 
			 if(j!=-1)
			 {
				 
				 return new int[]{ i+1 , j+1};
			 }
			 
		 }
		 
		 return new int[]{ 0,0};
	 }
	 
	 
	 public int binarySearch(int [] num , int target , int start)
	 {
		 int end=num.length-1;
		 while (start<end)
		 {
			int  mid= start+(end-start)/2;
			
			if(num[mid]==target)
			{
				return mid;
			}
			
			else if(num[mid]<target)
			{
				start=mid+1;
			}
			
			else if(num[mid]>target)
			{
				end=mid-1;
			}
			 
			 
			 
		 }
		 
		 
		 
		 return 0;
	 }
	 
}

	
	

