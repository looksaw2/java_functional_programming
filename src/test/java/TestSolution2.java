import org.example.Solution.Solution2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
public class TestSolution2 {
    private Solution2 solution2;

    @BeforeEach
    public void setUp() {
        solution2 = new Solution2();
    }

    @Test
    @DisplayName("Test lengthOf SubString")
    public void testLengthOfSubString() {
        var s = "abcabcbb";
        var expected = 3;
        var actual = solution2.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Test lengthOfSubString2")
    public void testLengthOfSubString2() {
        var s = "bbbbb";
        var expected = 1;
        var actual = solution2.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test lengthOfSubString3")
    public void testLengthOfSubString3() {
        var s= "pwwkew";
        var expected = 3;
        var actual = solution2.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test lengthOfSubString4")
    public void testLengthOfSubString4() {
        var s = " ";
        var expected = 1;
        var actual = solution2.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test lengthOfSubString5")
    public void testLengthOfSubString5() {
        var s = "bcbbbcba";
        var expected = 4;
        var actual = solution2.maximumLengthSubstring2(s);
        assertEquals(expected, actual);
    }
}
