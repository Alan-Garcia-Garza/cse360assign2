/**
 * 
 * Author: Alan Garcia Garza
 * Class iD: 1212572164
 * Assignment 2
 * This Assignment was created to help us know how to upload in 
 * a repository like github or bit.
 * Adding program
 * 
 */
package cse360assign2;

//contains the function for the adding machine
public class AddingMachine {
	//keeps track of total value
	private int total;
	//keeps track of the string 
	private String totalString;
	
	public static void main(String[] args) {
		AddingMachine addingMachine = new AddingMachine();
		addingMachine.add(4);
		addingMachine.subtract(2);
		addingMachine.add(5);
		//addingMachine.getTotal();
		//addingMachine.toString();
		System.out.print(addingMachine.toString()+"\n");
		System.out.print(addingMachine.getTotal()+"\n");
	}
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		totalString = "0";
	}
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		totalString = totalString + " + " + value;
	}
	public void subtract (int value) {
		total = total - value;
		totalString = totalString + " - " + value;
	}
	public String toString () {
		return totalString;
		}
	public void clear() {
		total=0;
		totalString="0";
	}
}
