package stepdefinition.Projects.CourseMentor;

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
}
