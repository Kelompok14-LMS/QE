package starter.Projects.CourseMentor;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class FindByMentor {

    private String url, token, url2;

    public void setUrlValidMentorId(){
        url = "https://stagging.educatetheworld.tech/api/v1/courses/mentors/932d102e-34aa-4f3a-997f-00534c6a9e9d";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiM2FmMDljYTMtNjhlMy00ZjY4LWFmZGItOTA1ZmVjNDVhNTFjIiwibWVudG9yX2lkIjoiYjhhZDdiNDMtMTBjOC00NDk1LTgwZDQtNTkzZWIxY2Q1Y2E5Iiwicm9sZSI6Im1lbnRvciIsImV4cCI6MTY3MTEyOTk1N30.Y5X98iN5Dkquf_2RQLu7RBwC3Jbq6QWr2BNh9GCQdbo";
    }

    public void setUrlInvalidMentorId(){
        url2 = "https://stagging.educatetheworld.tech/api/v1/courses/mentors/932d102e-4f3a-997f-00534c6a9e9d";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiM2FmMDljYTMtNjhlMy00ZjY4LWFmZGItOTA1ZmVjNDVhNTFjIiwibWVudG9yX2lkIjoiYjhhZDdiNDMtMTBjOC00NDk1LTgwZDQtNTkzZWIxY2Q1Y2E5Iiwicm9sZSI6Im1lbnRvciIsImV4cCI6MTY3MTEyOTk1N30.Y5X98iN5Dkquf_2RQLu7RBwC3Jbq6QWr2BNh9GCQdbo";
    }

    public void requestFindByMentor(){
        given().header("Authorization", token)
                .header("Content-Type","application/json");
        when().get(url);
    }

    public void requestFindInvalidByMentor(){
        given().header("Authorization", token)
                .header("Content-Type","application/json");
        when().get(url2);
    }

    public void statusCode500(){
        then().statusCode(500);
    }

    public void getMessageSuccessGetCoursesByMentor(){
        then().body("message", equalTo("Success get courses by mentor"));
    }

    public void getMessageMentorNotFound(){
        then().body("message", equalTo("Mentor not found"));
    }

}
