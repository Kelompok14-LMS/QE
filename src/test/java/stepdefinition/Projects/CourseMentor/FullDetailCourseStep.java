package stepdefinition.Projects.CourseMentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.CourseMentor.FullDetailCourse;

public class FullDetailCourseStep {

    @Steps
    FullDetailCourse fullDetailCourse;

    @Given("i set url token course id")
    public void iSetUrlTokenCourseId() {
        fullDetailCourse.setUrlTokenCourseId();
    }

    @When("i request full detail course")
    public void iRequestFullDetailCourse() {
        fullDetailCourse.requestFullDetail();
    }

    @Then("i get message success get full detail")
    public void iGetMessageSuccessGetFullDetail() {
        fullDetailCourse.messageSuccesGetFull();
    }

    @Given("i set invalid url course id")
    public void iSetInvalidUrlCourseId() {
        fullDetailCourse.setInvalidTokenCourseId();
    }

    @When("i request full detail course invalid id")
    public void iRequestFullDetailCourseInvalidId() {
        fullDetailCourse.requestFullDetailInvalidId();
    }

    @And("i get status code 404")
    public void iGetStatusCode404() {
        fullDetailCourse.statusCode404();
    }

    @Then("i get message course not found")
    public void iGetMessageCourseNotFound() {
        fullDetailCourse.messageCourseNotFound();
    }
}
