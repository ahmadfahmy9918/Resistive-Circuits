package coe318.lab7;

public class Node {
	static int nodeNum = 0;
	int nodeID;
	
	
	Node()
	{
		nodeID = nodeNum;
		toString();
		nodeNum++;
	}
	
	public String toString() 
	{
        return("" + nodeID);
    
	}
}
