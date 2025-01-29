package apc_kk;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Register {
@Test
public void reg()
{
	RestAssured.baseURI="http://172.10.1.159:9025";
	RequestSpecification req = RestAssured.given();
	JSONObject obj = new JSONObject();
	obj.put("userCode", "");
	obj.put("name", "abcd");
	obj.put("phoneNo", "8855223311");
	obj.put("email", "abc@gmail.com");
	obj.put("userName", "asdf");
	obj.put("password", "02-02-2025");
	obj.put("isAdmin", true);
	req.contentType(ContentType.JSON);
	req.body(obj.toJSONString());
	
	
	Response res = req.request(Method.POST,"/api/Account/register-teamleader");
	Headers ser = res.getHeaders();
	System.out.println(ser);
	System.out.println(res.asPrettyString());
	
}
}
