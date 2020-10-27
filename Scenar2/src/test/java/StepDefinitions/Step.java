package StepDefinitions;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Step {
	Response resp;
	@Test
	@Given ("API for foreign Exchange")
	 public void API_for_foreign_exchange(){
		RestAssured.baseURI="https://api.ratesapi.io";
	
	 }
	 @Test
	 @When("posted with correct information")
	 public void posted_with_correct_information (){
		 resp = RestAssured.get("/api/latest");
		 
	 }
	 @Test
	 @Then("validate positive response code received")
     public void validate_positive_response_code_received(){
		 resp=RestAssured.given().
				 log().all().header("Content-Type","application/json").
				 body("")
				 .when()
				 .get("/api/latest").
				 then().
				 log().all().assertThat().statusCode(200).extract().response();
				 
				 
	 }
}
