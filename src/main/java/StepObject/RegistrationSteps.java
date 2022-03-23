package StepObject;

import PageObject.RegistrationPage;
import io.qameta.allure.Step;

public class RegistrationSteps extends RegistrationPage {
    public RegistrationSteps GoToRegistrationPage(){
        LoginButton.click();
        RegistrationButton.click();
        return this;
    }

    @Step("Registration FirstName -{Name}")
    public RegistrationSteps FirstNameFill(String FirstNameValue){
        FirstNameInput.setValue(FirstNameValue);
        return this;
    }
    @Step("Registration LastName -{LastName}")
    public RegistrationSteps LastNameFill(String LastNameValue){
        LastNameInput.setValue(LastNameValue);
        return this;
    }
    @Step("Registration Phone")
    public RegistrationSteps PhoneFill(String PhoneValue){
        PhoneInput.setValue(PhoneValue);
        return this;
    }
    @Step("Registration Birth -{BirthData}")
    public RegistrationSteps DataBirthFill(String DataBirthValue){
        DateBirthInput.setValue(DataBirthValue);
        return this;
    }
    @Step("Registration Gender")
    public RegistrationSteps GenderFill(){
        GenderInput.click();
        return this;
    }
    @Step("Registration Gender -{Woman}")
    public RegistrationSteps WomanFill(){
        WomanInput.click();
        return this;
    }
    @Step("Registration in password is - {pass}")
    public RegistrationSteps PasswordFill(String PasswordValue){
        PasswordInput.setValue(PasswordValue);
        return this;
    }
    @Step("Registration in Confirm password is - {pass}")
    public RegistrationSteps ConfirmPasswordFill(String ConfirmPasswordValue){
        ConfirmPasswordInput.setValue(ConfirmPasswordValue);
        return this;
    }
    @Step("Registration Agree")
    public RegistrationSteps IsAgreedTermsFill(){
        IsAgreedTermsInput.click();
        return this;
    }
}