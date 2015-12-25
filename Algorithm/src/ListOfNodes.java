
public class ListOfNodes {

	LinkNode First;
	
	public ListOfNodes()
	{
		First=null;
	}
	
	public LinkNode insert(int val)
	{    LinkNode node= new LinkNode(val);
	     LinkNode head=First;
		if(First==null)
		{
			First=node;
			First.next=null;
		}
		else{
		while(head.next!=null)
		{
			head=head.next;
		}
		
		head.next=node;
		}
		return First;
	}
	
	public LinkNode mergeTwoLists(LinkNode l1, LinkNode l2) {
	       if (l1 == null) return l2;
	       if (l2 == null) return l1;

	       if (l1.val < l2.val) {
	           l1.next = mergeTwoLists(l1.next, l2);
	           return l1;
	       } else {
	    	   
	           l2.next = mergeTwoLists(l1, l2.next);
	           return l2;
	       }
	   }
	
	
	public LinkNode mergeLists(LinkNode l1, LinkNode l2) {
        
	       LinkNode l3= new LinkNode(0);
	       
	       LinkNode head=l3;
	       
	     
	       while(l1!=null && l2!=null)
	        {
	            if(l1.val> l2.val)
	            {
	                l3.next=l2;
	                l2=l2.next;
	                l3=l3.next;
	            }
	            
	            else
	            {
	                l3.next=l1;
	                l1=l1.next;
	                l3=l3.next;
	            }
	        }
	        
	        if(l1==null)
	        {
	            l3.next=l2;
	        }
	        
	        if(l2==null)
	        {
	            l3.next=l1;
	        }
	        
	        return head.next;
	        
	}
	
	
	public void display()
	{
		//LinkNode head;
		LinkNode list=First;
		
		while(list!=null)
		{
			System.out.println(list.val);
			list=list.next;
			
		}
		
	}
}
