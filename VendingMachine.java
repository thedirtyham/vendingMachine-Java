/** Title: Vending Machine.java
 * 
 * 	Abstract: this program is a making of a vending machine class, it 
 * 			allows the user to use a bunch of different functions and get the food
 * 			that they desire 
 * 
 * 	Author: Stephan Dubuke
 * 
 * 	ID: 0484
 * 
 * 	Date: 09-17-15
 * 
 */
package vendingMachine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VendingMachine {
	//list of all the privites that i needed to make this program
		private int machineNumber;
		private String machineLocation;
		private int water = 0;
		private int waterCounter = 0;
		private int coffee = 0;
		private int coffeeCounter = 0;
		private int chips = 0;
		private int chipsCounter = 0;
		private int chocolateBar = 0;
		private int chocolateBarCounter = 0;
		private double total = 0;
		private double tax = 0;
		Scanner keyboard = new Scanner(System.in);
		//Default constructor sets the number to 0 and the location to unknown
	VendingMachine()
	{
		this.machineNumber = 0;
		this.machineLocation = "UNKNOWN";
	}
		// constructor that takes in a number but not a name
	VendingMachine(int machineNumber )
	{
		this.machineNumber = machineNumber;
		this.machineLocation = "UNKNOWN";
	}
		// constructor that takes in a number and a name
	VendingMachine(int machineNumber, String machineLocation )
	{
		this.machineNumber = machineNumber;
		this.machineLocation = machineLocation;
	}
		// functions to set the location of the machine 
	public void setLocation(String machineLocation)
	{
		this.machineLocation = machineLocation;
	}
		// function that sets the nachineNumber to the machine 
	public void setName(int machineNumber)
	{
		this.machineNumber = machineNumber;
	}
	
		// function that takes in the four ints of items in the vending machine
		// and sets them to what is in the machine
	public void reset(int water, int coffee, int chips, 
			int chocolateBar )
	{
		this.water = water;
		this.coffee = coffee;
		this.chips = chips;
		this.chocolateBar = chocolateBar;
	}
	
		// lets the owner of the machine add item to the machine
	public void addItems (int water, int coffee, int chips, 
			int chocolateBar )
	{
		this.water += water;
		this.coffee += coffee;
		this.chips += chips;
		this.chocolateBar += chocolateBar;
	}
	
		// this is the display menu
	public void displayMenu()
	{
		System.out.println("===== Vending Machine Menu =====");
		System.out.println("  1. Water............$1.50");
		System.out.println("  2. Regular Coffee...$2.00");
		System.out.println("  3. Sun Chip.........$1.00");
		System.out.println("  4. Chocolate Bar....$2.50");
	}
	
	 	// buy default asks for the item number and the quianty
	public void buyItem()
	{
		int choice = 0;
		int quianty = 0;
		System.out.print("Select an item number: ");
		choice = keyboard.nextInt();
		System.out.print("How many do you want to buy? ");
		quianty = keyboard.nextInt();
		// uses a switch statement to decide what the user has chosen
		// in each case it has a check to make sure that the number of items
		// requested is fewer than the number of items that is in the machine
		// if the requesed amount is more than the ammount in the machine it throws an 
		// excepotion 
		// if not than it takes away from the total how much they wanted
		// and adds to the counter of how many they bought
		switch(choice)
		{
		case 1:  
			System.out.print("You selected Water. ");
			System.out.println("Quantity: " + quianty);
			if(this.water - quianty < 0)
			{
				System.out.println("Selection Failed. We don’t "
						+ "have enough Water.");
			}
			else { this.water -= quianty;
				this.waterCounter = quianty;
			}
			break;
		case 2:  
			System.out.print("You selected Regular Coffee. ");
			System.out.println("Quantity: " + quianty);
			if(this.coffee < quianty)
			{
				System.out.println("Selection Failed. We don’t "
						+ "have enough Regular Coffee.");
			}
			else{ this.coffee -= quianty;
				this.coffeeCounter = quianty;
			}
			break;
		case 3:  
			System.out.print("You selected Sun Chip. ");
			System.out.println("Quantity: " + quianty);
			if(this.chips < quianty)
			{
				System.out.println("Selection Failed. We don’t "
						+ "have enough Sun Chip.");
			}
			else{ this.chips -= quianty;
				this.chipsCounter = quianty;
			}
			break;
		case 4:  
			System.out.print("You selected Chocolate Bar. ");
			System.out.println("Quantity: " + quianty);
			if(this.chocolateBar < quianty)
			{
				System.out.println("Selection Failed. We don’t "
						+ "have enough Chocolate Bar.");
			}
			else{
				this.chocolateBar -= quianty;
			this.chocolateBarCounter = quianty;
			}
			break;
			
			default:
				System.out.println("Invalid Choice. ");
		}
	}
	
		// the boolean function of the buyitem is the same as the buyItem default
		//  it returns true if the item can be bought and false if not
	public boolean buyItem(int choice, int quianty)
	{
		if(choice >= 1 || choice <= 4)
		{
			switch(choice)
			{
			case 1:  
				System.out.print("You selected Water. ");
				System.out.println("Quantity: " + quianty);
				if(this.water - quianty < 0)
				{
					System.out.println("Selection Failed. We don’t "
							+ "have enough Water.");
				}
				else{ this.water -= quianty;
				this.waterCounter = quianty;
				}
				return true;
				
			case 2:  
				System.out.print("You selected Regular Coffee. ");
				System.out.println("Quantity: " + quianty);
				if(this.coffee - quianty < 0)
				{
					System.out.println("Selection Failed. We don’t "
							+ "have enough Regular Coffee.");
				}
				else{ this.coffee -= quianty;
				this.coffeeCounter = quianty;
				}
				return true;
				
			case 3:  
				System.out.print("You selected Sun Chip. ");
				System.out.println("Quantity: " + quianty);
				if((this.chips - quianty) < 0)
				{
					System.out.println("Selection Failed. We don’t "
							+ "have enough Sun Chip.");
				}
				else{ this.chips -= quianty;
				this.chipsCounter = quianty;
				}
				return true;
				
				
			case 4:  
				System.out.print("You selected Chocolate Bar. ");
				System.out.println("Quantity: " + quianty);
				if(this.chocolateBar - quianty < 0)
				{
					System.out.println("Selection Failed. We don’t "
							+ "have enough Chocolate Bar.");
				}
				else{
					this.chocolateBar -= quianty;
					this.chocolateBarCounter = quianty;
				}
				return true;
				
				
				default:
					System.out.println("Invalid Choice. ");
		}
		}
		return false;
	}
	
		// the returned function also uses a switch statement
		
	public void returned(int choice, int quianty)
	{
		if(choice >= 1 || choice <=4)
		{
			// in the switch statement it checks to see if the item was bought
			// first to make sure that they can't return something they didn't buy
			// if it was able to be returned it adds it back to the total and takes 
			// away from the counter 
		switch (choice)
		{
		case 1: if(this.waterCounter > 0){
			this.water += quianty;
			this.waterCounter -= quianty;
			}
			break;
		case 2: if(this.coffeeCounter > 0){
			this.coffee += quianty;
			this.coffeeCounter -= quianty;
			}
			break;
		case 3: if(this.chipsCounter > 0){
			this.chips += quianty;
			this.chipsCounter -= quianty;
			}
			break;
		case 4: if(this.chocolateBarCounter > 0){
			this.chocolateBar += quianty;
			this.chocolateBarCounter -= quianty;
			}
			break;
		}
		}
	}
	// the payment function is a boolean that returns true if the money taken in 
	// is more than the total
	public boolean payment()
	{
		double moneyTaken = 0;
		double change = 0;
		// i use decimalformat to make sure it prints two deciaml points
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.print("Enter money amount: $");
		moneyTaken = keyboard.nextDouble();
		// takes in the amount of money the user pays with
		// if the total hasn't been calculated yet it calculates it  
		if(total == 0){
			getTotal();
		}
			// if statement that returns true if the money taken in is more 
			// than the total and displays the amount of change that they get back
		if(moneyTaken >= total)
		{
			change = moneyTaken - total ;
			System.out.println("Sufficient money. $" + df.format(change) + 
					" Returned");
			return true;
		}
			// else statement that returns false if they money wasnt enough
			// to pay for it
		else 
			System.out.println("Insufficient money. $" + df.format(moneyTaken) + 
					" Returned"); 
		return false;
	}
	
		// function that gets the total
	public void getTotal()
	{
		// uses the counter and times it buy the set price
		if(waterCounter > 0){
			total = total + (waterCounter * 1.50);
		}
		if(coffeeCounter > 0){
			total = total + (coffeeCounter * 2.00);
		}
		if(chipsCounter > 0){
			total = total + (chipsCounter * 1.00);
		}
		if(chocolateBarCounter > 0){
			total = total + (chocolateBarCounter * 2.50);
		}
		//Adding the 10% tax
		tax = (total *.1);
		total = total + tax;
	}
	
		// displays the receipt
	public void displayReceipt()
	{
		double waterPrice = 0;
		double coffeePrice = 0;
		double chipsPrice = 0;
		double chocoPrice = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		// these check to see if the item was bought using the counter
		// displays the item bought if bought and the amount it costs
		// for the amount of the item they wanted.
		if(waterCounter > 0)
		{
			waterPrice = waterCounter * 1.50;
			System.out.println("Water: $1.50 X " + waterCounter + " = $" + 
			df.format(waterPrice));
		}
		if(coffeeCounter > 0)
		{
			coffeePrice = coffeeCounter * 2.00;
			System.out.println("Coffee: $2.00 X " + coffeeCounter + " = " + 
					df.format(coffeePrice));
		}
		if(chipsCounter > 0)
		{
			chipsPrice = chipsCounter * 1.00;
			System.out.println("Chips: $1.00 X " + chipsCounter + " = $" 
			+ df.format(chipsPrice));
		}
		if(chocolateBarCounter > 0)
		{
			chocoPrice = chocolateBarCounter * 2.50;
			System.out.println("chocolate Bar: $2.50 X " + chocolateBarCounter + " = $" 
			+ df.format(chocoPrice));
		}
		System.out.println("Tax (10.0%): $" + df.format((tax)));
		System.out.println("Total: $" + df.format(total));
	}
		// status functions that displays what the machine sold using the counters
		// and the contents in the machine left
	public void status()
	{
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.print(("Serial Number: " + machineNumber + "\n") +
			("Location: " + machineLocation + "\n") +
			("Sold Items:" + "\n") +
			("  Water: " + waterCounter +  "\n") +
			("  Coffee: " + coffeeCounter + "\n") +
			("  Sun Chip: " + chipsCounter + "\n") +
			("  Chocolate Bar: " + chocolateBarCounter + "\n") +
			("Current Contents:" + "\n") +
			("  Water: " + water +  "\n") +
			("  Coffee: " + coffee + "\n") +
			("  Sun Chip: " + chips + "\n") +
			("  Chocolate Bar: " + chocolateBar + "\n") +
			"Total Earnings: " + df.format(total));
	}
	
		// the to string function to display what's in the machine
	public String toString()
	{
		return ("Serial Number: " + machineNumber + "\n") +
					("Location: " + machineLocation + "\n") +
					("Contents:" + "\n") +
					("  Water: " + water +  "\n") +
					("  Coffee: " + coffee + "\n") +
					("  Sun Chip: " + chips + "\n") +
					("  Chocolate Bar: " + chocolateBar + "\n");
	}
		// .equals function to check to see if two vending machines are the same
		// based on number and location
	public boolean equals(VendingMachine obj)
	{
		return (this.machineNumber == obj.machineNumber) 
				&& (this.machineLocation.equals(obj.machineLocation));
				
	}
}
