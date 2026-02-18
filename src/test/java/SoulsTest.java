import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.*;

public class SoulsTest extends TestBase {

    AutorizationPage autorizationPage = new AutorizationPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ProductPage productPage = new ProductPage();
    EndPage endPage = new EndPage();
    ItemPage itemPage = new ItemPage();
    BinPage binPage = new BinPage();

    @Test
    public void addOrderTest() {
        Allure.step("Открываем браузер", () -> {
            open("");
        });

        Allure.step("Авторизация", () -> {
        autorizationPage.setUserName("standard_user");
        autorizationPage.setPassword("secret_sauce");
        autorizationPage.logButtonClick();
        });

        productPage.addItemToBasket(0);;

        itemPage.containerButtonClick();

        binPage.chekoutButtonClick();

        Allure.step("Заполнение личных данных", () -> {
        checkoutPage.setName("Vadim");
        checkoutPage.setLName("Ruch");
        checkoutPage.setCode("1234");
        checkoutPage.continueButtonClick();
        });

        endPage.finishButtonClick();
        endPage.checkcechcomccon("Thank you for your order!");

    }
}
