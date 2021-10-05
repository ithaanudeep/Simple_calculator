import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


//Start of the Unit Test Script
public class TestMainByUnit {

    //Instances declaration
    Main main;

    //reusable code variables
    private final int firstVar = 10;
    private final int secondVar = 3;

    //Runs before every test case
    @Before
    public void testSetup() {
        main = new Main();
    }

    //Runs after every test case
    @After
    public void testTearDown() {
        main = null;
    }

//-------------- UNIT TEST CASES ------------

    //tests the add function
    @Test
    public void testAdd() {
        int expVal = 13;
        assertEquals(expVal, main.add(firstVar, secondVar));
    }

    //tests the sub function
    @Test
    public void testSub() {
        int expVal = 7;
        assertEquals(expVal, main.sub(firstVar, secondVar));
    }

    //tests the mult function
    @Test
    public void testMul() {
        int expVal = 30;
        assertEquals(expVal, main.mult(firstVar, secondVar));
    }

    //tests the div function
    @Test
    public void testDiv() {
        int expVal = 3;
        assertEquals(expVal, main.div(firstVar, secondVar));
    }

    //tests the getResult function whether it returns a int value or not
    @Test
    public void testGetResult() {
        int resultVal = main.getResult();

        String typeNameResult = ((Object) resultVal).getClass().getName();
        String typeNameExpForInt = ((Object) firstVar).getClass().getName();

        assertEquals(typeNameResult, typeNameExpForInt);
    }

    //tests the set Result function
    @Test
    public void testSetResult() {
        assertEquals(firstVar, main.setResult(firstVar));
    }

    //tests the clear function
    @Test
    public void testClear() {
        int expVal = 0;
        assertEquals(expVal, main.clear());
    }
}