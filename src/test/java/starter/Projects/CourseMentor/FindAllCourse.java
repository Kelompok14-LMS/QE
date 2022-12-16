package starter.Projects.CourseMentor;


import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class FindAllCourse {

    private String url, token;

    public void setUrlAndToke(){
        url = "https://stagging.educatetheworld.tech/api/v1/courses?keyword=";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiZTU0ZTI5MGYtZDVkNS00ODBhLWFiZDAtMjcwYzNmMTY4YmE3IiwibWVudGVlX2lkIjoiMDI3YzFiNDItNDIxZS00MjI2LWEzZTctNjgzNTMzY2Y4NjdhIiwicm9sZSI6Im1lbnRlZSIsImV4cCI6MTY3MTIyMDI5Mn0.3lDW5u16_ihScCWmmB94L6ZYqPwPFTHVekYIw1BEka4";
    }

    public void requestFindAllCourse(){
        given().header("Authorization", token)
                .header("Content-Type","application/json")
                .when().get(url);
    }

    public void requestFindAllCourseInvalidMethod(){
        given().header("Authorization", token)
                .header("Content-Type","application/json")
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
