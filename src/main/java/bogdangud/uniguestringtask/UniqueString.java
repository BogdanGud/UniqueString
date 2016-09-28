package bogdangud.uniguestringtask;


import java.util.HashSet;
import java.util.Set;

public class UniqueString {
    public String findUniqueSubstring(String input) {
        Set set = new HashSet<Character>();
        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }
        int strLenght = set.size();
        char[] inputChar = input.toCharArray();
        String substring = "";
        String substringNew = "";
        int startPosition = 0;

        for (int i = 0; i < inputChar.length; i++) {
            if (substring.length() >= strLenght) {
                return substring;
            }
            if (substring.indexOf(inputChar[i]) == -1) {
                substring = substring + inputChar[i];
            } else {
                startPosition = substring.indexOf(inputChar[i]);
                substringNew = substring.substring(startPosition + 1, substring.length());
                substring = substringNew + inputChar[i];
                substringNew = "";
            }
        }
        return substring;
    }

}
