package bogdangud.uniguestringtask;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        String input = "qwerwew";
        String input2 = "abbcdabc";
        String input3 = "cbacdcbc";

        UniqueString uniqueString = new UniqueString();
        String result = uniqueString.findUniqueSubstring(input);
        System.out.println("Result :" +  result);

    }
}
