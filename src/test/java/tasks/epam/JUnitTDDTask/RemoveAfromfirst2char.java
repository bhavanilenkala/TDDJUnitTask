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
	/*
	 @BeforeEach
	void setUp() {
		removeAchar=new RemoveCharA();
	}*/
	
	@Test
	public void testABCD() {
		RemoveCharA removeAchar=new RemoveCharA();
		assertEquals("BCD",removeAchar.removeCHAR("ABCD"));
	}
	
	@Test
	public void testAACD() {
		RemoveCharA removeAchar=new RemoveCharA();
		assertEquals("CD",removeAchar.removeCHAR("AACD"));
	}
    
	@Test
	public void testBACD() {
		RemoveCharA removeAchar=new RemoveCharA();
		assertEquals("BCD",removeAchar.removeCHAR("BACD"));
	}
	@Test
	public void testBBAA() {
		RemoveCharA removeAchar=new RemoveCharA();
		assertEquals("BBAA",removeAchar.removeCHAR("BBAA"));
	}
	@Test
	public void testAABAA() {
		RemoveCharA removeAchar=new RemoveCharA();
		assertEquals("BAA",removeAchar.removeCHAR("AABAA"));
	}
	
     
    
    
}
