package rs.ac.singidunum.testiranje;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VelicinaDatotekeTest {
    @Test
    public void toString_ShouldReturnTheCorrectValueInBytes_IfObjectCreatedFromBytes() {
        String expected = "300 B";
        String actual = VelicinaDatoteke.uBajtovima(300).toString();

        Assertions.assertEquals(expected, actual);
    }
}
