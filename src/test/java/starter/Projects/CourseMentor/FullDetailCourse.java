package starter.Projects.CourseMentor;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class FullDetailCourse {

    private String url, token, courseId;

    public void setUrlTokenCourseId(){
        url = "http://educatetheworld.tech/api/v1/courses/:courseId/details";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiM2FmMDljYTMtNjhlMy00ZjY4LWFmZGItOTA1ZmVjNDVhNTFjIiwibWVudG9yX2lkIjoiYjhhZDdiNDMtMTBjOC00NDk1LTgwZDQtNTkzZWIxY2Q1Y2E5Iiwicm9sZSI6Im1lbnRvciIsImV4cCI6MTY3MTAyNjYzNX0.NFPQQaBEqTGXzY2rW04xSmsz0zNR8oV5045qkTaeWdA";
        courseId = "1f5091e3-09ff-4f0c-9a8b-cb69052083c8";
    }

    public void requestFullDetail(){
        given().header("Authorization", token)
                .header("Content-Type","application/json")
                .params("Params", courseId)
                .when().get(url);
    }

    public void messageSuccesGetFull(){
        then().body("message", equalTo("Success get full detail course"));
    }

}
