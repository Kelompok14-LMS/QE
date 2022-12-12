package starter.Projects.Auth;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class Regis {

    private String url;

    public void setUrl(){
        url = "http://educatetheworld.tech/api/v1/auth/mentee/register";
    }

    public JSONObject validBody(){
        JSONObject body = new JSONObject();
        body.put("email", "siboro123@gmail.com");
        body.put("password", "12345678");
        return body;
    }

    public JSONObject nullBody(){
        JSONObject body = new JSONObject();
        body.put("email", null);
        body.put("password", null);
        return body;
    }

    public JSONObject validEmailNullPassword(){
        JSONObject body = new JSONObject();
        body.put("email", "siboro321@gmail.com");
        body.put("password", null);
        return body;
    }

    public JSONObject nullEmailValidPassword(){
        JSONObject body = new JSONObject();
        body.put("email", null);
        body.put("password", "12345678");
        return body;
    }

    public JSONObject bodyAlreadyExist(){
        JSONObject body = new JSONObject();
        body.put("email", "usop21025@gmail.com");
        body.put("password", "12345678");
        return body;
    }

    public void inputValidBody(){
        given().header("Content-Type", "application/json")
                .body(validBody());
        when().post(url);
    }

    public void inputNullBody(){
        given().header("Content-Type", "application/json")
                .body(nullBody());
        when().post(url);
    }

    public void inputValidEmailNullPassword(){
        given().header("Content-Type", "application/json")
                .body(validEmailNullPassword());
        when().post(url);
    }

    public void inputNullEmailValidPassword(){
        given().header("Content-Type", "application/json")
                .body(nullEmailValidPassword());
        when().post(url);
    }

    public void inputBodyAlreadyExist(){
        given().header("Content-Type", "application/json")
                .body(bodyAlreadyExist());
        when().post(url);
    }

    public void statusCode200(){
        then().statusCode(200);
    }

    public void statusCode400() { then().statusCode(400);}

    public void statusCode409() { then().statusCode(409);}

    public void messageEmail() { then().body("message", equalTo("Success send OTP to email"));}

    public void messageDataNull() { then().body("data", equalTo(null));}

    public void messageEmailAlready() { then().body("message", equalTo("Email already exist"));}
}
