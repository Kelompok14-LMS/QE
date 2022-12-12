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

    @When("i input null body")
    public void iInputNullBody() {
        login.inputNullBody();
    }

    @And("i get status code 400")
    public void iGetStatusCode400() {
        login.statusCode400();
    }

    @Then("i get message status error")
    public void iGetMessageStatusError() {
        login.messageStatusError();
    }

    @When("i input valid email null password")
    public void iInputValidEmailNullPassword() {
        login.inputValidEmailNullPassword();
    }

    @When("i input null email valid password")
    public void iInputNullEmailValidPassword() {
        login.inputNullEmailValidPassword();
    }

    @When("i input valid email wrong password")
    public void iInputValidEmailWrongPassword() {
        login.inputValidEmailWrongPassword();
    }

    @And("i get status code 409")
    public void iGetStatusCode409() {
        login.statusCode409();
    }

    @Then("i get message user not found")
    public void iGetMessageUserNotFound() {
        login.messageUserNotFound();
    }

    @When("i input invalid format email")
    public void iInputInvalidFormatEmail() {
        login.inputInvalidFormatEmail();
    }

    @When("i input wrong email valid password")
    public void iInputWrongEmailValidPassword() {
        login.inputWrongEmailValidPassword();
    }
}
