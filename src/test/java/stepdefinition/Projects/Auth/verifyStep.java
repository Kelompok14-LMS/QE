package stepdefinition.Projects.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Auth.Verify;

public class verifyStep {

    @Steps
    Verify verify;
    @Given("i set url verify")
    public void iSetUrlVerify() {
        verify.setUrl();
    }

    @When("i input valid otp")
    public void iInputValidOtp() {
        verify.inputValidOtp();
    }

    @And("i get status code 201")
    public void iGetStatusCode201() {
        verify.statusCode201();
    }

    @Then("i get message register success")
    public void iGetMessageRegisterSuccess() {
        verify.messageVerifySuccess();
    }

    @When("i input wrong otp")
    public void iInputWrongOtp() {
        verify.inputWrongOtp();
    }

    @Then("i get message otp not found")
    public void iGetMessageOtpNotFound() {
        verify.messageOtpNotFound();
    }
}
