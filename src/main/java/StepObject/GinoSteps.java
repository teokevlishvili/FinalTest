package StepObject;

import PageObject.GinoPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class GinoSteps extends GinoPage {
    public GinoSteps GoToGinoPage(){
        SearchGinoButton.click();
        return this;
    }
    @Step("Click Gino Result")
    public GinoSteps SearchResult2Fill(){
        SearchResul2tButton.click();
        return this;
    }
    @Step("Click Gino Checkout")
    public GinoSteps CheckoutFill(){
        CheckoutButton.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("Click Gino Total")
    public GinoSteps TotalsFill(){
        TotalsButton.click();
        return this;
    }
    @Step("Gino in email is -{email}")
    public GinoSteps EmailGinoFill(String EmailValue){
        EmailGinoButton.setValue(EmailValue);
        return this;
    }
    @Step("Gino in password is -{password}")
    public GinoSteps PasswordGinoFill(String PasswordValue){
        PasswordGinoButton.setValue(PasswordValue);
        return this;
    }
    @Step("Click login button")
    public GinoSteps LoginGinoFill (){
        LoginGinoButton.click();
        return this;
    }
    @Step("Click login button")
    public GinoSteps Totals2Fill(){
        TotalsButton2.click();
        return this;
    }
    @Step("Click login button")
    public GinoSteps Totals3Fill(){
        TotalsButton3.click();
        return this;
    }
    @Step("Gino in Card is -{Card}")
    public GinoSteps CardFill(String CardValue){
        CardButton.setValue(CardValue);
        return this;
    }
    @Step("Gino in Month is -{month}")
    public GinoSteps MonthFill(){
        MonthButton.click();
        return this;
    }
    @Step("Gino in Number is -{number}")
    public GinoSteps NumberFill(){
        NumberButton.click();
        UserIsOnGinoPage.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    @Step("Gino in Year is -{Year}")
    public GinoSteps YearFill(){
        YearButton.click();
        return this;
    }
    @Step("Gino in Year2 is -{Year2}")
    public GinoSteps YearNumber(){
        YearNumberButton.click();
        UserIsOnGinoPage2.shouldBe(Condition.visible,Duration.ofMillis(3000));
        return this;
    }
    @Step("Gino in Cvc is -{cvc}")
    public GinoSteps CvcFill(String CvcValue){
        CvcButton.setValue(CvcValue);
        return this;
    }
    @Step("Click PaymentButton")
    public GinoSteps PaymentFill(){
        PaymentButton.click();
        return this;
    }

}
