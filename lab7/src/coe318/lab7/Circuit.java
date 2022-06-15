package coe318.lab7;
import java.util.ArrayList;

public class Circuit {
	ArrayList <Resistor> resistsInCirc = new ArrayList <Resistor>();
	ArrayList <voltageSrc> voltsInCirc = new ArrayList <voltageSrc>();


	private static Circuit instance = null;
	public static Circuit getInstance()
	{
		if (instance == null)
		{
			instance = new Circuit();
		}
		return instance;
	}
	
	private Circuit()
	{
		this.resistsInCirc = new ArrayList<Resistor>();
	}

	public Object add(Resistor r)
	{
		
		resistsInCirc.add(r);
		return r;
	}
	
	public Object add(voltageSrc v1) {
		voltsInCirc.add(v1);
		return v1;
	}
	
	
	public String toString()
	{
		String allElements = "";
		
		int size;
		if (resistsInCirc.size() > voltsInCirc.size())
			size =  resistsInCirc.size();
		
		else
			size = voltsInCirc.size();
		
		
		for(int i = 0; i < size; i++)
		{
			
			/*}
		
		for(int i = 0; i < (voltsInCirc.size()); i++)
		{*/
			if (i < voltsInCirc.size())
			{
			allElements = allElements + "\n" + "V" + voltsInCirc.get(i).srcID + " " + voltsInCirc.get(i).Node[0] + " " + voltsInCirc.get(i).Node[1] + " DC " + voltsInCirc.get(i).voltage;
		
			}
			
			//put in an IF condition to check if the size limit for the corresponding array list is smaller than i
			if (i < resistsInCirc.size())
			{
			allElements = allElements + "\n" + "R" + resistsInCirc.get(i).resistorID + " " + resistsInCirc.get(i).Node[0] + " " + resistsInCirc.get(i).Node[1] + " " + resistsInCirc.get(i).resistance;
			}
			
			
		}
	
		return (allElements);
		
	}

	
	
}
