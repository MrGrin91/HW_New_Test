package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EndPage {

    SelenideElement finishButton = $("finish");
    SelenideElement shouldhavecechcomccon = $("checkout_complete_container");

    @Step("Клик по кнопке завершить")
    public EndPage finishButtonClick() {
        finishButton.click();

        return this;
    }

    @Step("Проверка ответа о покупке")
    public EndPage checkcechcomccon(String cechcomcconValue) {
        shouldhavecechcomccon.shouldHave(text(cechcomcconValue));

        return this;
    }
}
