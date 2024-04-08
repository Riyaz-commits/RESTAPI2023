import io.cucumber.java.en.Given;

import static io.restassured.RestAssured.given;

public class MyStepdefs {
    @Given("I perform the GET Operation for {string}")

    public void iPerformTheGETOperationFor() {
        given().contentType("");
    }
}
