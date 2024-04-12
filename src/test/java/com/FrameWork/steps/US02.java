package com.FrameWork.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.sl.In;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class US02 {
    @Given("status code has to be {int};")
    public void status_code_has_to_be(Integer int1) {

      Response response = RestAssured.given().get("http://swapi.dev/api/planets/1")
                .prettyPeek().then().statusCode(200).extract().response();

        JsonPath jsonPath = response.jsonPath();
        String rotation_period = jsonPath.getString("rotation_period");
        System.out.println(rotation_period);

        String   residentail = jsonPath.getString("residents[7]");
        System.out.println(residentail);
    }

}
