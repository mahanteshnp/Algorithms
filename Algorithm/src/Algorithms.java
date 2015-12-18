
public class Algorithms {
	
	public static int[] a= { 2,3,4,2,6,5,9,10,3,11};
	
	public static void main(String [] args)
	{
		Tree obj= new Tree();
		IntegerCoding code=new IntegerCoding();
		LocalExtrema localextrema= new LocalExtrema();
		
		/*obj.InsertNode(10);
		obj.InsertNode(5);
		obj.InsertNode(3);
		obj.InsertNode(25);
		obj.InsertNode(11); */
		
		/*obj.InsertNode(5);
		obj.InsertNode(25);
		obj.InsertNode(10);
		obj.InsertNode(11);
		obj.InsertNode(3); */
		
		obj.InsertNodeWithoutRec(25);
		obj.InsertNodeWithoutRec(50);
		obj.InsertNodeWithoutRec(12);
		obj.InsertNodeWithoutRec(26);
		obj.InsertNodeWithoutRec(6);
		obj.InsertNodeWithoutRec(9);
		obj.InsertNodeWithoutRec(55);
		
		obj.deleteNode(25);
		obj.Inorder(obj.root);
		//System.out.println("working");
		obj.preOrder(obj.root);
		System.out.println();
		System.out.println("Integer Coding "+ "------");
		
		System.out.println(code.codeInteger(1234,5678));
		
		System.out.println();
		System.out.println("local Extrema Count" + "--------");
		System.out.println(localextrema.localExtremaCount(a));
		
		
	}	
		
	
	

}
