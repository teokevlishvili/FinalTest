package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class GiftPage {
    public SelenideElement
        ChooseInput=$(byText("გართობა")),
        RangeInput=$(".range-filter-input"),
        LocationInput=$(".cat-location-drop"),
        OldTbilisiInput=$(byText("ძველი თბილისი")),
        OfferInput=$(".special-offer-img"),
        CheckoutInput=$(".checkout__button"),
        BuyInput=$(byText("ყიდვა")),
        GiftEmailInput=$(byName("Email")),
        GiftPasswordInput=$(byName("password")),
        LoginInput=$(".login-authorization"),
        GiftEmail2Input=$(byName("Email")),
        Gift2PasswordInput=$(byName("password")),
        Login2Input=$(".login-authorization"),
        GiftEmail3Input=$(byName("Email")),
        GiftPassword3Input=$(byName("password")),
        Login3Input=$(".login-authorization"),
        XpathInput=$(".totals__button"),
        Xpath2Input=$(".basket-item__toggle"),
        NameInput=$(byName("Items[0].BeneficiaryInfo.Name")),
        EmailInput=$(byName("Items[0].BeneficiaryInfo.Email")),
        PhoneInput=$(byName("Items[0].BeneficiaryInfo.Phone"));



}
