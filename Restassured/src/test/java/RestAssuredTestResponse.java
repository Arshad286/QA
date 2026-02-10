import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RestAssuredTestResponse {

      @Test
      public void IterateHeaders(){
          RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

          RequestSpecification request = RestAssured.given();
          Response response = request.get("");

          Headers allHeaders = response.headers();

          for(Header header : allHeaders){
              System.out.println("Key" +header.getName() + "Value" + header.getValue());
          }
      }
}
