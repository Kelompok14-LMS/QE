package starter.Projects.CourseMentor;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class FindCourseById {

    private String url, token;

    public void setUrlAndToken(){
        url = "http://educatetheworld.tech/api/v1/courses/1a3d63e1-6ac5-4747-8dd8-21b270a5505e";
        token =  "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiM2FmMDljYTMtNjhlMy00ZjY4LWFmZGItOTA1ZmVjNDVhNTFjIiwibWVudG9yX2lkIjoiYjhhZDdiNDMtMTBjOC00NDk1LTgwZDQtNTkzZWIxY2Q1Y2E5Iiwicm9sZSI6Im1lbnRvciIsImV4cCI6MTY3MTEyOTk1N30.Y5X98iN5Dkquf_2RQLu7RBwC3Jbq6QWr2BNh9GCQdbo";
    }

    public void requestFindCourse(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json");
        when().get(url);
    }

    public void requestFindCourseWithInvalidMethod(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json");
        when().post(url);
    }

    public void messageSuccess(){
        then().body("message", equalTo("Success get course by id"));
    }

    public void messageMethodNotAllowed(){
        then().body("message", equalTo("Method Not Allowed"));
    }

}
