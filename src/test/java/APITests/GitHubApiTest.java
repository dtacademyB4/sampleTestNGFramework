package APITests;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GitHubApiTest {


    @Test
    public void getUsersEndpointTest(){
        baseURI = "https://api.github.com";

        List accept = given().
                header("Accept", "application/vnd.github.v3+json").
                when().log().all().
                get("/users").
                then().log().all().
                assertThat().
                statusCode(200).extract().response().as(List.class);

        Map o = (Map) accept.get(0);

        System.out.println(o.get("login"));
        Assert.assertTrue(o.get("login").equals("mojombo"));


    }
}
