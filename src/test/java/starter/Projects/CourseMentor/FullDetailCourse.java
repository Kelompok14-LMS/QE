package starter.Projects.CourseMentor;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class FullDetailCourse {

    private String url, token, url2;

    public void setUrlTokenCourseId(){
        url = "http://educatetheworld.tech/api/v1/courses/1f5091e3-09ff-4f0c-9a8b-cb69052083c8/details";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiM2FmMDljYTMtNjhlMy00ZjY4LWFmZGItOTA1ZmVjNDVhNTFjIiwibWVudG9yX2lkIjoiYjhhZDdiNDMtMTBjOC00NDk1LTgwZDQtNTkzZWIxY2Q1Y2E5Iiwicm9sZSI6Im1lbnRvciIsImV4cCI6MTY3MTAyNjYzNX0.NFPQQaBEqTGXzY2rW04xSmsz0zNR8oV5045qkTaeWdA";
    }

    public void setInvalidTokenCourseId(){
        url2 = "http://educatetheworld.tech/api/v1/courses/1f5091e3-09ff-4f0c-9a8b-cb69052083c/details";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiM2FmMDljYTMtNjhlMy00ZjY4LWFmZGItOTA1ZmVjNDVhNTFjIiwibWVudG9yX2lkIjoiYjhhZDdiNDMtMTBjOC00NDk1LTgwZDQtNTkzZWIxY2Q1Y2E5Iiwicm9sZSI6Im1lbnRvciIsImV4cCI6MTY3MTEyOTk1N30.Y5X98iN5Dkquf_2RQLu7RBwC3Jbq6QWr2BNh9GCQdbo";
    }

    public void requestFullDetail(){
        given().header("Authorization", token)
                .header("Content-Type","application/json")
                .when().get(url);
    }

    public void requestFullDetailInvalidId(){
        given().header("Authorization", token)
                .header("Content-Type","application/json")
                .when().get(url2);
    }

    public void statusCode404(){
        then().statusCode(404);
    }

    public void messageSuccesGetFull(){
        then().body("message", equalTo("Success get full detail course"));
    }

    public void messageCourseNotFound() { then().body("message", equalTo("Course not found"));}

}
