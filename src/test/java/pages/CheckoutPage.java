package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    SelenideElement fname = $("#first-name");
    SelenideElement lname = $("#last-name");
    SelenideElement pcode = $("#postal-code");
    SelenideElement continueButton = $("continue");

    @Step("Установка значения имени")
    public CheckoutPage setName(String userNameValue) {
        fname.setValue(userNameValue);

        return this;
    }

    @Step("Установка значения фамилии")
    public CheckoutPage setLName(String userLNameValue) {
        lname.setValue(userLNameValue);

        return this;
    }

    @Step("Установка значения кода")
    public CheckoutPage setCode(String userCodeValue) {
        pcode.setValue(userCodeValue);

        return this;
    }

    @Step("Клик по нкопке продолженить")
    public CheckoutPage continueButtonClick() {
        continueButton.click();

        return this;
    }
}
