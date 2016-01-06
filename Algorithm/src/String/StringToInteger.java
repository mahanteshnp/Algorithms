package String;

import java.util.HashMap;

public class StringToInteger {

	public static int myAtoi(String str) {
		double res = 0;
		int len = str.length();
		char flag = '$';
		int noOfI = 0;
		for (int i = 0; i < len; i++) {
            if(str.charAt(i) == ' '){
            	if (noOfI > 0 || flag != '$' ) break;
            	continue;
            }
			if (flag == '$' && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
				if (noOfI > 0) break;
				flag = str.charAt(i);
				
				continue;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				noOfI+=1;
				res *=10;
				int x = str.charAt(i) - '0';
				res += x;
			} else
				break;
		}

		if (flag == '-') {
			res = (0 - res);
		}
		if(res > Integer.MAX_VALUE)return Integer.MAX_VALUE;
		else if (res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
		return (int) res;
	}

	public static void main(String[] args) {
		/*System.out.println(myAtoi("    +0 123"));
		*/
		StringToInteger stoi= new StringToInteger();
		stoi.lengthOfLongestSubstring("abcabcd");
	}
//-----------------------------------------------------------------------------------------	
	 public int lengthOfLongestSubstring(String s) {
	        
         if(s==null)
            return 0;
	char[] arr = s.toCharArray();
	int pre = 0;
 
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
	for (int i = 0; i < arr.length; i++) {
		if (!map.containsKey(arr[i])) {
			map.put(arr[i], i);
		} else {
			pre = Math.max(pre, map.size());
			i = map.get(arr[i]);
			
			System.out.println(i);
			map.clear();
		}
	}
 
	return Math.max(pre, map.size());

    }
	
}
