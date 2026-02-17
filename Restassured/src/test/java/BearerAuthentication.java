import io.github.cdimascio.dotenv.Dotenv;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BearerAuthentication {

    @Test
    public void getAllRepositoreis() {

        Dotenv dotenv = Dotenv.load();

        String token = dotenv.get("github.token");

        RestAssured.baseURI = "https://api.github.com";
        RestAssured.basePath = "/user/repos";

        RequestSpecification request = RestAssured.given();
        request.header("Authorization", "Bearer " + token);

        Response response = request.get();

        JsonPath jsonPath = response.jsonPath();
        String reponame = jsonPath.getString("[0].name");

        System.out.println(reponame);

        Assert.assertEquals(response.statusCode(), 200);

    }
}
