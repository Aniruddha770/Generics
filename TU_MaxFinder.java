import com.aniruddha.max.MaxFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TU_MaxFinder {

    @Test
    void WhenFloatShouldReturnMax() {
        Float float1=1.5f,float2=3.5f,float3=4.5f;
        Float maxnumber= MaxFinder.findMax1(float1,float2,float3);
        Assertions.assertEquals(4.5f,maxnumber);
    }

    @Test
    void WhenFloatShouldReturnMax1() {
        Float float1=4.5f,float2=1.5f,float3=3.5f;
        Float maxnumber= MaxFinder.findMax1(float1,float2,float3);
        Assertions.assertEquals(4.5f,maxnumber);
    }

    @Test
    void WhenFloatShouldReturnMax2() {
        Float float1=3.5f,float2=4.5f,float3=1.5f;
        Float maxnumber= MaxFinder.findMax1(float1,float2,float3);
        Assertions.assertEquals(4.5f,maxnumber);
    }


}
