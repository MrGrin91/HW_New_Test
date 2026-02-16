package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

    public class ProductPage {
        SelenideElement item4Button = $("#item_4_title_link");


        @Step("Клик по товару 4")
        public ProductPage item4ButtonClick() {
            item4Button.click();

            return this;
        }
    }