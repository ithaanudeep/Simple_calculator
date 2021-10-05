import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


//Start of the Integration Test Script
public class TestMainIntegration {

    //Instances declaration
    Main main;

    //reusable code variables
    final int firstVar = 13;
    final int secondVar = -2;

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

//------------INTEGRATION TEST CASES-----------

    //This tests for change in the result value w.r.t the add function
    @Test
    public void TestChangeInResultwithAdd(){

        verifyResultVal();

        int addResultVal = main.add(firstVar, secondVar);

        int expAddVal = 11;

        assertEquals(expAddVal, addResultVal);

        assertEquals(addResultVal, main.getResult());
    }

    //This tests for change in the result value w.r.t the div fucntion
    @Test
    public void TestChangeInResultwithdiv(){

        verifyResultVal();

        int addResultVal = main.div(firstVar, secondVar);

        int expDivVal = -6;

        assertEquals(expDivVal, addResultVal);

        assertEquals(addResultVal, main.getResult());
    }

    //This tests for change in the result value w.r.t the set Result function
    @Test
    public void TestChangeInResultwithSetResult(){

        verifyResultVal();

        int setResultVal = main.setResult(firstVar);

        assertEquals(firstVar, setResultVal);

        assertEquals(setResultVal, main.getResult());
    }

    //This tests for change in the result value w.r.t the sub function
    @Test
    public void TestChangeInResultwithSub(){

        verifyResultVal();

        int subResultVal = main.sub(firstVar,secondVar);

        int expSubVal = 15;

        assertEquals(expSubVal, subResultVal);

        assertEquals(subResultVal, main.getResult());
    }

    //This tests for change in the result value w.r.t the Mul function
    @Test
    public void TestChangeInResultwithMul(){

        verifyResultVal();

        int MulResultVal = main.mult(firstVar, secondVar);

        int expMultVal = -26;

        assertEquals(expMultVal, MulResultVal);

        assertEquals(MulResultVal, main.getResult());

    }

//---------Resuable code------------

    public void verifyResultVal(){
        int expVal = 0;
        assertEquals(expVal,main.getResult());
    }
}
