
import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {
	
	TreeNode root=null;
	int level=0;
	boolean levelNodeVisitedFlag[]= new boolean[256];
	
	public Tree()
	{
		this.root=null;
	}
	
	
	public void InsertNode(int val)
	{
		InsertNode( root , new TreeNode(val));
	}
	
	private void InsertNode(TreeNode head , TreeNode node)
	{    
		TreeNode newnode = head;
		if(root==null)
		{
			root=node;
			return;
		}
		
		if(newnode==null)
		{
			return;
		}
		
		if(node.val < newnode.val)
		{
			InsertNode(newnode.left , node);
			
			if(newnode.left==null)
			{
				newnode.left=node;
			}
		
		}
		
		else
		{
			InsertNode(newnode.right , node);
			
			if(newnode.right==null)
			{
				newnode.right=node;
			}
		}
		
		
		
		
	}

	public void preOrder(TreeNode node)
	{
		if(node == null)
		{
			return;
		}
		System.out.println(node.val);
		preOrder(node.left);
		
		preOrder(node.right);
		
	}
	public void Inorder(TreeNode node)
	{
		if(node == null)
		{
			return;
		}
		
		Inorder(node.left);
		System.out.println(node.val);
		Inorder(node.right);
		
	}
	public void postOrder(TreeNode node)
	{
		if(node == null)
		{
			return;
		}
		
		postOrder(node.left);
		
		postOrder(node.right);
		System.out.println(node.val);
	}

	
	public void InsertNodeWithoutRec(int val)
	{
		if(root == null)
		{
			root=new TreeNode(val);
			return;
		}
		
		else
		{
			TreeNode head=root;
			TreeNode focusnode;
			while (true)
			{
				focusnode=head;
				if(val< head.val)
				{
					head=head.left;
					if(head==null)
					{
						focusnode.left= new TreeNode(val);
						return;
					}
				}
				
				else
				{
					head=head.right;
					if(head==null)
					{
						focusnode.right= new TreeNode(val);
						return;
					}
				}
				
				
				
			}
		}
	}
	
      public void deleteNode(int val)
    {
    	 
    	  TreeNode focusNode=root;
    	  TreeNode focusParent=root;
    	  Boolean isLeft=true;
    	  
	   while(focusNode.val!=val)
	   {
		   focusParent=focusNode;
		   if(val<focusNode.val)
		   {
			   isLeft=true;
			   
			   focusNode=focusNode.left;
		   }
		   else
		   {
			   isLeft=false;
			   focusNode=focusNode.right;
			   
		   }
	   }
	   
	   if(focusNode.left==null && focusNode.right==null)
	   {
		   if(focusNode==root)
		   {
			   root=null;
		   }
		   
		   if(isLeft)
		   {
			   focusParent.left=null;
		   }
		   else
		   {
			   focusParent.right=null;
		   }
	   }
    	  
	   else if(focusNode.right==null)
	   {
		   if(focusNode==root)
		   {
			   root=focusNode.left;
		   }
		   
		   if(isLeft)
		   {
			   focusParent.left=focusNode.left;
		   }
		   else
		   {
			   focusParent.right=focusNode.left;
		   }
	   }
	   
	   else if(focusNode.left==null)
	   {
		   if(focusNode==root)
		   {
			   root=focusNode.right;
		   }
		   
		   if(isLeft)
		   {
			   focusParent.left=focusNode.right;
			   
		   }
		   else
		   {
			   focusParent.right=focusNode.right;
		   }
	   }
	   
	   else
	   {
		   TreeNode replacement= getReplacement(focusNode);
		   
		   if(focusNode==root)
		   {
			   root=replacement;
		   }
		   
		   else if(isLeft)
		   {
			   focusParent.left=replacement;
		   }
		   
		   else
		   {
			   focusParent.right=replacement;
		   }
		   
		   replacement.left=focusNode.left;
	   }
	   
    }
      
      
      public TreeNode getReplacement(TreeNode node)
      {
    	  TreeNode Replacement=node;
    	  TreeNode ReplaceParent=node;
    	  
    	  TreeNode focus=node.right;
    	  
    	  while(focus!=null)
    	  {
    		  ReplaceParent=Replacement;
    		  Replacement=focus;
    		  focus=focus.left;
    		  
    	  }
    	  
    	  if(Replacement!=ReplaceParent.right)
    	  {
    		  ReplaceParent.left=Replacement.right;
    		  Replacement.right=node.right;
    		  
    		  
    	  }
    	  
    	 return Replacement;
    	  
      }
      
	public void wideTraversal()
	{
		TreeNode head=root;
    Queue<TreeNode> queue =new LinkedList<TreeNode>();
    
      queue.add(head);
    while(!queue.isEmpty())
    {
    	TreeNode node=queue.peek();
    	if(node.left!=null)
    	queue.add(node.left);
    	if(node.right!=null)
    	queue.add(node.right);
    	System.out.println(queue.remove().val);
    }
	}
	
	public TreeNode wideInsert(int val)
	{
		if(root==null)
		{
			return root=new TreeNode(val);
		}
    Queue<TreeNode> queue =new LinkedList<TreeNode>();
    
      queue.add(root);
    while(true)
    {
    	TreeNode node=queue.peek();
    	if(node.left==null)
    	{
    	 node.left=new TreeNode(val);
    	 return root;
    	}
    	else
    	{
    		queue.add(node.left);
    	}
    	if(node.right==null)
    	{
    		 node.right=new TreeNode(val);
    		 return root;
    	}
    	else {
    	queue.add(node.right);
    	}
    	
    	queue.remove();
    }
	}
	
	public ArrayList<Integer> rightSideView(TreeNode root) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	 
	    if(root == null) return list;
	 
	    Queue<TreeNode> queue = new LinkedList<TreeNode>();
	    queue.add(root);
	 
	    while(!queue.isEmpty()){
	     
	        int size = queue.size();
	 
	        for(int i=0; i<size; i++){
	            TreeNode top = queue.remove();
	 
	         
	            if(i==0){
	                list.add(top.val);
	            }
	           
	            if(top.right != null){
	                queue.add(top.right);
	            }
	           
	            if(top.left != null){
	                queue.add(top.left);
	            }
	        }
	    }
	 
	    return list;
	}
	 
	
	public ArrayList<Integer>  leftView(TreeNode root)
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		Queue<TreeNode> queue= new LinkedList<TreeNode>();
		
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			
			int size= queue.size();
			
			for(int i=0; i<size ; i++)
			{
				TreeNode topNode= queue.remove();
				
				if(i==0)
				{
					list.add(topNode.val);
				}
				
				if(topNode.left!=null)
				{
					queue.add(topNode.left);
				}
				if(topNode.right!=null)
				{
					queue.add(topNode.right);
				}
				
				
			}
		}
		
		return list;
		
	}
	
	public void leftViewTreeTraversal(TreeNode node){  
        ++level;  
        if(node==null)  
             return;  
        if(!levelNodeVisitedFlag[level]){  
             levelNodeVisitedFlag[level] = true;  
             System.out.println(node.val);  
        }  
        if(node.left!=null)  
             leftViewTreeTraversal(node.left);  
        if(node.right!=null)  
             leftViewTreeTraversal(node.right);  
        level--;  
        return;  
   }  
	
	
	public ArrayList<ArrayList<Integer>> levelOrderBU(TreeNode node)
	{
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		
		
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		Stack<ArrayList<Integer>> stack = new Stack<ArrayList<Integer>>();
		
		queue.add(node);
		
		while(!queue.isEmpty())
		{
			int size= queue.size();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0; i<size; i++)
			{
				TreeNode top=queue.remove();
				
				list.add(top.val);
				
				if(top.left!=null)
				{
					queue.add(top.left);
				}
				
				if(top.right!=null)
				{
					queue.add(top.right);
				}
			}
			
			stack.push(list);
			
			
		}
		
		while (!stack.isEmpty())
			
		{
			lists.add(stack.pop());
		}
		
		return lists;
	}
}
