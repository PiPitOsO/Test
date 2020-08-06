import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUTest {
    @Test
    void numberOfWords(){
        Assertions.assertEquals(Main.numberOfWords("Один два три"), 3);
    }

    @Test
    void length(){
        Assertions.assertFalse(Main.length("Длина этой стороки 21") == 20);
    }

    @Test
    void del(){
        Assertions.assertTrue(Main.del("П,ри !в.ет?").equals("Привет"));
    }
}