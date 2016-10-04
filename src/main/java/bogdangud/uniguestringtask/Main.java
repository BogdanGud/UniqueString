package bogdangud.uniguestringtask;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        String input = "qwerwew";
        String input2 = "abbcdabc";
        String input3 = "cbacdcbc";
        String input4 = "cbaccdcbc";


        UniqueString uniqueString = new UniqueString();
        String result = uniqueString.findUniqueSubstring(input4);
        if(result.length() == 0)
            System.out.println("Subtring not found. ");
        else
            System.out.println("Result :" +  result);

    }
}
