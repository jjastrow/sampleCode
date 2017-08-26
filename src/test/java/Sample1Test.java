import org.junit.Assert;
import org.junit.Test;

public class Sample1Test {
    @Test
    public void makeFirstTest() throws Exception {
        Sample1 sample = new Sample1();
        String one = sample.makeFirst("1st");
        Assert.assertTrue(one.equals("FIRST: 1st"));
    }

    @Test
    public void makeSecondTest() throws Exception {
        Sample1 sample = new Sample1();
        String two = sample.makeSecond("2nd");
        Assert.assertTrue(two.equals("SECOND: 2nd"));
    }
}