package TesDemo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class get_listBook {
	@Test
	public void getListBook()
	{
		given()
		.when()
			.get("https://demoqa.com/BookStore/v1/Books")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK");
	}
}
