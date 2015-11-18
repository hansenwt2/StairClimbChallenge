import org.junit.Assert;
import org.junit.Test;

/**
 * Created by whansen on 11/17/15.
 */
public class StairClimbSpec {

    @Test
    public void stridesTakenTester() {
        StairClimb stairClimb = new StairClimb();
        Integer[] intArray = {15};
        int totalStrides  = stairClimb.stridesTaken(intArray, 2);
        Assert.assertEquals("Should return 8.", 8, totalStrides);
    }

    @Test
    public void stridesTakenTester2() {
        StairClimb stairClimb = new StairClimb();
        Integer[] intArray = {15, 15};
        int totalStrides = stairClimb.stridesTaken(intArray, 2);
        Assert.assertEquals("Should return 18.", 18, totalStrides);
    }

    @Test
    public void stridesTakenTester3() {
        StairClimb stairClimb = new StairClimb();
        Integer[] intArray = {5, 11, 9, 13, 8, 30, 14};
        int totalStrides = stairClimb.stridesTaken(intArray, 3);
        Assert.assertEquals("Should return 44.", 44, totalStrides);
    }
}
