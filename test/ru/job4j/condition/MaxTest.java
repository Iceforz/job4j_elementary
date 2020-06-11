package ru.job4j.condition;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MaxTest {


    @Test
    public void firstMax() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void secondMax() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void firstEqSecond() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }
}