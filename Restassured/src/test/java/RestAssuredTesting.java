import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredTesting
{
@Test
public void testGetRequest(){

    RestAssured.baseURI = "https://demoqa.com";

    //create request
    RequestSpecification httpRequest = RestAssured.given();

    //Send Get request
    Response response = httpRequest.get("/BookStore/v1/Books");

    System.out.println("Status Code => " + response.getStatusCode());
    System.out.println("Response body " + response.prettyPrint());

    Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");






}

}
