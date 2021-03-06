package job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));

    }

    @Test
    public void doenstexist() {
        boolean result = Triangle.exist(0, 1.0, 2.0);
        assertThat(result, is(false));
    }

}