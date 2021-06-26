import com.aniruddha.max.MaxFindeString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TU_MaxFinderString {
    @Test
    void WhenStringShouldReturnMax() {
        String word1="Apple",word2="Banana",word3="Peach";
        String maxstring= MaxFindeString.findMax2(word1,word2,word3);
        Assertions.assertEquals("Peach",maxstring);
    }

    @Test
    void WhenStringShouldReturnMax1() {
        String word1="Banana",word2="Peach",word3="Apple";
        String maxstring= MaxFindeString.findMax2(word1,word2,word3);
        Assertions.assertEquals("Peach",maxstring);

    }

    @Test
    void WHenStringShouldReturnMax2() {
        String word1="Peach",word2="Apple",word3="Banana";
        String maxstring= MaxFindeString.findMax2(word1,word2,word3);
        Assertions.assertEquals("Peach",maxstring);
    }
}
