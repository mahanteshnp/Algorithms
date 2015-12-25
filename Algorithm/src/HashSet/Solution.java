package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int num= Integer.parseInt(scanner.nextLine());
    	System.out.println(num);

        
        HashSet<String> set= new HashSet<String>();
        int count=0;
        for(int n=0; n<num ; n++)
        {  
        	String str = scanner.nextLine();
        	System.out.println(str);
        	if(!set.contains(str.trim()))
        	{
        		set.add(str);
        		count++;
        		
        	}
        	System.out.println(count);
        }
    }
}
