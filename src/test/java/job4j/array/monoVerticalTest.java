package job4j.array;
import org.junit.Test;
import ru.job4j.array.MatrixCheck;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class monoVerticalTest {
    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

}