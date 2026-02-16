package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPage {
            ElementsCollection inventoryItems = $$("[data-test=inventory-item]");

            @Step("Добавить товар в корзину по индексу")
            public ProductPage addItemToBasket(int index) {
            inventoryItems.get(index).$("button").click();

            return this;
    }
}