package coverage.jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

    @Test
    public void sayHi() {
        Hello hello = new Hello();
        assertEquals("Hi", hello.say());
    }

}
