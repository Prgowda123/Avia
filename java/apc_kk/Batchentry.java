package apc_kk;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Batchentry {
@Test
public void reg()
{
	RestAssured.baseURI="http://172.10.1.159:9025";
	RequestSpecification req = RestAssured.given();
	JSONObject obj = new JSONObject();
	obj.put("userCode", "");
	obj.put("name", "poiu");
	obj.put("phoneNo", "9874565135");
	obj.put("email", "pomm54@gmail.com");
	obj.put("userName", "onnegowda");
	obj.put("password", "07-11-2002");
	obj.put("isAdmin", true);
	req.contentType(ContentType.JSON);
	req.body(obj.toJSONString());
	
	
	Response res = req.request(Method.POST,"/api/Account/register-batchentrymember");
	Headers ser = res.getHeaders();
	System.out.println(res.statusCode());
	System.out.println(ser);
	System.out.println(res.asPrettyString());
	
}
}

