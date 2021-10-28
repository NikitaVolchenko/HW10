import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringWorkTest {
    @Test
    public void test() {
        StringWork stringWork = new StringWork();
        String string = "abcde f g hijk l m n o p";
        assertEquals(16, stringWork.countCharacters(string));
    }
}