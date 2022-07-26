package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        if (indexToCapitalize < 0) {
            throw new IndexOutOfBoundsException("Negative index not allowed: " + indexToCapitalize);
        }
        if (str == null || str.length() <= indexToCapitalize) {
            return str;
        }
        if (Character.isUpperCase(str.charAt(indexToCapitalize))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[indexToCapitalize] = Character.toUpperCase(charArray[indexToCapitalize]);
        return new String(charArray);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(baseString.charAt(indexOfString) == characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
