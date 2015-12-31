package HashSet;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Anagram {
	
	
//	public boolean isAnagram()
//	{
//		Scanner scanner=new Scanner(System.in);
//		
//	System.out.println("enter the first string");
//	
//	String s= scanner.nextLine();
//	
////	System.out.println("enter the second string");
////	
////	String t=scanner.next();
//	
//	
////	System.out.println(t);
//	System.out.println(s);
////	"\\s+"
//	String [] split = s.split("");
//	
//	for(String x : split)
//	{
//		System.out.println(x);
//	}
////	if(s.length()!= t.length())
////		return false;
//	
//	HashMap<Character, Integer> table = new HashMap<Character , Integer>();
//	int count =0;
//	for(int i=0 ; i<s.length(); i++)
//	{  if(!table.containsKey(s.charAt(i)))
//		table.put(s.charAt(i), 1);
//	
//	else
//		{count =table.get(s.charAt(i));
//	    table.put(s.charAt(i), count+1);}
//	
//	}
//	
////	for(int i=0 ; i<t.length(); i++)
////	{
////		if(table.containsKey(t.charAt(i)))
////		{
////			count=table.get(t.charAt(i));
////		   table.put(t.charAt(i), count-1);
////		   
////		   if(table.get(t.charAt(i))==0)
////			   table.remove(t.charAt(i));
////		}
////	}
//	
//	if(table.size()==0)
//		return true;
//	
//	
//		
//		
//		return false;
//	}
	
	 public boolean wordPattern(String pattern, String str) {
	
	 HashMap<Character,String> table = new HashMap<Character,String>();
     
     String [] split = str.split(" ");
     
     if(pattern.length()!= split.length)
     return false;
     
     for(int i=0 ; i<split.length ; i++)
     {
         if(!table.containsKey(pattern.charAt(i)))
         {
        if(table.containsValue(split[i]))
        		 return false;
         table.put(pattern.charAt(i), split[i]);
         
         }
         
         
         
         else 
         {
        	 
        	 
        	 String check =table.get(pattern.charAt(i));
        	 
        	
        	 
             if (!check.equals(split[i]))
             return false;
         }
         
     }
     
     return true;
 }

}
