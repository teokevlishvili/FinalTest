package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class WishlistPage {
    public SelenideElement
          LoginInput=$(".swoop-login"),
          EmailWInput=$(byName("Email")),
          PasswordWInput=$(byName("password")),
          LoginAuthorizationInput=$(".login-authorization"),
          WishlistInput=$(".wishlist-top-header"),
          XpathWInput=$(byXpath("//*[@id=\"body\"]/div[8]/div[2]/div[3]/div[2]/div[1]/div[2]/div[3]/div[3]")),
          XpathW2Input=$(byXpath("//*[@id=\"body\"]/div[8]/div[2]/div[3]/div[2]/div[2]/div[2]/div[3]/div[3]")),
          Wishlist2Input=$(".wishlist-top-header"),
          BasketBackInput=$(byText("კალათაში გადატანა")),
          BasketBack2Input=$(byText("კალათაში გადატანა")),
          BasketCounterInput=$(".basket-counter"),
          BasketRemoveInput=$(".basket-item__remove"),
          BasketRemove2Input=$(".basket-item__remove"),
          BasketCounter2Input=$(".basket-counter");


}
