/**
 * Created by whansen on 11/17/15.
 */
public class StairClimb {
    public Integer stridesTaken(Integer[] flights, Integer strideLength) {

        // Count for the amount of strides taken.
        Integer strides = 0;

        // Loop that tracks the number of strides taken including landings.
        for(int i = 0; i < flights.length; i++) {
            int temp = 0;

            /*
            If strideLength is evenly divisible by the length of the flight of stairs, temp is set to the quotient.
            If strideLength is not evenly divisible, temp is set to the quotient + 1 to account for the extra stride
            needed to make it to the top of the staircase.
             */
            if(flights[i] % strideLength == 0) {
                temp = flights[i] / strideLength;
            } else if(flights[i] % strideLength != 0) {
                temp = (flights[i] / strideLength) + 1;
            }

            /*
            While loop that tracks the number of landings covered based on the length of the array. Tracking begins
            when i is greater than 1 to make sure single staircases do not take any landings into account, and ends
            before the length of the staircase array to avoid adding a landing at the end of the steps. Landings are
            2 strides no matter what according to the specification.
             */
            while(i > 0 && i < flights.length) {
                int landingLength = 2;
                temp += landingLength;
                break;
            }
            strides += temp;

        }
       return strides;
    }
}

