/**
 * 
 * 
 * @author Alan Garcia Garza
 * Class iD: 1212572164
 * Assignment 2
 * This Assignment was created to help us know how to upload in 
 * a repository like github or bit.
 * AddingMachine that adds subtracts and returns total and the opertion moves
 * Repository: https://github.com/Alan-Garcia-Garza/cse360assign2
 * 
 */
package cse360assign2;

/**
 * contains the function for the adding machine
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
	 * @return total value
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * @parm adds the value to the total
	 */
	public void add (int value) {
		
		total = total + value;
		
		//  Func.  adds the total string plus the + and the value to totalString
		totalString = totalString + " + " + value;
	}
	
	/**This Method subtracts the value from total
	 * 
	 */
	public void subtract (int value) {
		
		total = total - value;
		
		//Func.  adds the total string plus the - and the value to totalString
		totalString = totalString + " - " + value;
	}
	
	/**This method returns the total string with the operations.
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
