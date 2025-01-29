package ksp;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class put {
@Test
public void sample()
{
	RestAssured.baseURI="http://172.10.1.159:9022/swagger/index.html";
	RequestSpecification req = RestAssured.given();
	Response res = req.request(Method.GET);
	System.out.println(res.asPrettyString());
}
}
