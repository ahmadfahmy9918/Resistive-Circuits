
package coe318.lab7;




public class voltageSrc {	
	static int srcNum = 1;
	int srcID;
	//coe318.lab7.Node[] Node = new Node[2]; 
	double voltage;
	int [] Node = new int[2];;
	String globElement;
	
	
	
	/*
	public Resistor(double voltage, Node node1, Node node2)
	{
		if (voltage < 0)
		{
			throw new IllegalArgumentException("voltage can't be negative");
		}
		
		Node[0] = node1;
		Node[1] = node2;
		
		if(Node[0]==null||Node[0]==null){
	           throw new IllegalArgumentException ("node connection missing");
	           
	       }
		
		else {
			//node1 = new Node();
			//node2 = new Node();
			//Node[0] = node1;
			//Node[1] = node2;
			resistorID = resistorNum;
			resistorNum++;
			this.voltage = voltage;
	
		}
	}
	*/
	
	public voltageSrc(double voltage, int node1, int node2) {
		
		int temp;
		
		 if(node1 == node2)
		{
			throw new IllegalArgumentException("Nodes cannot be the same");
		}
		
		if (voltage < 0)
		{
			temp = node1;
			node1 = node2;
			node2 = temp;
			Node[0] = node1;
			Node[1] = node2;
			//System.out.println("voltage is negative");
			voltage = -voltage;
			this.voltage = voltage;
	
		}
		
		else {
			Node[0] = node1;
			Node[1] = node2;
			this.voltage = voltage;
		}
		 
		/*if(Node[0]==null||Node[0]==null){
	           throw new IllegalArgumentException ("node connection missing");
	           
	       }*/
	
			globElement = "v";
			
			//node1 = new Node();
			//node2 = new Node();
			//Node[0] = node1;
			//Node[1] = node2;
			srcID = srcNum;
			srcNum++;
			 //has no effect apparently
	
		}
	

	/*
	public Node [] getNodes()
	{
		return Node;
		
		
	}*/
	
	public String toString()
	{
		String spicedescr;
		
		spicedescr = "" + globElement;
		spicedescr = spicedescr + " " + Node[0];
		spicedescr = spicedescr + " " + Node[1];
		spicedescr = spicedescr + " " + voltage;
		
		
		
		
		return (spicedescr);
	
		
	}

	
}
