package com.FrameWork.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.Assert;
//import org.junit.jupiter.api.Assertions;

import java.util.Optional;

import static io.restassured.RestAssured.given;

public class US04 {

    Response response;
    String URI;

    @Given("API send a request to this {string} end point")
    public void api_send_a_request_to_this_end_point(String URI) {
        this.URI=URI;
        response = given().accept(ContentType.JSON).get(URI);

    }
    @When("API send a request we except status code {int}")
    public void api_send_a_request_we_except_status_code(Integer int1) {

        int statusCode = response.statusCode();

        Assert.assertEquals(int1, Optional.ofNullable(statusCode));
   //Junit5   Assertions.assertEquals(int1,statusCode);
    }
    @When("Retrived all the data from path id = {int}")
    public void retrived_all_the_data_from_path_id(Integer id) {

        JsonPath jsonPath = given().
                accept(ContentType.JSON)
                .and()
                .pathParam("id", id)
                .when().get(URI + "/{id}").then().extract().jsonPath();

        jsonPath.prettyPeek();
             int myid =   jsonPath.getInt("id");

              System.out.println("myid = " + myid);
              System.out.println("id = " +id);

Assert.assertEquals(myid, Optional.ofNullable(id));
       //Junit 5  Assertions.assertEquals(myid,id);
    }
}
