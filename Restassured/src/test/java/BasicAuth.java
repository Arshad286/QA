

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuth {

    @Test
     public void basicAuthentication(){

        RestAssured.baseURI = "https://postman-echo.com/basic-auth";
        RequestSpecification request = RestAssured.given();
        request.auth().basic("postman" , "password");

        Response response = request.get();

        System.out.println(response.getBody().asPrettyString());

        JsonPath jsonPath = response.jsonPath();
        String authorized = jsonPath.getString("authenticated");

        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(authorized, "true");

     }


}
