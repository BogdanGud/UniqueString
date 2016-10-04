package bogdangud.uniguestringtask;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bogdan on 9/28/2016.
 */
public class UniqueStringTest {

    @Test
    public void findUniqueSubstring() throws Exception {
        UniqueString uniqueString =  new UniqueString();
        assertEquals("It is substring", uniqueString.findUniqueSubstring("qwerwew"), "qwer");
        assertEquals("It is substring", uniqueString.findUniqueSubstring("abbcdabc"), "bcda");
        assertEquals("It is substring", uniqueString.findUniqueSubstring("cbacdcbc"), "bacd");

    }

}