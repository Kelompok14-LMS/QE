package starter.Projects.Auth;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class Verify {

    private String url;

    public void setUrl(){
        url = "http://educatetheworld.tech/api/v1/auth/mentee/register/verify";
    }

    public JSONObject validOtp(){
        JSONObject body = new JSONObject();
        body.put("fullname", "David Rizki");
        body.put("phone", "085123457890");
        body.put("email", "davidsagala992@gmail.com");
        body.put("password", "111222");
        body.put("otp", "5614");
        return body;
    }

    public JSONObject wrongOtp(){
        JSONObject body = new JSONObject();
        body.put("fullname", "David Rizki");
        body.put("phone", "085123457890");
        body.put("email", "davidsagala992@gmail.com");
        body.put("password", "111222");
        body.put("otp", "9211");
        return body;
    }

    public void inputValidOtp(){
        given().header("Content-Type", "application/json")
                .body(validOtp());
        when().post(url);
    }

    public void inputWrongOtp(){
        given().header("Content-Type", "application/json")
                .body(wrongOtp());
        when().post(url);
    }

    public void statusCode201(){ then().statusCode(201);}

    public void messageVerifySuccess(){ then().body("message", equalTo("Register success"));}

    public void messageOtpNotFound() { then().body("message", equalTo("OTP not match"));}

}
