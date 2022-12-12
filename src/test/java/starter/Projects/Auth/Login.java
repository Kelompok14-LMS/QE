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

    public JSONObject nullBody(){
        JSONObject body = new JSONObject();
        body.put("email", null);
        body.put("password", null);
        return body;
    }

    public JSONObject validEmailNullPassword(){
        JSONObject body = new JSONObject();
        body.put("email", "usop21025@gmail.com");
        body.put("password", null);
        return body;
    }

    public JSONObject nullEmailValidPassword(){
        JSONObject body = new JSONObject();
        body.put("email", null);
        body.put("password", "12345678");
        return body;
    }

    public JSONObject validEmailWrongPassword(){
        JSONObject body = new JSONObject();
        body.put("email", "usop21025@gmail.com");
        body.put("password", "salahpass");
        return body;
    }

    public JSONObject invalidFormatEmail(){
        JSONObject body = new JSONObject();
        body.put("email", "usop21025@gmail");
        body.put("password", "12345678");
        return body;
    }

    public JSONObject wrongEmailValidPassword(){
        JSONObject body = new JSONObject();
        body.put("email", "ucop@gmail.com");
        body.put("password", "12345678");
        return body;
    }

    public void inputValidBody(){
        given().header("Content-Type", "application/json")
                .body(body());
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

    public void inputValidEmailWrongPassword(){
        given().header("Content-Type", "application/json")
                .body(validEmailWrongPassword());
        when().post(url);
    }

    public void inputInvalidFormatEmail(){
        given().header("Content-Type", "application/json")
                .body(invalidFormatEmail());
        when().post(url);
    }

    public void inputWrongEmailValidPassword(){
        given().header("Content-Type", "application/json")
                .body(wrongEmailValidPassword());
        when().post(url);
    }
    public void statusCode200(){
        then().statusCode(200);
    }

    public void statusCode400() { then().statusCode(400);}

    public void statusCode409() { then().statusCode(409);}

    public void messageLoginSucces(){
        then().body("message", equalTo("Login successful"));
    }

    public void messageStatusError() { then().body("status", equalTo("error"));}

    public void messageUserNotFound(){ then().body("message", equalTo("User not found"));
    }
}
