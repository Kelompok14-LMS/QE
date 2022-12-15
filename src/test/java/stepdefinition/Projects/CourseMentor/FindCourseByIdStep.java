package stepdefinition.Projects.CourseMentor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.CourseMentor.FindCourseById;

public class FindCourseByIdStep {

    @Steps
    FindCourseById findCourseById;

    @Given("i set url find course by id")
    public void iSetUrlFindCourseById() {
        findCourseById.setUrlAndToken();
    }

    @When("i request find course by id")
    public void iRequestFindCourseById() {
        findCourseById.requestFindCourse();
    }

    @Then("i get message Success get course by id")
    public void iGetMessageSuccessGetCourseById() {
        findCourseById.messageSuccess();
    }

    @When("i request find course by id with invalid method")
    public void iRequestFindCourseByIdWithInvalidMethod() {
        findCourseById.requestFindCourseWithInvalidMethod();
    }

    @Then("i get message method not allowedd")
    public void iGetMessageMethodNotAllowedd() {
        findCourseById.messageMethodNotAllowed();
    }
}
