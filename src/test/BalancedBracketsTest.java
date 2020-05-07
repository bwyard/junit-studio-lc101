package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oppositeBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));

    }

    @Test
    public void closingBracketFirstReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void multipleUnbalancedReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[][][][]["));

    }
    @Test
    public void multipleBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[b][b][b][b]"));
    }
    @Test
    public void nestedBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[b]][b][b][b]"));
    }
    @Test
    public void nestedBracketNotProper(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[b][b][b][b]]"));
    }
    @Test
    public void xx1(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void xx2(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("launc[cccd]"));
    }
    @Test
    public void xx3(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }



}
