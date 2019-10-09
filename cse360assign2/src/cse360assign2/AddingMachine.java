/**
 * 
 * 
 * @author Alan Garcia Garza
 * @version 10/8/19
 * Class iD: CSE 360 M 9:40 am
 * Assignment 2
 * 
 * This assignment is a calculator that only adds and subctracts, and show total
 * and operation moves
 * 
 */
package cse360assign2;

/**
 * Constructor for the addingMachine
 * @parm Constructior for AddingMachine
 */
public class AddingMachine {
	
	//keeps track of total value
	private int total;
	//keeps track of the string 
	private String totalString;
	
	/**
	 * This method initialized the total number and total string
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		totalString = "0";
	}
	
	/**
	 * Returns total
	 * @return total value
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds to total
	 * @parm adds the value to the total
	 */
	public void add (int value) {
		
		total = total + value;
		
		//  Func.  adds the total string plus the + and the value to totalString
		totalString = totalString + " + " + value;
	}
	
	/**
	 * Subtrscts from total
	 * @parm subtracts value from the total
	 */
	public void subtract (int value) {
		
		total = total - value;
		
		//Func.  adds the total string plus the - and the value to totalString
		totalString = totalString + " - " + value;
	}
	
	/**This method returns the total string with the operations.
	 * 
	 * @return string of operations
	 * */
	public String toString () {
		return totalString;
		}
	
	/**
	 * clears the total and totalString from values
	 */
	public void clear() {
		total=0;
		totalString="0";
	}
}
