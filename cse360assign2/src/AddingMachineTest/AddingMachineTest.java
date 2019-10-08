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
		addingMachine.subtract(4);
		assertEquals(-5,addingMachine.getTotal());
	}
	@Test
	public void test() {
		AddingMachine addingMachine = new AddingMachine();
		addingMachine.add(4);
		assertEquals(4,addingMachine.getTotal());
	}

}
