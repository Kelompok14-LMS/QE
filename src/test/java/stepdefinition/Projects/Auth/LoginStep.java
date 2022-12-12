package stepdefinition.Projects.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Auth.Login;
import starter.Projects.Auth.Regis;

public class LoginStep {

    @Steps
    Login login;

    @Given("i set url login")
    public void iSetUrlLogin() {
        login.setUrl();
    }

    @When("i input valid body")
    public void iInputValidBody() {
        login.inputValidBody();
    }

    @And("i get status code 200")
    public void iGetStatusCode200() {
        login.statusCode200();
    }

    @Then("i get message login success")
    public void iGetMessageLoginSuccess() {
        login.messageLoginSucces();
    }
}
