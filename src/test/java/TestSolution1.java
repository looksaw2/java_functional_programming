import org.example.Solution.Solution1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
public class TestSolution1 {
    private Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new Solution1();
    }

    @Test
    @DisplayName("Test case1")
    void testMaxVowels(){
        var input = "abciiidef";
        var expected = 3;
        var actual = solution1.maxVowels(input,3);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Test case2")
    void testMaxVowels2(){
        var input = "aeiou";
        var expected = 2;
        var actual = solution1.maxVowels(input,2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test case3")
    void testMaxVowels3(){
        var input = "leetcode";
        var expected = 2;
        var actual = solution1.maxVowels(input,3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test case4")
    void testMaxVowels4(){
        var input = "rhythms";
        var expected = 0;
        var actual = solution1.maxVowels(input,4);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test case5")
    void testMaxVowels5(){
        var input = "tryhard";
        var expected = 1;
        var actual = solution1.maxVowels(input,4);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test Array 1")
    void testArray1(){
        var input = new int[] {7,4,3,9,1,8,5,2,6};
        var k = 3;
        var expected = new int[] {-1,-1,-1,5,4,4,-1,-1,-1};
        var actual = solution1.getAverages(input,k);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Test Array 2")
    void testArray2(){
        var input = "WBWBBBW";
        var k = 2;
        var expected = 0;
        var actual = solution1.minimuRecolors(input,k);
        assertEquals(expected, actual);
    }
}
