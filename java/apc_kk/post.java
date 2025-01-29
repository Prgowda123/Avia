package apc_kk;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post {
@Test
public void sample()
{
	RestAssured.baseURI="http://172.10.1.159:9025";
	RequestSpecification req = RestAssured.given();
	Response res = req.request(Method.GET,"/api/v1/Applicant/543453567866/09-12-2003");
	System.out.println(res.getStatusCode());
	System.out.println(res.asPrettyString());
	
}
}
