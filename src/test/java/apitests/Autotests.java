package apitests;

import apitests.RestAssuredSpecifications.Specifications;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Autotests {

    @Test
    public void homePageGetRequest(){
        Specifications.installSpecification(Specifications.requestSpecification("https://fond.mos.ru/"), Specifications.responseSpecification(200));
        given()
                .get()
                .then()
                .log().all();
    }

    @Test
    public void statuoryDocsGetRequest(){
        Specifications.installSpecification(Specifications.requestSpecification("https://fond.mos.ru/"), Specifications.responseSpecification(200));
        given()
                .get("about/ustavnie_dokumenti/")
                .then()
                .log().all();
    }
}
