package starter.Projects.Auth;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class Login {

    private String url;

    public void setUrl(){
        url = "http://educatetheworld.tech/api/v1/auth/mentee/login";
    }

    public JSONObject body(){
        JSONObject body = new JSONObject();
        body.put("email", "usop21025@gmail.com");
        body.put("password", "12345678");
        return body;
    }

    public void inputValidBody(){
        given().header("Content-Type", "application/json")
                .body(body());
        when().post(url);
    }

    public void statusCode200(){
        then().statusCode(200);
    }

    public void messageLoginSucces(){
        then().body("message", equalTo("Login successful"));
    }
}
