package getRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetData {
//	@Test
//		public void testResponseCode() {
//			Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
//			int code=resp.getStatusCode();
//			System.out.println("Status code"+code);
//			//Assert.assertEquals(code, 200);
//			Assert.assertEquals(code, 400);
//			
//		}
	@Test
	public void testBody() {
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String data=resp.asString();
		System.out.println("Data is"+data);
		//Assert.assertEquals(code, 200);
		//Assert.assertEquals(code, 400);
		System.out.println("Response time"+resp.getTime());
	}
		
	

	

		
	}


