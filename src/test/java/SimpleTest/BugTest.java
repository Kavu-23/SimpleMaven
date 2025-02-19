package SimpleTest;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class BugTest {

	    // Bug #1: Hardcoded password (security issue)
	    private String password = "123456";  

	    // Bug #2: Unused variable
	    private int unusedVariable = 42; 

	    @org.junit.Test
	    public void testAddition() {
	        int result = add(2, 3);
	        Assert.assertEquals(result, 6); // Bug #3: Wrong assertion (should be 5)
	    }

	    @org.junit.Test
	    public void testStringNullCheck() {
	        String text = null;
	        if (text.equals("Hello")) {  // Bug #4: Possible NullPointerException
	            System.out.println("Matched");
	        }
	    }

	    public int add(int a, int b) {
	        return a + b;
	    }
	
}
