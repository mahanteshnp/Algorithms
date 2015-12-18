
public class LocalExtrema {
	
	    public int localExtremaCount(int[] A) {
	        // write your code in Java SE 8
	        
	        
	        Boolean min=false;
	        Boolean max=false;
	        int count=0;
	        int x=0;
	        for(int i=0; i<A.length-1; )
	        {   x=i;
	          
	            while(A[i]==A[i+1])
	            {
	                
	                i=i+1;
	                
	                
	            }
	            
	            if(A[i]<A[i+1])
	            { 
	                 if (min)
	                {
	                    count++;
	                }
	                
	                if(x==0 || (i+1)== A.length-1)
	                {
	                count++;
	                }
	               min=false;
	               max=true;
	            }
	            
	            if(A[i]>A[i+1])
	            {
	                if(max)
	                {
	                    count++;
	                }
	             if(x==0 || (i+1)== A.length-1)
	                {
	                count++;
	                
	                }
	                max=false;
	                min=true;
	            }
	            
	            if(x==i)
	            {
	            i=i+1;
	            }
	        }
	        return count;
	    }
	}


