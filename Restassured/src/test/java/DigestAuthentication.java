import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Digest auth is another HTTP Based auth mechanism like basic auth.
it is more secured than basic auth.
In this server challenges the client with a nonce(like number used once) ad client response with a hash
of the nonce and other information.
it doesn't transmit the acutal password over the network.

*/
public class DigestAuthentication {

    @Test
    public void Digest() {
        RestAssured.baseURI = "https://postman-echo.com/basic-auth";
        RequestSpecification request = RestAssured.given();
        request.auth().digest("postman", "password");

        Response response = request.get();

        System.out.println(response.getBody().asPrettyString());

        JsonPath jsonPath = response.jsonPath();
        String authorized = jsonPath.getString("authenticated");

        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(authorized, "true");
    }

}
