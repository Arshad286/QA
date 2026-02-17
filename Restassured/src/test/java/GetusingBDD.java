import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetusingBDD {

    @Test
    public void verifyUser(){
        given()
                .when()
                .get("http://dummy.restapiexample.com/api/v1/employee/2")
                .then()
                .statusCode(200)
                .body("data.employee_name", equalTo("Garrett Winters"))
                .body("message", equalTo("Successfully! Record has been fetched."));



    }
}
