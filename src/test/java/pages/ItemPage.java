package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

    public class ItemPage {
        SelenideElement addButton = $("#add-to-cart");
        SelenideElement containerButton = $("#shopping_cart_container");


        @Step("Клик по добавить в корзину")
        public ItemPage addButtonClick() {
            addButton.click();

            return this;
        }

        @Step("Клик по корзине")

        public ItemPage containerButtonClick() {
            containerButton.click();

            return this;
        }
    }