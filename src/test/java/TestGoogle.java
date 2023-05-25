import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestGoogle {
    @BeforeAll
    public static void setBaseUrl(){
        RestAssured.baseURI = "https://google.com";
    }
    @Test
    public static void main(String[] args) {
        RestAssured.given()
                .log().all()
                .get()
                .prettyPeek()
                .then()
                .statusCode(200);
    }
}

