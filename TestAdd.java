import junit.framework.*;

public class TestAdd extends TestCase {

   public void testAdd(){
      //int sum = Calculator.add(2,4);
      int sum = Calculator.add(2,5); // This is the line that will fail the test
      assertTrue(sum == 6);
   }
}
