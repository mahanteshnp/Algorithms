import java.util.Stack;

public class IntegerCoding {
	
	public int codeInteger(int A, int B) {
        // write your code in Java SE 8
		
		Stack astack= new Stack();
		Stack bstack=new Stack();
		Boolean a=true;
		int C=0;
		int b=0;
		
		if(A==0)
		{
			astack.push(0);
		}
		while(A!=0)
		{
			astack.push(A%10);
			A=A/10;
		
		}
		
		if(B==0)
		{
			bstack.push(0);
		}
		
		while(B!=0)
		{
			bstack.push(B%10);
			B=B/10;
		}
		
		while( !astack.isEmpty() &&  !bstack.isEmpty())
		{
			if(a)
			{  a=false;
				b=(int) astack.pop();
				C=C*10 + b;
				
			}
			else if(!a)
			{
				a=true;
				b=b=(int) bstack.pop();
				C=C*10 + b;
			}
		}
		
		while( !astack.isEmpty())
		{
			b=(int) astack.pop();
			C=C*10 + b;
			
		}
		
		while( !bstack.isEmpty())
		{
			b=(int) bstack.pop();
			C=C*10 + b;
		}
		
		if(C<=100000000)
		{
			return C;
		}
		
		return -1;
    }
	

}
