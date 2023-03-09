package restAssuredTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

class Test1 {

/*	@Test
	void test() {
		RestAssured.baseURI="https://api.genderize.io/";
		RequestSpecification myRequest=RestAssured.given( );
		myRequest.queryParam("name", "Xyz");
		Response response=myRequest.get("");
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
		assertEquals(200, statusCode);
		response.getStatusLine();
		response.headers();
		for(Header hd:response.headers()) {
			System.out.println("name:="+hd.getName());
			System.out.println("value:="+hd.getValue());
			
		}
		ResponseBody respBody=response.getBody();
		JsonPath jsonPath=response.jsonPath();
		String myName=jsonPath.get("name");
		System.out.println(myName);
		System.out.println(respBody.asString());
		assertEquals(respBody.asString().contains("Xyz"), true);
		assertEquals("Xyz", myName);
		
		
		String gender=jsonPath.get("gender");
		System.out.println(gender);
	}
	
	*/
/*	@Test
	void test2() {
		RestAssured.baseURI="http://universities.hipolabs.com/search?/";
		RequestSpecification myRequest=RestAssured.given( );
		myRequest.queryParam("country", "india");
		Response response=myRequest.get("");
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
		assertEquals(200, statusCode);
		JsonPath responsePath=response.jsonPath();
		//List<String> univrsty=responsePath.getList("University");
		List<String>countries=responsePath.getList("country");
		List<String>names=responsePath.getList("name");
		List<String>states=responsePath.getList("state-province");
		for(int i=0;i<names.size();i++) {
			if(names.get(i).equals("NorthCap University")) {
				System.out.println(states.get(i));
				break;
			}
			
		}
	int count=0;
		for(int i=0;i<states.size();i++) {
			if(states.get(i)!=null) {
			if(states.get(i).equals("Punjab")) {
				count++;
				
			}}
			
		}
		System.out.println(count);
		response.getStatusLine();
		response.headers();
		for(Header hd:response.headers()) {
			System.out.println("name:="+hd.getName());
			System.out.println("value:="+hd.getValue());
			
		}
		ResponseBody respBody=response.getBody();
		
		String myName=jsonPath.get("name");
		System.out.println(myName);
		System.out.println(respBody.asString());
		assertEquals(respBody.asString().contains("Xyz"), true);
		assertEquals("Xyz", myName);
		
		
		String gender=jsonPath.get("gender");
		System.out.println(gender);
	}
*/

	@Test
	public void authBasedApi() {
		//RestAssured.baseURI="http://universities.hipolabs.com/search?/";
		RequestSpecification myRequest=RestAssured.given( ).auth().preemptive().basic("postman", "password");
		
		Response response=myRequest.get("https://postman-echo.com/basic-auth");
		ResponseBody respBody=response.body();
		String res= respBody.asString();
		System.out.println(res);
}
	
	@Test
    public void callPostApi() {
        String requestBody = "{\n" +
                "  \"title\": \"foo\",\n" +
                "  \"body\": \"bar\",\n" +
                "  \"userId\": \"1\" \n}";
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        Response response=
                RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();
        System.out.println(response.statusCode());
        
    }
	
	
}