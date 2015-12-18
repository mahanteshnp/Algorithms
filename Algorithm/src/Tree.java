
public class Tree {
	
	TreeNode root=null;
	
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
      
	
	
}
