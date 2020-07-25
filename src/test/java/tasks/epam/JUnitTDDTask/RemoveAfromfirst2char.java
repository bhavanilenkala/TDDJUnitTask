package tasks.epam.JUnitTDDTask;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RemoveAfromfirst2char {
    /*
     * "ABCD"=>"BCD"
     * "AACD"=>"CD"
     * "BACD"=>"BCD"
     * "BBAA"=>"BBAA" 
     * "AABAA"=>"BAA"
    */
	RemoveCharA removeAchar;
	
	 @BeforeEach
	void setUp() {
		removeAchar=new RemoveCharA();
	}
	
	@Test
	public void testABCD() {
		assertEquals("BCD",removeAchar.removeCHAR("ABCD"));
	}
	
	@Test
	public void testAACD() {
		assertEquals("CD",removeAchar.removeCHAR("AACD"));
	}
    
	@Test
	public void testBACD() {
		assertEquals("BCD",removeAchar.removeCHAR("BACD"));
	}
	@Test
	public void testBBAA() {
		assertEquals("BBAA",removeAchar.removeCHAR("BBAA"));
	}
	@Test
	public void testAABAA() {
		assertEquals("BAA",removeAchar.removeCHAR("AABAA"));
	}
	
     
    
    
}
