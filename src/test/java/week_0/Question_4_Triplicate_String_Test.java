package week_0;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;
import static week_0.Question_4_Triplicate_String.triplicate;


public class Question_4_Triplicate_String_Test {
    
    @Test(timeout=3000)
    public void tripleString() {
        
        Map<String, String> inOut = Map.of(
                "cat", "catcatcat",
                "CAT", "CATCATCAT",
                "Java", "JavaJavaJava",
                "Hello World!", "Hello World!Hello World!Hello World!"
        );
    
        inOut.forEach((inStr, expectedOutStr) -> {
            String outStr = triplicate(inStr);
            String message = String.format("When calling triplicate() method with '%s', it should return '%s'", inStr, expectedOutStr);
            assertEquals(message, expectedOutStr, outStr);
        });
    
    }
    
    
    
}