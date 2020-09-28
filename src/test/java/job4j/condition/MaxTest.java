package job4j.condition;
import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenThird() {
        Max maxim = new Max();
        int result = maxim.max(5, 2, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenFourth() {
        Max maxim = new Max();
        int result = maxim.max(5, 2, 3, 20);
        assertThat(result, is(20));
    }
}
