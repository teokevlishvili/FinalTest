package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CappadociaPage {
    public SelenideElement
      SearchButton= $(".search").setValue("GoodAura"),
      SearchResultButton=$(".search-result"),
      AddButton=$(".add-item-animation"),
      SearchKokhtaButton=$(".search").setValue("კოხტა მიტარბი / kokhta mitarbi"),
      SearchKokhtaResultButton=$(".search-result"),
      AddButton2=$(".add-item-animation"),
      SearchTravelButton=$(".search").setValue("Travel Buddies Ge"),
      SearchTextButton=$(byText("450 ლარად! დაგეგმეთ მოგზაურობა ულამაზეს კაპადოკიაში 22-23-24-25-26 აპრილს!")),
      AddButton3=$(".add-item-animation"),
      BasketButton=$("#mainBasketIcon"),
      BasketRemoveButton=$(".basket-item__remove"),
      BaskeRemoveButton2=$(".basket-item__remove"),
      BasketItemButton=$(".basket-item__title");


}
