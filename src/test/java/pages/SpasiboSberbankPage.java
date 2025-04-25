package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SpasiboSberbankPage {

    private final SelenideElement
            couponsListPage = $(".coupons-list-page__main"),
            hoverToNavigation = $(".app-navigation"),
            findByRailwayTickets = $$(".app-navigation-item__submenu-text").findBy(text("ЖД")),
            searchButton = $(".search__button-text"),
            sberPrimePage = $(".sberprime-page__container"),
            findByСharity = $$(".app-navigation-item__submenu-text").findBy(text("Благотворительность")),
            searchСharity = $(".charity-header__title"),
            lotteryPage = $(".lottery-page__content");



    public SpasiboSberbankPage openPage() {
        open("https://spasibosberbank.ru/");
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

    public SpasiboSberbankPage setCouponsListPage() {
        couponsListPage.shouldNotBe(empty);

        return this;
    }

    public SpasiboSberbankPage hoverToElementTravel() {
        hoverToNavigation.$(byText("Тревел")).hover();
        return this;
    }

    public SpasiboSberbankPage setFindByRailwayTickets() {
        findByRailwayTickets.click();
        return this;
    }

    public SpasiboSberbankPage setSearchButton() {
        searchButton.shouldHave(text("Найти билеты"));

        return this;
    }

    public SpasiboSberbankPage hoverToElementTransfersAndExchanges() {
        hoverToNavigation.$(byText("Переводы и обмен")).hover();
        return this;
    }

    public SpasiboSberbankPage setFindBySectionСharity() {
        findByСharity.click();
        return this;
    }

    public SpasiboSberbankPage setSearchСharity() {
        searchСharity.shouldHave(text("Бонусы на добрые дела"));

        return this;
    }

    public SpasiboSberbankPage hoverToElementSberPrime() {
        hoverToNavigation.$(byText("СберПрайм")).click();;
        return this;
    }

    public SpasiboSberbankPage setSberPrimePage() {
        sberPrimePage.shouldNotBe(empty);;

        return this;
    }

    public SpasiboSberbankPage hoverToElementLotteries(){
        hoverToNavigation.$(byText("Лотереи")).click();

        return this;
    }

    public SpasiboSberbankPage setLotteryPage() {
        lotteryPage.shouldNotBe(empty);

        return this;
    }

}
