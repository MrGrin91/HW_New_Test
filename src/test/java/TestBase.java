import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.util.HashMap;
import java.util.Map;

@Tag("jenkintsDZtest")

@DisplayName("Тестируем закупки на сайте")

public class TestBase {
    @BeforeAll
    static void setupConfig() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.remote = System.getProperty("remote");
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion");
        Configuration.browserSize = System.getProperty("browserSize","1920x1080");
        Configuration.baseUrl = "https://www.saucedemo.com/";
        Configuration.timeout = 30000;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);

        options.addArguments(
                "--disable-save-password-bubble",
                "--disable-features=PasswordLeakDetection"
        );

        Configuration.browserCapabilities = options;


    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo("Last video");
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
