package coe318.lab7;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args){

		//System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		String command;
		int node1;
		////Node node11;
		//Node node22;
		int node2;
		double resistance, voltage, VorR;
		Resistor R1;
		voltageSrc V1;
		
		Circuit c1 = Circuit.getInstance();
		
		
		for(int i = 0; i < 100; i++)
		{
			System.out.println("\n Enter a command");
			command = scanner.next();
			
			
			
			if(command.equals("end") || command.equals("End") || command.equals("END"))
			{
				//System.out.println("terminating project");
				//System.exit(0);
				System.out.println("ending program");

				scanner.close();
				break;
			}
			
			if(command.equals("spice"))
			{
				System.out.
				println("printing spice format of elements");
				System.out.println(c1.toString());
			}
			
			
			if(command.equals("r"))
			{
				node1 = scanner.nextInt();
				node2 = scanner.nextInt();
				VorR = scanner.nextDouble();
				
				resistance = VorR;
				R1 = new Resistor(resistance, node1, node2); //instead of using the old constructor which took Node type arguments I made a new constructor that took int's
				c1.add(R1);
				System.out.println("resistor created");

			}
			
			if(command.equals("v"))
			{
				node1 = scanner.nextInt();
				node2 = scanner.nextInt();
				VorR = scanner.nextDouble();
				voltage = VorR;
				V1 = new voltageSrc(voltage, node1, node2); 
				c1.add(V1);
				System.out.println("voltage source created");

			}
			/*
			else
			{
				System.out.println("NAH");
				/*
				System.out.println("Incorrect format: ");
				System.out.println("for a Resistor command use the format 'r 2 3 5.2' --> r for resistor, node 1, node 2, resistance");
				System.out.println("for a Voltage source use the format 'v 3 4 3.6' --> v for voltage source, node 1, node 2, voltage");
	*/
			
			
		}
		
		
		//System.out.println("command is: " + command);
		//System.out.println("myInt is: " + myInt);
		
	}
}
	

