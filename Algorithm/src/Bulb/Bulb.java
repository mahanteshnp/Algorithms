package Bulb;

import java.util.Arrays;

public class Bulb {
	
	
	
	public static void main(String [] args)
	{
	Bulb bulb= new Bulb();
//		int res=bulb.bulbSwitch(25);
//		System.out.println(res);
	
	    // System.out.println(bulb.containsNearbyDuplicate(nums, k));
	}

	    public int bulbSwitch(int n) {
	        
	        int count=0;
	        int on=0;
	        
	        for(int i=1 ; i<=n ; i++)
	        {
	            int j=1;
	            while(j<=i)
	            {
	                if(i%j==0)
	                {
	                    count++;
	                }
	             j++;   
	                
	            }
	            
	            if(count%2!=0)
	            {
	                on++;
	            }
	            
	          count=0;  
	        }
	        
	        return on;
	        
	    }
	    
	    
	    public boolean containsNearbyDuplicate(int[] nums, int k) {
	        
	        if(nums.length==0 || nums.length==1 || k==0)
	        {
	            return false;
	        }
	        
	      
	      
	     
	        for(int i=0 ; i<nums.length ; i++)
	        {
	            
	            if(k>=nums.length)
	      {
	          Arrays.sort(nums);
	          
	          for(int y=0; y<nums.length-1 ; y++)
	          {
	              if(nums[y]==nums[y+1])
	              return true;
	          }
	      }
	      
	      else
	      {
	            
	           int  j=i+1;
	           
	            while(j < nums.length && j<=i+k)
	            {
	            if(nums[i]==nums[j])
	            return true;
	            
	            j++;
	            }
	            
	            
	        }
	    
	      
	        }
	        
	        return false;
	        
	    }
	}

