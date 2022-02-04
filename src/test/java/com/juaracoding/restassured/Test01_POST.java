package com.juaracoding.restassured;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test01_POST {

	@Test
	public void test01_post() {
		
		JSONObject request = new JSONObject();
		
		request.put("id", "2");
		request.put("name", "andreXdua");
		request.put("email", "andreXdua@gmail.com");
		request.put("gender", "male");
		request.put("status", "inactive");
		
//		System.out.println(request);
		System.out.println(request.toJSONString());
//		https://gorest.co.in/public/v1/users
		given()
		.auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26")
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://gorest.co.in/public/v1/users") //POST
		.then()
		.statusCode(201)
		.log().all();
		
		
//		assertEquals(given().auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26").sta, 200);
	}
}
