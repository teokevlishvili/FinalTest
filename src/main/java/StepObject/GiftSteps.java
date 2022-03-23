package StepObject;

import PageObject.GiftPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class GiftSteps extends GiftPage {
    public GiftSteps GoToGiftPage(){
        ChooseInput.click();
        return this;
    }
    @Step("Range in Gift -{range}")
    public GiftSteps RangeFill(String RangeValue){
        RangeInput.setValue(RangeValue);
        return this;
    }
    @Step("Click Location")
    public GiftSteps LocationFill(){
        LocationInput.click();
        return this;
    }
    @Step("Choose location")
    public GiftSteps OldTbilisiFill(){
        OldTbilisiInput.click();
        return this;
    }
    @Step("Gift Offer")
    public GiftSteps OfferFill(){
        OfferInput.click();
        return this;
    }
    @Step("Click Checkout")
    public GiftSteps CheckoutFill(){
        CheckoutInput.click();
        return this;
    }
    @Step("Click Buy")
    public GiftSteps BuyFill(){
        BuyInput.click();
        return this;
    }
    @Step("Gift in email is -{email}")
    public GiftSteps GiftEmailFill(String GiftEmailValue){
        GiftEmailInput.setValue(GiftEmailValue);
        return this;
    }
    @Step("Gift in password is -{password}")
    public GiftSteps GiftPasswordFill(String GiftPasswordValue){
        GiftPasswordInput.setValue(GiftPasswordValue);
        return this;
    }
    @Step("Click log in Button")
    public GiftSteps LoginFill(){
        LoginInput.click();
        return this;
    }
    @Step("Gift in email2 is -{email2}")
    public GiftSteps GiftEmail2Fill(String GiftEmail2Value){
        GiftEmail2Input.setValue(GiftEmail2Value);
        return this;
    }
    @Step("Gift in password2 is -{password2}")
    public GiftSteps Gift2PasswordFill(String GiftPassword2Value){
        Gift2PasswordInput.setValue(GiftPassword2Value);
        return this;
    }
    @Step("Click log2 in Button")
    public GiftSteps Login2Fill(){
        Login2Input.click();
        return this;
    }
    @Step("Gift in email3 is -{email3}")
    public GiftSteps GiftEmail3Fill(String GiftEmail3Value){
        GiftEmail3Input.setValue(GiftEmail3Value);
        return this;
    }
    @Step("Gift in password3 is -{password3}")
    public GiftSteps GiftPassword3Fill(String GiftPassword3Value){
        GiftPassword3Input.setValue(GiftPassword3Value);
        return this;
    }
    @Step("Click log3 in Button")
    public GiftSteps Login3Fill(){
        Login3Input.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    public GiftSteps XpathFill(){
        XpathInput.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    public GiftSteps Xpath2Fill(){
        Xpath2Input.click();
        return this;
    }
    @Step("Gift in name is -{name}")
    public GiftSteps NameFill(String NameValue){
        NameInput.setValue(NameValue).shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("Gift in email is -{email}")
    public GiftSteps EmailFill(String EmailValue){
        EmailInput.setValue(EmailValue).shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("Gift in phone is -{phone}")
    public GiftSteps PhoneFill(String PhoneValue){
        PhoneInput.setValue(PhoneValue).shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;

    }
}
