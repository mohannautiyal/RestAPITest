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
	  
		RestAssured.baseURI ="http://13.127.246.200:8080/myQAApp";	
		RequestSpecification rs = RestAssured.given().queryParam("a", 10)
				.queryParam("b", 20);
		
		Response resp = rs.get("/calculator/add");
		int status =resp.getStatusCode();
		
		Assert.assertTrue(status==201, "Service failed");
		
	}

}
