package bathon.michael.regexlab;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/19/16.
 */
public class SpecDataValidator {

    DataValidator validator;

    @Before
    public void setUp(){
        validator = new DataValidator();

    }

    @Test
    public void testIsValidUsername(){
        String testUsername = "abcdefghijklmnopqrstuvwxy";

        boolean expected = true;
        boolean actual = validator.isValidUseranme(testUsername);

        assertEquals("Fails if the method doesn't determine that the username is valid or not based of regex parameters", expected, actual);
    }

    @Test
    public void testIsValidEnhancedUsername(){
        String testUsername = "M_09_rgt_GH_T3R45";

        boolean expected = true;
        boolean actual = validator.isValidEnhancedUsername(testUsername);

        assertEquals("Fails if it doesn't determine that the enhanced validtor accepts underscores, numbers and must start with a letter", expected, actual);
    }

    @Test
    public void testIsValidIpAddress(){
        String testIpAddress = "299.16.254.1";

        boolean expected = false;
        boolean actual = validator.isValidIpAddress(testIpAddress);

        assertEquals("Fails if it doesn't accurately determine if the IP address has the right number of integers separated by periods", expected, actual);
    }

    @Test
    public void testIsItaPalindrome(){
        String testPalindrome = "racecar";

        boolean expected = true;
        boolean actual = validator.checkIsPalindrome(testPalindrome);

        assertEquals("Fails if it doesn't accurately determine if the the string is a palindrome", expected, actual);

    }


}
