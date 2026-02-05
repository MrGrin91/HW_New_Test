import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class SoulsTest extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    public void addOrderTest() {
        Allure.step("Открываем браузер", () -> {
            open();
        });

        Allure.step("Авторизация", () -> {
        mainPage.setUserName("standard_user");
        mainPage.setPassword("secret_sauce");
        });

        mainPage.logButtonClick();
        $("#item_4_title_link").click();
        mainPage.addButtonClick();
        mainPage.containerButtonClick();
        mainPage.continueSButtonClick();

        Allure.step("Заполнение личных данных", () -> {
        mainPage.setName("Vadim");
        mainPage.setLName("Ruch");
        mainPage.setCode("1234");
        });

        mainPage.continueButtonClick();
        mainPage.finishButtonClick();
        mainPage.checkcechcomccon("Thank you for your order!");

    }


}
