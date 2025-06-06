package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class TestBase {

        @BeforeAll

        static void setupEnvironment() {
            Configuration.baseUrl = "https://spasibosberbank.ru";
            Configuration.timeout = 5000;

            Configuration.browser = System.getProperty("browser", "chrome");
            Configuration.browserVersion = System.getProperty("browser_version", "128.0");
            Configuration.browserSize = System.getProperty("browser_size", "1920x1080");
            Configuration.remote = System.getProperty("browser_remote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;

        }

        @BeforeEach
        void addAllureListener() {
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        }

        @AfterEach
        void addAttachments() {
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();
        }
    }

