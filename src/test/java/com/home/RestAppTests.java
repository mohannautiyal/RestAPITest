package com.home;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAppTests {
	
	
	@Test
	public void TestAPI() 
	{
	  
		RestAssured.baseURI ="http://localhost:8085/RestApplication-0.1/";	
		RequestSpecification rs = RestAssured.given().queryParam("a", 10)
				.queryParam("b", 20);
		
		Response resp = rs.get("/calculator/add");
		int status =resp.getStatusCode();
		System.out.println("Status is " + status);
		Assert.assertTrue(status==200, "Service failed");
		
	}

}
