package String;

public class Palindrome {
	
	
public static void main(String [] args)
{
	Palindrome p = new Palindrome();
	p.strStr("mississippi", "a");
	System.out.println(p.reverseWords("   a   b  c d   e  "));
	
}

public boolean isPalindrome(String s)
{
	int i=0;
	int j= s.length()-1;
	
	while(i<j)
	{
		while(i<j && !Character.isLetterOrDigit(s.charAt(i))) ++i;
		
		while(i<j && !Character.isLetterOrDigit(s.charAt(j))) --j;
		
		if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j)))
		{
			return false;
		}
		i++;
		j--;
		
	}
	return true;
}


public int strStr(String haystack, String needle) 
{
    int i=0;
    int j=haystack.length()-1;
    int k=0;
    int l=needle.length()-1;
    int start=0;
    if(needle.length() > haystack.length())
    return -1;
    
    while(i<j)
    {
        while(i<j && haystack.charAt(i)!= needle.charAt(k)) i++;
        if(l==j)
        {
        	return -1;
        }
        start=k;
        while(k<l && i<j)
        {
        if(haystack.charAt(i)!=needle.charAt(k))
        {
        	break;
        }
        k++;
        i++;
        }
        if(k==l)
        {
        	return start;
        }
        
        
      i++;  
        
        
        
        
    }
    
 return -1;
}

//-------------------------------------------------------------------------------------------------------------------
public String reverseWords(String s) {
    
    
    StringBuilder str = new StringBuilder();

int end=s.length();



int space=0;
int count=0;


if(s.compareTo(" ")==0)
{
	return "";
}

if(s.length() <=1)
return s;

for(int i=end-1 ; i>=0 ; i--)
{
	while(i>=0 && s.charAt(i)!=' ' )
	{
		count++;
		i--;
		continue;
	}
	if(count==0)
		continue;
	space=i;
	if(str.length()==0)
	str.append(s.substring(space+1, space+1+count));
	
	else
	{
		str.append(" ");
		str.append(s.substring(space+1, space+1+count));
	}
	count=0;
	
	
}
return str.toString();
}



}