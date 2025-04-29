package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SpasiboSberbankPage {

    private final SelenideElement
            hoverToNavigation = $(".app-navigation");

    public SpasiboSberbankPage openPage() {
        open("https://spasibosberbank.ru");
        return this;
    }

    public SpasiboSberbankPage removeBanners() {
        executeJavaScript("document.querySelectorAll('#fixedban, footer, iframe').forEach(el => el.remove())");
        waitUntilIframesGone();

        return this;
    }

    private void waitUntilIframesGone() {
        for (int i = 0; i < 10; i++) {
            if ($$("iframe").isEmpty()) break;
            sleep(4000);
            executeJavaScript("document.querySelectorAll('iframe').forEach(el => el.remove())");
        }
    }

    public SpasiboSberbankPage hoverToElementСoupons(){
        hoverToNavigation.$(byText("Купоны")).click();

        return this;
    }

    public SpasiboSberbankPage hoverToElementTravel() {
        hoverToNavigation.$(byText("Тревел")).hover();
        return this;
    }

    public SpasiboSberbankPage hoverToElementTransfersAndExchanges() {
        hoverToNavigation.$(byText("Переводы и обмен")).hover();
        return this;
    }

    public SpasiboSberbankPage hoverToElementSberPrime() {
        hoverToNavigation.$(byText("СберПрайм")).click();;
        return this;
    }

    public SpasiboSberbankPage hoverToElementLotteries(){
        hoverToNavigation.$(byText("Лотереи")).click();

        return this;
    }

}
