/*Trey Ferentheil
Assignment 2
CSE360-70641
*/

package cse360assign2;

public class AddingMachine {

	private int total; //total value
	private String transHistory = "0"; //transaction history
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () { //return the current total
		return this.total;
	}
	
	public void add (int value) { //adds parameter to the total variable
		this.total = this.total + value; //adds value to total
		//updates transaction history
		transHistory = transHistory + " + " + Integer.toString(value);
	}
	
	public void subtract (int value) { //subtract the parameter from the total variable
		this.total = this.total - value; //subtracts value to total
		//updates transaction history
		transHistory = transHistory + " - " + Integer.toString(value);
	}
		
	public String toString () { //returns transaction history
		return transHistory;
	}

	public void clear() { //clears history
		total = 0;
		transHistory = "0";
	}
	
}
