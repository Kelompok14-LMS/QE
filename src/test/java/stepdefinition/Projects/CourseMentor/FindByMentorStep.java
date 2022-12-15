package stepdefinition.Projects.CourseMentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.CourseMentor.FindByMentor;

public class FindByMentorStep {

    @Steps
    FindByMentor findByMentor;

    @Given("i set url find by mentor")
    public void iSetUrlFindByMentor() {
        findByMentor.setUrlValidMentorId();
    }

    @When("i request find by mentor")
    public void iRequestFindByMentor() {
        findByMentor.requestFindByMentor();
    }

    @Then("i get message Success get courses by mentor")
    public void iGetMessageSuccessGetCoursesByMentor() {
        findByMentor.getMessageSuccessGetCoursesByMentor();
    }

    @Given("i set invalid url find by mentor")
    public void iSetInvalidUrlFindByMentor() {
        findByMentor.setUrlInvalidMentorId();
    }

    @When("i request invalid find by mentor")
    public void iRequestInvalidFindByMentor() {
        findByMentor.requestFindInvalidByMentor();
    }

    @Then("i get message Mentor not found")
    public void iGetMessageMentorNotFound() {
        findByMentor.getMessageMentorNotFound();
    }

    @And("i get status code 500")
    public void iGetStatusCode500() {
        findByMentor.statusCode500();
    }
}
