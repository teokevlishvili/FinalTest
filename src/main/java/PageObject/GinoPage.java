package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class GinoPage {
    public SelenideElement
       SearchGinoButton=$(".search").setValue("ტყუპების საღვინე სახლი ნაფარეულში"),
       SearchResul2tButton=$(".search-result"),
       CheckoutButton=$(".checkout__button"),
       TotalsButton=$(".totals__button"),
       EmailGinoButton=$(byName("Email")),
       PasswordGinoButton=$(byName("password")),
       LoginGinoButton=$(".login-authorization"),
       TotalsButton2=$(".totals__button"),
       TotalsButton3=$(".totals__button"),
       CardButton= $("#cardNumber"),
       MonthButton=$("#expmonth"),
       NumberButton=$(byText("08")),
       YearButton=$("#expyear"),
       YearNumberButton=$(byText("24")),
       CvcButton=$(byAttribute("name","cvc2")),
       PaymentButton=$("#payment-submit"),
       UserIsOnGinoPage=$(byText("28")),
       UserIsOnGinoPage2=$(byText("23"));

}
