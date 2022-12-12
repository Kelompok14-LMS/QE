package stepdefinition.Projects.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Auth.Regis;

public class RegisStep {

    @Steps
    Regis regis;

    @Given("I set url regis")
    public void iSetUrlRegis() {
        regis.setUrl();
    }

    @When("I input valid body")
    public void iInputValidBody() {
        regis.inputValidBody();
    }


    @And("I get status code 200")
    public void iGetStatusCode200() {
        regis.statusCode200();
    }

    @Then("I get message succes send otp to email")
    public void iGetMessageSuccesSendOtpToEmail() {
        regis.messageEmail();
    }

    @When("I input null body")
    public void iInputNullBody() {
        regis.inputNullBody();
    }

    @And("I get status code 400")
    public void iGetStatusCode400() {
        regis.statusCode400();
    }

    @Then("I get message data null")
    public void iGetMessageDataNull() {
        regis.messageDataNull();
    }

    @When("I input valid email and null body")
    public void iInputValidEmailAndNullBody() {
        regis.inputValidEmailNullPassword();
    }

    @When("I input null email and valid password")
    public void iInputNullEmailAndValidPassword() {
        regis.inputNullEmailValidPassword();
    }

    @When("I input body already email already password")
    public void iInputBodyAlreadyEmailAlreadyPassword() {
        regis.inputBodyAlreadyExist();
    }

    @And("I get status code 409")
    public void iGetStatusCode409() {
        regis.statusCode409();
    }

    @Then("I get message email already exist")
    public void iGetMessageEmailAlreadyExist() {
        regis.messageEmailAlready();
    }
}
