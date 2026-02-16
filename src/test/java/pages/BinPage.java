package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class BinPage {
    SelenideElement chekoutButton = $("#checkout");


    @Step("Клик по добавить в корзину")
    public BinPage chekoutButtonClick() {
        chekoutButton.click();

        return this;
    }
}