package starter.Projects.CourseMentor;


import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class FindAllCourse {

    private String url, token;

    public void setUrlAndToke(){
        url = "http://educatetheworld.tech/api/v1/courses?keyword=";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiM2FmMDljYTMtNjhlMy00ZjY4LWFmZGItOTA1ZmVjNDVhNTFjIiwibWVudG9yX2lkIjoiYjhhZDdiNDMtMTBjOC00NDk1LTgwZDQtNTkzZWIxY2Q1Y2E5Iiwicm9sZSI6Im1lbnRvciIsImV4cCI6MTY3MTAyNTc3OX0.XoyyR_ygi_lDYrJHh9Rehzz6Lm45ZTbP4t7B_blSCrg";
    }

    public void requestFindAllCourse(){
        given().header("Content-Type","application/json")
                .when().get(url);
    }

    public void requestFindAllCourseInvalidMethod(){
        given().header("Content-Type","application/json")
                .when().put(url);
    }

    public void statusCode200Ok(){
        then().statusCode(200);
    }

    public void statusCode405(){
        then().statusCode(405);
    }

    public void messageSucces(){
        then().body("message", equalTo("Success get all courses"));
    }

    public void messageMethodNotAllowed(){
        then().body("message", equalTo("Method Not Allowed"));
    }

}
