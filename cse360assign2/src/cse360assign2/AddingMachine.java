/**
 * 
 * Author: Alan Garcia Garza
 * Class iD: 1212572164
 * Assignment 2
 * This Assignment was created to help us know how to upload in 
 * a repository like github or bit.
 * 
 */
package cse360assign2;

public class AddingMachine {
	private int total;
	private String totalString;

	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		totalString = "";
	}
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = + value;
		totalString = totalString + " + " + value;
		return;
	}
	public void subtract (int value) {
		total = - value;
		totalString = totalString + " - " + value;
		return;
	}
	public String toString () {
		return totalString;
		}
	public void clear() {
		
	}
}
