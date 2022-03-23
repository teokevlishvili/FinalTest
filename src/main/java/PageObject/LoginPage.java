package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    public SelenideElement
       LoginButton=$(".swoop-login"),
       EmailButton=$(byName("Email")),
       PasswordButton=$(byName("password")),
       LoginButton2=$(".login-authorization"),
       PasswordresetdButton=$(".password-reset"),
       EmailButton2=$(byName("Email")),
       PasswordClickButton=$(".password-click"),
       SwoopLoginButton=$(".swoop-login"),
       EmailButton3=$(byName("Email")),
       PasswordButton2=$(byName("password")),
       LoginButton3=$(".login-authorization");



}
