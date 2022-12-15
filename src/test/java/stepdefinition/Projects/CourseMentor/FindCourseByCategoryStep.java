package stepdefinition.Projects.CourseMentor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.CourseMentor.FindCourseByCategory;

public class FindCourseByCategoryStep {

    @Steps
    FindCourseByCategory findCourseByCategory;

    @Given("i set url find course by category")
    public void iSetUrlFindCourseByCategory() {
        findCourseByCategory.setUrlValidCategoryId();
    }

    @When("i request find course by category")
    public void iRequestFindCourseByCategory() {
        findCourseByCategory.requestFindCourseCategory();
    }

    @Then("i get message Success get courses by category")
    public void iGetMessageSuccessGetCoursesByCategory() {
        findCourseByCategory.getMessageSuccess();
    }

    @Given("i set invalid url find course by category")
    public void iSetInvalidUrlFindCourseByCategory() {
        findCourseByCategory.setInvalidUrlValidCategoryId();
    }

    @When("i request find course by invalid category")
    public void iRequestFindCourseByInvalidCategory() {
        findCourseByCategory.requestInvalidFindCourseCategory();
    }

    @Then("i get message Category not found")
    public void iGetMessageCategoryNotFound() {
        findCourseByCategory.getMessageCategoryNotFound();
    }
}
