package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    SelenideElement username = $("#user-name");
    SelenideElement password = $("#password");
    SelenideElement fname = $("#first-name");
    SelenideElement lname = $("#last-name");
    SelenideElement pcode = $("#postal-code");
    SelenideElement shouldhavecechcomccon = $("checkout_complete_container");
    SelenideElement logButton = $("#login-button");
    SelenideElement addButton = $("#add-to-cart");
    SelenideElement containerButton = $("shopping_cart_container");
    SelenideElement continueSButton = $("continue-shopping");
    SelenideElement continueButton = $("continue");
    SelenideElement finishButton = $("finish");

    @Step("Установка значения логина")
    public MainPage setUserName(String userNameValue) {
        username.setValue(userNameValue);

        return this;
    }

    @Step("Установка значения пароля")
    public MainPage setPassword(String userPassword) {
        password.setValue(userPassword);

        return this;
    }

    @Step("Клик по логину")
    public MainPage logButtonClick() {
        logButton.click();

        return this;
    }

    @Step("Клик по добавить в карту")
    public MainPage addButtonClick() {
        addButton.click();

        return this;
    }

    @Step("Клик по корзине")
    public MainPage containerButtonClick() {
        containerButton.click();

        return this;
    }

    @Step("Клик по продолжить покупку")
    public MainPage continueSButtonClick() {
        continueSButton.click();

        return this;
    }

    @Step("Установка значения имени")
    public MainPage setName(String userNameValue) {
        fname.setValue(userNameValue);

        return this;
    }

    @Step("Установка значения фамилии")
    public MainPage setLName(String userLNameValue) {
        lname.setValue(userLNameValue);

        return this;
    }

    @Step("Установка значения кода")
    public MainPage setCode(String userCodeValue) {
        pcode.setValue(userCodeValue);

        return this;
    }

    @Step("Клик по нкопке продолженить")
    public MainPage continueButtonClick() {
        continueButton.click();

        return this;
    }

    @Step("Клик по кнопке завершить")
    public MainPage finishButtonClick() {
        finishButton.click();

        return this;
    }

    @Step("Проверка ответа о покупке")
    public MainPage checkcechcomccon(String cechcomcconValue) {
        shouldhavecechcomccon.shouldHave(text(cechcomcconValue));

        return this;
    }
}