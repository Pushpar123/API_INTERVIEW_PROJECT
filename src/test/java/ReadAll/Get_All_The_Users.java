package ReadAll;

import static io.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class Get_All_The_Users {

	@Test
	public void read_all_product() {

		Response response = 
				given().header("Content-type", "application/json;")
				.when().log().all()
				.get("https://jsonplaceholder.typicode.com/posts")
				.then().statusCode(200)
				.header("Content-type", "application/json")
				.log().all()
				.statusCode(200)
				.headers("Content-type", "application/json;")
				.extract().response();
		//StatuCode validation
		int actualData = 200;
		Assert.assertEquals(actualData, "statusCode");
	}

}
