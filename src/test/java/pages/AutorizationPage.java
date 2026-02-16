package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AutorizationPage {

    SelenideElement username = $("#user-name");
    SelenideElement password = $("#password");
    SelenideElement logButton = $("#login-button");

    @Step("Установка значения логина")
    public AutorizationPage setUserName(String userNameValue) {
        username.setValue(userNameValue);

        return this;
    }

    @Step("Установка значения пароля")
    public AutorizationPage setPassword(String userPassword) {
        password.setValue(userPassword);

        return this;
    }

    @Step("Клик по логину")
    public AutorizationPage logButtonClick() {
        logButton.click();

        return this;
    }
}