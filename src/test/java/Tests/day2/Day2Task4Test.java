package Tests.day2;

import Tests.AbstractTest;
import day2.Task4;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day2Task4Test extends AbstractTest {
    @Test
    public void Five() throws IOException {
        setInput("5");
        Task4.main(new String[0]);
        assertEquals("1.25" + System.lineSeparator(), getOutput(), "Введено 5");
    }

    @Test
    public void MinusThree() throws IOException {
        setInput("-3");
        Task4.main(new String[0]);
        assertEquals("420.0" + System.lineSeparator(), getOutput(), "Введено -3");
    }

    @Test
    public void MinusTwo() throws IOException {
        setInput("-2");
        Task4.main(new String[0]);
        assertEquals("2.0" + System.lineSeparator(), getOutput(), "Введено -2");
    }

    @Test
    public void Nine() throws IOException {
        setInput("9");
        Task4.main(new String[0]);
        assertEquals("4.4375" + System.lineSeparator(), getOutput(), "Введено 9");
    }
}