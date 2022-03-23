package StepObject;

import PageObject.CappadociaPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static DataObject.CappadociaData.SearchValue;

public class CappadociaSteps extends CappadociaPage {
    public CappadociaSteps GoToCappadociaPage() {
        SearchButton.setValue(SearchValue);
        return this;
    }

    @Step("Click Cappadocia Result")
    public CappadociaSteps SearchResultFill() {
        SearchResultButton.click();
        return this;
    }

    @Step("Click Cappadocia Add Button")
    public CappadociaSteps AddButtonFill() {
        AddButton.click();
        return this;
    }

    @Step("Search Kokhta")
    public CappadociaSteps SearchKokhtaFill(String SearchKoktaValue) {
        SearchKokhtaButton.setValue(SearchKoktaValue);
        return this;
    }

    @Step("Click Kokhta Result")
    public CappadociaSteps SearchKokhtaResultFill() {
        SearchKokhtaResultButton.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }

    @Step("Click Kokhta Add Button")
    public CappadociaSteps Add2Fill() {
        AddButton2.click();
        return this;
    }

    @Step("Search Travel")
    public CappadociaSteps SearchTravelFill(String SearchTravelValue) {
        SearchTravelButton.setValue(SearchTravelValue);
        return this;
    }

    @Step("Click Search Text")
    public CappadociaSteps SearchTextFill() {
        SearchTextButton.click();
        return this;
    }

    @Step("Click Add Fill 3")
    public CappadociaSteps Add3Fill() {
        AddButton3.click();
        return this;
    }

    @Step("Click Basket Button")
    public CappadociaSteps BasketFill() {
        BasketButton.click();
        return this;
    }

    @Step("Click Basket Remove")
    public CappadociaSteps BasketRemoveFill() {
        BasketRemoveButton.click();
        return this;
    }

    @Step("Click Basket Remove2")
    public CappadociaSteps BaskeRemove2Fill() {
        BaskeRemoveButton2.click();
        return this;
    }

    @Step("Click Basket Item")
    public CappadociaSteps BasketItemFill() {
        BasketItemButton.click();
        return this;
    }
}
