package com.rest.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest {

	@Test
	public void testgetresponse() {
		
	Response response =	RestAssured.get("https://nehagouda123.atlassian.net/rest/api/3/project/MP");
	int statuscode = response.getStatusCode();
	System.out.println("Response status code is "+statuscode);
	
	Long time = response.getTime();
	System.out.println("Response Body "+time);
	
	}
}
