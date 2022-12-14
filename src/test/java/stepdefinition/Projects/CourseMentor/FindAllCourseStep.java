package stepdefinition.Projects.CourseMentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.CourseMentor.FindAllCourse;

public class FindAllCourseStep {

    @Steps
    FindAllCourse findAllCourse;

    @Given("i set url find all course")
    public void iSetUrlFindAllCourse() {
        findAllCourse.setUrlAndToke();
    }

    @When("i request find all course")
    public void iRequestFindAllCourse() {
        findAllCourse.requestFindAllCourse();
    }

    @And("i get status code 200 ok")
    public void iGetStatusCode200Ok() {
        findAllCourse.statusCode200Ok();
    }

    @Then("i get message succes")
    public void iGetMessageSucces() {
        findAllCourse.messageSucces();
    }

    @When("i request find all course with invalid method")
    public void iRequestFindAllCourseWithInvalidMethod() {
        findAllCourse.requestFindAllCourseInvalidMethod();
    }

    @And("i get status code 405")
    public void iGetStatusCode405() {
        findAllCourse.statusCode405();
    }

    @Then("i get message method not allowed")
    public void iGetMessageMethodNotAllowed() {
        findAllCourse.messageMethodNotAllowed();
    }
}
