package job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;
import ru.job4j.converter.Converter;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 180;
        double expected = (in - 100) * 1.15;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out,0.01);
    }

    @Test
    public void womanWeight() {
        double in = 165;
        double expected = (in - 110) * 1.15;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out,0.01);
    }
    
}