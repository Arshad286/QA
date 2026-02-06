import org.testng.annotations.Test;

public class DependendTest {

    @Test(dependsOnMethods = {"OpenBrowser"})
    public  void SignIn(){
        System.out.println("User has signed ");
    }

    @Test
    public void OpenBrowser(){
        System.out.println("browser is open ");

    }
    @Test(dependsOnMethods = {"SignIn"})
    public void LogIn(){
        System.out.println("LogIN is Successfull ");

    }



}
