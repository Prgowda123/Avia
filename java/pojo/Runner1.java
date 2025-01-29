package pojo;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Runner1 {
@Test
	public  void main() {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET, "/api/users/2");
		SingleUser a1 = res.as(SingleUser.class);
		Data d = a1.getData();
		support s = a1.getSupport();
		System.out.println(d.getFirst_name());
		System.out.println(s.getText());
		Runner1.agg();
		}
public static void agg()
{
	RestAssured.baseURI="https://reqres.in";
	RequestSpecification req = RestAssured.given();
	Response res = req.request(Method.GET, "/api/users/2");	
      SingleUser a1 = res.as(SingleUser.class);
      Data d = a1.getData();
      support s = a1.getSupport();
      System.out.println(d.getFirst_name());
      System.out.println(s.getUrl());

}
}
