
public class Algorithms {
	
	public static int[] a= { 2,3,4,2,6,5,9,10,3,11};
	public static int[] A= { 1,3,5,7,9};
	public static int[] B= { 2,4,6,10};
	
	public static void main(String [] args)
	{
		Tree obj= new Tree();
//		IntegerCoding code=new IntegerCoding();
//		LocalExtrema localextrema= new LocalExtrema();
//	ListOfNodes l1= new ListOfNodes();
//	ListOfNodes l2= new ListOfNodes();
		obj.InsertNode(10);
		obj.InsertNode(5);
		obj.InsertNode(3);
		obj.InsertNode(25);
		obj.InsertNode(11); 
		
		obj.wideInsert(10);
		obj.wideInsert(5);
		obj.wideInsert(3);
		obj.wideInsert(25);
		obj.wideInsert(11);
		
		obj.wideTraversal();
//		
//		/*obj.InsertNode(5);
//		obj.InsertNode(25);
//		obj.InsertNode(10);
//		obj.InsertNode(11);
//		obj.InsertNode(3); */
//		
//		obj.InsertNodeWithoutRec(25);
//		obj.InsertNodeWithoutRec(50);
//		obj.InsertNodeWithoutRec(12);
//		obj.InsertNodeWithoutRec(26);
//		obj.InsertNodeWithoutRec(6);
//		obj.InsertNodeWithoutRec(9);
//		obj.InsertNodeWithoutRec(55);
//		
//		obj.deleteNode(25);
//		obj.Inorder(obj.root);
//		//System.out.println("working");
//		obj.preOrder(obj.root);
//		System.out.println();
//		System.out.println("Integer Coding "+ "------");
//		
//		System.out.println(code.codeInteger(1234,5678));
//		
//		System.out.println();
//		System.out.println("local Extrema Count" + "--------");
//		System.out.println(localextrema.localExtremaCount(a));
//		
//		
//		System.out.println();
//		Solution solution=new Solution();
//	      System.out.println(solution.findMedianSortedArrays(A,B));
//	
	/*l1.insert(3);
	l1.insert(5);
	l1.insert(8);
	l1.insert(9);
	
	
	l2.insert(1);
	l2.insert(4);
	
	l1.display();
	l2.display();*/
//
//	
//	System.out.println();
//	LinkNode l3= l1.mergeTwoLists(l1.First, l2.First);
//	System.out.println();
//	l1.First=l3;
//	
//	l1.display();
	
	
	/*MergeSort merge=new MergeSort();
	
	int [] a= merge.mergeSort();
	merge.display(a);*/
		
		
//   LinkNode l3= l1.mergeLists(l1.First, l2.First);
//	System.out.println();
//	l1.First=l3;
//	l1.display();
	}	
//		
	
	

}
