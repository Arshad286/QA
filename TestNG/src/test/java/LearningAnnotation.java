import org.testng.annotations.*;

public class LearningAnnotation {

    @Test
    public void testCase(){
        System.out.println("normal test case");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This will execute before every Method" );

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This will execute after every Method" );

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute before every Class" );

    }

    @AfterClass
    public void afterClass(){
        System.out.println("This will execute after every Class" );

    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute before every Test" );

    }

    @AfterTest
    public void afterTest(){
        System.out.println("This will execute after every Test" );

    }

    @BeforeSuite
    public void beforeSuite() {

        System.out.println("before test suite");
    }

    @AfterSuite
    public  void afterSuite(){
    System.out.println("This will execute after the test suite" );

    }
}