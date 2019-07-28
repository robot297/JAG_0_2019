package week_0;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;
import static week_0.Question_3_Miles_To_Kilometers.milesToKilometers;


public class Question_3_Miles_To_Kilometers_Test {
    
    @Test(timeout=3000)
    public void milesToKilometersTest() {
        
        String msg = "Write code in the milesToKilometers method.  " +
                "Multiply the input miles by 1.6 to get the number of kilometers, " +
                "and return the result";
        
        double delta = 0;
        
        // some example inputs and expected outputs
        Map<Double, Double> inputOutput = Map.of(
                0.0, 0.0,
                10.0, 16.0,
                100.5, 160.8,
                -5.2, -8.32
        );
        
        for (double input : inputOutput.keySet()) {
            assertEquals(msg, inputOutput.get(input), milesToKilometers(input), delta);
        }
        
    }
    
}