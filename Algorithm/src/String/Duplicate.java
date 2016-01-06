package String;

public class Duplicate {
	
	
	public static void main(String [] args)
	{
		
		Duplicate dup= new Duplicate();
		
		System.out.println(dup.removeDuplicateLetters("bcabc"));
	}
	
public String removeDuplicateLetters(String s) {
        
        
        int i=0;
        int tail=1;
        
        char [] str = s.toCharArray();
        
        
        for(i=1 ; i<str.length ; i++)
        {
            int j=0;
         while(j<tail && str[j]!=str[i] )
            {
                
               j++;
               
            }
            
            if(j<tail)
            {
                continue;
            }
            
           str[tail]=str[i];
           ++tail;
        }
        str[tail]='\0';
        
        s=String.valueOf(str);
        return s;
        
        
    }

}
