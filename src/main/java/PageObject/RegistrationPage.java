package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    public SelenideElement
       LoginButton=$(".swoop-login"),
       RegistrationButton=$(".register"),
       FirstNameInput=$(byName("FirstName")),
       LastNameInput=$(byName("LastName")),
       PhoneInput=$(byName("Phone")),
       DateBirthInput=$(byName("DateBirth")),
       GenderInput= $("#pGender"),
       WomanInput=$(byText("ქალი")),
       PasswordInput=$(byName("Password")),
       ConfirmPasswordInput=$(byName("ConfirmPassword")),
       IsAgreedTermsInput=$(byName("IsAgreedTerms"));
}
