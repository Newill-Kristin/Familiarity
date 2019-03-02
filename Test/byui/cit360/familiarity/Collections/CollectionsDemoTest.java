package byui.cit360.familiarity.Collections;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Kristin Newill (aingealfire) on 2/26/2019.
 */
class CollectionsDemoTest {

    @BeforeEach
    public void setUp() {

    }


    @Test
    public void collection() {

        //Variables
        String str1="I am a Junit Test";
        String str2="I am a Junit Test";
        String str3="ImaTest";
        String str4="ImaTest";
        String str5=null;
        String str6="I am a testy Test";
        int int1=1;
        int	int2=2;
        int[] basicArrary1 = { 1, 2, 3 };
        int[] basicArrary2 = { 1, 2, 3 };

        //Asserts
        assertEquals(str1,str2);
        assertArrayEquals(basicArrary1, basicArrary2);
        assertSame(str3, str4);
        assertNotSame(str1, str3);
        assertNotNull(str6);
        assertNull(str5);
        assertTrue(int1<int2);
        assertFalse(int1>int2);

        /*
        assertThat was removed from Junit 5

        assertThat(0, is(1)); // fails:
        // failure message:
        // expected: is <1>
        // got value: <0>
        assertThat(0, is(not(1))); // passes
        */

    }


    @AfterEach
    void tearDown() {
    }
}

