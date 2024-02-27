import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTest {

    Warmup warmup = new Warmup();
    Advanced advanced = new Advanced();
    @Test
    public void wordFinder_test(){
        assertEquals("Happy", warmup.wordFinder("Happy New Term", 1));
        assertEquals(" Number = 4 is out Of Bound", warmup.wordFinder("Hello From Java", 4));
    }
    @Test
    public void oddEvenCounter_test(){
        assertEquals(2, warmup.oddEvenCounter("43512", true));
        assertEquals(0, warmup.oddEvenCounter("00000", false));
        assertEquals(4, warmup.oddEvenCounter("1111", false));
    }
    @Test
    public void firstWord_test(){
        assertEquals("Fred", warmup.firstWord("George", "Fred"));
        assertEquals("Harrold", warmup.firstWord("Harry", "Harrold"));
        assertEquals("Ali", warmup.firstWord("Ali", "Alson"));
        assertEquals(" ", warmup.firstWord(" ", "Albus"));
    }
    @Test
    public void wordCensor_test(){
        assertEquals("We should stop He Who Must Not Be Named", advanced.wordCensor("We should stop Voldemort", "Voldemort", "He Who Must Not Be Named"));
        assertEquals("I'm Coding Java", advanced.wordCensor("I'm Coding cpp", "cpp", "Java"));
    }
    @Test
    public void normalizingName_test(){
        assertEquals("Ron Weasley", advanced.normalizingName("rOn", "weASlEy"));
        assertEquals("Hogwart", advanced.normalizingName("hoGWart", " "));
    }
    @Test
    public void doubleChar_test(){
        assertEquals("Hary poter", advanced.doubleChar("Harry potter"));
        assertEquals("Hary", advanced.doubleChar("Harrrry"));
    }
}
