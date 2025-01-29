package apc_kk;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_ {
@Test(priority = 1)
public void sample()
{
	RestAssured.baseURI="http://172.10.1.159:9025";
	RequestSpecification req = RestAssured.given();
	 JSONObject obj = new JSONObject();
	 obj.put("userCode", "");
	 obj.put("userName", "320");
	 obj.put("password", "04Jul2006");
	 req.contentType(ContentType.JSON);
	 req.body(obj.toJSONString());
	
	Response res = req.request(Method.POST,"/api/Account/authenticate");
	 Headers serverinfo = res.getHeaders();
	 System.out.println(serverinfo);
	 String c = res.getHeader("Content-Type");
	 System.out.println(c);
	 System.out.println(res.asPrettyString());
	 System.out.println(res.statusCode());
	
}
@Test
public void qwe() throws InterruptedException
{
	Thread.sleep(3000);
	RestAssured.baseURI="http://172.10.1.159:9025";
	RequestSpecification req = RestAssured.given();
	Response res = req.request(Method.GET,"/api/Account/320/username");
	String str = res.asString();
	JsonPath jp = new JsonPath(str);
	String use = jp.get("userName");
	System.out.println(use);

}
}
