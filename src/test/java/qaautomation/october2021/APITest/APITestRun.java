package qaautomation.october2021.APITest;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITestRun {
	String token = "";
	String fakeEmail = "";
	String namaDepan = "";
	
	@Test()
	public void fakerTest() {
		Faker faker = new Faker();
		fakeEmail = faker.internet().emailAddress();
		namaDepan = faker.name().firstName();
		System.out.println(fakeEmail);
	}

	@Test(priority = 1)
	public void testLoginAPI() {
		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		JSONObject user = new JSONObject();
		JSONObject dataSignUp = new JSONObject();
		dataSignUp.put("first_name", namaDepan);
		dataSignUp.put("last_name", "");
		dataSignUp.put("email", fakeEmail);
		dataSignUp.put("password", "builder123");
		dataSignUp.put("phone_number", "+62-81240401311");
		dataSignUp.put("user_type", "User");
		dataSignUp.put("currency_id", 3);
		user.put("user", dataSignUp);
		Response response = RestAssured.given().contentType("application/json").body(user.toJSONString()).when()
				.post("users");
		token = response.jsonPath().get("user.authtoken");
		System.out.println(response.getStatusCode());
	}
	
	@Test(priority = 2)
	public void testDashboard() {
		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		Response response = RestAssured.given().contentType("application/json").header("authtoken", token)
				.param("status", "card_initialized").when().get("/build_cards");
		assertEquals(response.getStatusCode(), 200);
		System.out.println(response.getStatusCode());
	}
}
