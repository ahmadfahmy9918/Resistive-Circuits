package coe318.lab7;

public class Resistor {	
	static int resistorNum = 1;
	int resistorID;
	//coe318.lab7.Node[] Node = new Node[2]; 
	double resistance;
	int [] Node = new int[2];
	String globElement;
	
	
	
	/*
	public Resistor(double resistance, Node node1, Node node2)
	{
		if (resistance < 0)
		{
			throw new IllegalArgumentException("Resistance can't be negative");
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
			this.resistance = resistance;
	
		}
	}
	*/
	
	public Resistor(double resistance, int node1, int node2) {
		Node[0] = node1;
		Node[1] = node2;
		
		if (resistance < 0)
		{
			throw new IllegalArgumentException("Resistance can't be negative");
		}
	
		else if(node1 == node2)
		{
			throw new IllegalArgumentException("Nodes cannot be the same");
		}
		
		
		/*if(Node[0]==null||Node[0]==null){
	           throw new IllegalArgumentException ("node connection missing");
	           
	       }*/
		
				globElement = "r";
			
			//node1 = new Node();
			//node2 = new Node();
			//Node[0] = node1;
			//Node[1] = node2;
			resistorID = resistorNum;
			resistorNum++;
			this.resistance = resistance; //has no effect apparently
	
		}
	

	/*
	public Node [] getNodes()
	{
		return Node;
		
		
	}*/
	
	public String toString()
	{
		/*
		String Resistor;
		Resistor = "R" + resistorID;
		//Resistor = Resistor + " " + Node[0].nodeID; ///Using node type vars
		//Resistor = Resistor + " " + Node[1].nodeID; ///
		Resistor = Resistor + " " + Node[0];
		Resistor = Resistor + " " + Node[1];
		Resistor = Resistor + " " + resistance;
		*/
		
		String spicedescr;
		
		spicedescr = "" + globElement;
		spicedescr = spicedescr + " " + Node[0];
		spicedescr = spicedescr + " " + Node[1];
		spicedescr = spicedescr + " " + resistance;
		
		
		
		
		return (spicedescr);
	
		
	}


	

	public void Resistortt() {
		System.out.println("  ");
		
	}

	
}
