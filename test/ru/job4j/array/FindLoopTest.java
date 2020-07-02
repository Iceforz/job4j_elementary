package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas6Then0() {
        int[] input = new int[] {5, 8, 3};
        int value = 6;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
}

