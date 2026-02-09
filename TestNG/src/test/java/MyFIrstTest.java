import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFIrstTest {

    @Test
    public void firstTest() {
        System.out.println("My first TestNG test case");
           Assert.assertEquals(2+2, 4);
    }

    @Test
    public void secondTest(){
        System.out.println("Second test case");
        Assert.assertEquals(2+3, 10);

    }

}
