package Appium.Demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Class1 {

	public static void main(String[] args) 
	{
	Response resp= RestAssured.given().auth()
	.preemptive()
	.basic("ToolsQA","TestPassword")
	.when().get("https://restapi.demoqa.com/authentication/CheckForAuthentication");
	
	System.out.println(resp.getStatusCode());
	System.out.println(resp.asString());
	System.out.println(resp.getTime());

	}

}
