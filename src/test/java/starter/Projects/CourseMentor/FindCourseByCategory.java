package starter.Projects.CourseMentor;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class FindCourseByCategory {

    private String url, token, url2;

    public void setUrlValidCategoryId(){
        url = "https://stagging.educatetheworld.tech/api/v1/courses/categories/1b911bd0-d19a-4691-b250-691601800aab";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiM2FmMDljYTMtNjhlMy00ZjY4LWFmZGItOTA1ZmVjNDVhNTFjIiwibWVudG9yX2lkIjoiYjhhZDdiNDMtMTBjOC00NDk1LTgwZDQtNTkzZWIxY2Q1Y2E5Iiwicm9sZSI6Im1lbnRvciIsImV4cCI6MTY3MTEyOTk1N30.Y5X98iN5Dkquf_2RQLu7RBwC3Jbq6QWr2BNh9GCQdbo";
    }

    public void setInvalidUrlValidCategoryId(){
        url2 = "https://stagging.educatetheworld.tech/api/v1/categories/1b911bd0-d19a-4691-b250-691601800";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiM2FmMDljYTMtNjhlMy00ZjY4LWFmZGItOTA1ZmVjNDVhNTFjIiwibWVudG9yX2lkIjoiYjhhZDdiNDMtMTBjOC00NDk1LTgwZDQtNTkzZWIxY2Q1Y2E5Iiwicm9sZSI6Im1lbnRvciIsImV4cCI6MTY3MTEyOTk1N30.Y5X98iN5Dkquf_2RQLu7RBwC3Jbq6QWr2BNh9GCQdbo";
    }

    public void requestFindCourseCategory(){
        given().header("Authorization", token)
                .header("Content-Type","application/json");
        when().get(url);
    }

    public void requestInvalidFindCourseCategory(){
        given().header("Authorization", token)
                .header("Content-Type","application/json");
        when().get(url2);
    }

    public void getMessageSuccess(){
        then().body("message", equalTo("Success get courses by category"));
    }

    public void getMessageCategoryNotFound(){
        then().body("message", equalTo("Category not found"));
    }

}
