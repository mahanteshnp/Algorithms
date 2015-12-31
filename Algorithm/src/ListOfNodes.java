
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
	
//	static LinkNode head;
//	
//	public LinkNode reverseList(LinkNode node)
//	{
//		
//		if(node==null)
//			return null;
//		
//		LinkNode current= node;
//		
//	   LinkNode previous= reverseList(current.next);
//		
//		if(previous==null)
//		{
//			return head=current;
//		}
//		
//		else 
//			 previous.next=current;
//		
//		
//		if(current==First)
//		{   
//			current.next=null;
//			return head;
//		}
//		else 
//		{
//			return current;
//		}
//		
//	}
	
	public LinkNode reverseList(LinkNode head) {
	    if(head==null || head.next == null)
	        return head;
	 
	    //get second node    
	    LinkNode second = head.next;
	    //set first's next to be null
	    head.next = null;
	 
	    LinkNode rest = reverseList(second);

	    second.next = head;
	 
	    return rest;
	}
	
	
	public void display()
	{
		//LinkNode head;
		LinkNode list=removeElements(First, 3);
		
		while(list!=null)
		{
			System.out.println(list.val);
			list=list.next;
			
		}
		
	}
	
	 public LinkNode removeElements(LinkNode head, int val) {
	        
	        
	        LinkNode current=head;
	        
	        LinkNode previous=current;
	        
	        while(current!=null)
	         {
	            
	              if(current.val == val)
	            {
	                if(current==head)
	                {
	                    head=head.next;
	                }
	             else  if(current.next!=null)
	                {
	                previous.next=current.next;
	                current= current.next.next;
	                }
	             else 
	             current=current.next;
	            
	            continue;
	                
	            }
	            
	             previous=current;
	             current=current.next;
	        }
	        
	        return head;
	    }
	
}
