import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReadJSONResponseBodyTest {

  @Test
    public void readJSONResponse(){

      // way 1
//        RestAssured.baseURI = "https://fakestoreapi.com/products/1";
//        RequestSpecification request = RestAssured.given();
//        Response response = request.get();
//
//        String responseBody = response.getBody().asString();
//        System.out.println(responseBody);

        // way 2

      given()
              .when()
              .get("https://fakestoreapi.com/products/1")
              .then()
              .log().body();

    }

  @Test
    public void readJSONResponseAsStringAndValidate(){
         RestAssured.baseURI = "https://fakestoreapi.com/products/1";
         RequestSpecification request = RestAssured.given();
         Response response = request.get();

         String responseBody = response.getBody().asString();
        Assert.assertTrue(responseBody.contains("men's clothing"));

    }
    @Test
    public void readJSONResponseAndValidateData(){
        RestAssured.baseURI = "https://fakestoreapi.com/products/1";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();

        JsonPath jsonPath = response.jsonPath();
        String category = jsonPath.getString("category");
        String rating = jsonPath.getString("rating.rate");

        System.out.println(category);
        System.out.println(rating);

    Assert.assertEquals(category, "men's clothing");
    Assert.assertEquals(rating, "3.9");
    }
}
