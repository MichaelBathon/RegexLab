package bathon.michael.regexlab;

import java.util.regex.Pattern;

/**
 * Created by michaelbathon on 2/19/16.
 */
public class DataValidator {

    public boolean isValidUseranme(String username){

        return Pattern.matches("[a-z]{3,25}", username);
    }

    public boolean isValidEnhancedUsername(String username){

        return Pattern.matches("^[a-zA-Z]\\w+", username);
    }

    public boolean isValidIpAddress(String ipAddress){

        return Pattern.matches("\\b(25[0-5]|2[0-4][\\d]|[01]?[\\d][\\d]?)\\.(25[0-5]|2[0-4][\\d]|[01]?[\\d][\\d]?)\\.(25[0-5]|2[0-4][\\d]|[01]?[\\d][\\d]?)\\.(25[0-5]|2[0-4][\\d]|[01]?[\\d][\\d]?)\\b", ipAddress);
    }

    public boolean checkIsPalindrome(String possiblePalindrome){
        String lastHalfPally = "";
        String firstHalfPally = "";
        boolean isOrIsNotPally = false;

        for(int i = possiblePalindrome.length()-1; i >possiblePalindrome.length()/2; i--){
            lastHalfPally += possiblePalindrome.charAt(i);
        }

        for(int i = 0; i < possiblePalindrome.length()/2; i++){
            firstHalfPally += possiblePalindrome.charAt(i);
        }

        isOrIsNotPally = Pattern.matches("(" + firstHalfPally + ")", lastHalfPally);

        return isOrIsNotPally;
    }



}
