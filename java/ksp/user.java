package ksp;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class user {
@Test
public void sample() {
	RestAssured.baseURI="https://sevaapi22.ksp-recruitment.in";
	RequestSpecification req = RestAssured.given();
	Response res = req.request(Method.GET,"/api/v1/Applicant/ksp/07/2729373");
	System.out.println(res.getStatusCode());
	System.out.println(res.asPrettyString());
}
}
