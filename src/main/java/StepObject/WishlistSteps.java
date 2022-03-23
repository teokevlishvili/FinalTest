package StepObject;

import PageObject.WishlistPage;
import io.qameta.allure.Step;

public class WishlistSteps extends WishlistPage {
    public WishlistSteps GoToWishlistPage(){
        LoginInput.click();
        return this;
    }
    @Step("Log in email is - {email}")
    public WishlistSteps EmailWFill (String EmailWValue){
        EmailWInput.setValue(EmailWValue);
        return this;
    }
    @Step("Log in password is - {pass}")
    public WishlistSteps PasswordWFill( String PasswordWValue){
        PasswordWInput.setValue(PasswordWValue);
        return this;
    }
    @Step("Click login button")
    public WishlistSteps LoginAuthorizationFill(){
        LoginAuthorizationInput.click();
        return this;
    }
    @Step("Click Wishlist button")
    public WishlistSteps WishlistFill(){
        WishlistInput.click();
        return this;
    }
    @Step("Click Xpath button")
    public WishlistSteps XpathWFill(){
        XpathWInput.click();
        return this;
    }
    @Step("Click Xpath2 button")
    public WishlistSteps XpathW2Fill(){
        XpathW2Input.click();
        return this;
    }
    @Step("Click Wishlist wish button")
    public WishlistSteps Wishlist2Fill(){
        Wishlist2Input.click();
        return this;
    }
    @Step("Click Wishlist Basket button")
    public WishlistSteps BasketBackFill(){
        BasketBackInput.click();
        return this;
    }
    @Step("Click Wishlist Basket2 button")
    public WishlistSteps BasketBack2Fill(){
        BasketBack2Input.click();
        return this;
    }
    @Step("Click Wishlist BasketCounter button")
    public WishlistSteps BasketCounterFill(){
        BasketCounterInput.click();
        return this;
    }
    @Step("Click Wishlist BasketRemove button")
    public WishlistSteps BasketRemoveFill(){
        BasketRemoveInput.click();
        return this;
    }
    @Step("Click Wishlist BasketRemove2 button")
    public WishlistSteps BasketRemove2Fill(){
        BasketRemove2Input.click();
        return this;

    }
    @Step("Click Wishlist Basket Counter2 button")
    public WishlistSteps BasketCounter2Fill(){
        BasketCounter2Input.click();
        return this;
    }
}
