package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return null;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String vowels = "aeiouAEIOU";
        String lowerCase = word.toLowerCase();

        for (int index = 0; index < lowerCase.length(); index++) {
            if (vowels.contains(String.valueOf(lowerCase.charAt(index)))) {
                return index;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        String[] VOWELS = {"a", "e", "i", "o", "u"};
        for (String vowel : VOWELS) {
            if (word.toLowerCase().startsWith(vowel.toLowerCase()))
                return true;
        }
        return false;
//        return null;
    }

    public static Boolean isVowel(Character character) {
        Character charA = 'a';
        Character charE = 'e';
        Character charI = 'i';
        Character charO = 'o';
        Character charU = 'u';
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o'
                || character == 'u' || character == 'A' || character == 'E' || character == 'I'
                || character == 'O' || character == 'U') {
            return true;
        }
        return false;
    }
}
