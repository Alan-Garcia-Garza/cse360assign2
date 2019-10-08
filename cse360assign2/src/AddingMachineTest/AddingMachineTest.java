package AddingMachineTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cse360assign2.AddingMachine;

public class AddingMachineTest {

	@Test
	public void add() {
		AddingMachine addingMachine = new AddingMachine();
		addingMachine.add(4);
		assertEquals(4,addingMachine.getTotal());
	}
	
	@Test
	public void subtract() {
		AddingMachine addingMachine = new AddingMachine();
		addingMachine.subtract(5);
		assertEquals(-5,addingMachine.getTotal());
	}
	
	@Test
	public void printTotal() {
		AddingMachine addingMachine = new AddingMachine();
		addingMachine.getTotal();
		assertEquals(0,addingMachine.getTotal());
	}
	
	@Test
	public void getToString() {
		AddingMachine addingMachine = new AddingMachine();
		addingMachine.add(4);
		addingMachine.subtract(2);
		addingMachine.add(5);
		assertEquals(7,addingMachine.getTotal());
	}
	
	@Test
	public void getClear() {
		AddingMachine addingMachine = new AddingMachine();
		addingMachine.clear();
		
	}
	
	

}
