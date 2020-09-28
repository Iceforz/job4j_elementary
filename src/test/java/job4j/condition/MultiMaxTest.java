package job4j.condition;

import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void testMax() {
        int result = MultiMax.max(3, 1, 2);
        assertThat(result, is(3));
    }

    @Test
    public void max1() {
        int result1 = MultiMax.max(1, 4, 2);
        assertThat(result1, is(4));
    }

    @Test
    public void max3() {
        int result2 = MultiMax.max(1, 1, 1);
        assertThat(result2, is(1));
    }
}
