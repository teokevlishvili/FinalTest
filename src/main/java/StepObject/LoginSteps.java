package StepObject;

import PageObject.LoginPage;
import io.qameta.allure.Step;


public class LoginSteps extends LoginPage {
    public LoginSteps GoToLoginPage(){
       LoginButton.click();
       return this;
    }
    @Step("Log in email is - {email}")
    public LoginSteps EmailFill (String EmailValue){
        EmailButton.setValue(EmailValue);
        return this;
    }
    @Step("Log in password is - {pass}")
    public LoginSteps PasswordFill(String PasswordValue1){
        PasswordButton.setValue(PasswordValue1);
        return this;
    }
    @Step("Click login button")
    public LoginSteps LoginFill(){
        LoginButton2.click();
        return this;
    }
    @Step("Log in password is - {reset pass}")
    public LoginSteps PasswordResetFill(){
        PasswordresetdButton.click();
        return this;
    }
    @Step("Log in email is - {email}")
    public LoginSteps EmailFill2(String EmailValue2){
        EmailButton2.setValue(EmailValue2);
        return this;
    }
    @Step("Log in password is - {pass button}")
    public LoginSteps PasswordFill2(){
        PasswordClickButton.click();
        return this;
    }
    @Step("Click login button")
    public LoginSteps SwoopLoginFill(){
        SwoopLoginButton.click();
        return this;
    }
    @Step("Log in email is - {email3}")
    public LoginSteps EmailFill3 (String EmailValue3){
        EmailButton3.setValue(EmailValue3);
        return this;
    }
    @Step("Log in password is - {pass3}")
    public LoginSteps PasswordFill3(String PasswordValue2){
        PasswordButton2.setValue(PasswordValue2);
        return this;
    }
    @Step("Click login button3")
      public LoginSteps LoginStepFill3(){
        LoginButton3.click();
        return this;
    }
}
