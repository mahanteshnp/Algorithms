package Pivot;

public class Pivot {
	
	static int [] num= {3,2,3,1,2,4,5,5,6};
	
	
	public static void main(String [] args)
	{  
		Pivot pivot= new Pivot();
		int res=pivot.findKthLargest(num , 4);
		
	System.out.println(res);
	}
	
	
public int findKthLargest(int[] nums, int k) {
        
        int pivotIndex=nums.length-1;
        int startIndex= 0;
        
      int pivot= sort(nums , startIndex, pivotIndex );
      
      int tempf=0;
      int tempb=0;
      boolean begin=false;
      boolean end=false;
      while(pivot != (k-1))
      {     
          if(pivot> k-1)
          {    begin=true;
              
               tempf=pivot;
             if(end)
             {    end=false;
            	
            	  pivot =sort (nums , tempb+1 , pivot-1);
            	  
            	 
             }
             else{
            	 
            	 
              pivot =sort (nums , startIndex , pivot-1);
             
               }
          }
          else
          {    
        	 end=true;
        	 tempb=pivot;
        	 if(begin)
        	 {  begin=false;
        		 
        		  pivot =sort (nums , pivot+1 , tempf-1);
        		  
        	 }
        	 else{
        		
        		
        	  pivot =sort (nums , pivot+1 , pivotIndex);
        	 }
          }
         
      }
        
         return nums[pivot];
        
    }
    
    
    public int sort(int[] nums ,  int startIndex ,int pivot)
    {
        int start=startIndex;
        int pivotIndex=startIndex;
    
        
        
        
        while (start< pivot)
        {
            if(nums[start] >= nums[pivot])
            {
                int temp=nums[start];
                nums[start]=nums[pivotIndex];
                nums[pivotIndex]=temp;
                
                
                pivotIndex++;
            }
            
           
            start++;
            
           
            
        }
         int temp=nums[pivot];
        nums[pivot]=nums[pivotIndex];
        nums[pivotIndex]=temp;
         return pivotIndex;
    }


}
