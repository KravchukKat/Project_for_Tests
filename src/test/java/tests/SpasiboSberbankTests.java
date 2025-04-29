package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

@Tag("MyProject")
public class SpasiboSberbankTests extends TestBase{
    SpasiboSberbankPage spasiboSberbankPage = new SpasiboSberbankPage();
    CouponsPage couponsPage = new CouponsPage();
    RailwayTicketsPage railwayTicketsPage = new RailwayTicketsPage();
    CharityPage charityPage = new CharityPage();
    SberPrimePage sberPrimePage = new SberPrimePage();
    LotteryPage lotteryPage = new LotteryPage();

    @DisplayName("Проверка наличия купонов")
    @Test
    @Owner("KravchukK")
    void searchShouldHaveCouponsTest() {
        step("Переходим на страницу 'Купоны'", () ->
                spasiboSberbankPage.openPage()
                        .removeBanners()
                        .hoverToElementСoupons()
        );
        step("Проверяем наличие купонов", () ->
                couponsPage.setCouponsListPage()
        );
    }

    @DisplayName("Проверка возможности покупки ЖД билетов")
    @Test
    @Owner("KravchukK")
    void searchTravelTicketsTest() {
        step("В разделе меню 'Тревел' переходим на страницу 'ЖД'", () ->
            spasiboSberbankPage.openPage()
                    .removeBanners()
                    .hoverToElementTravel()
        );
        step("Проверяем возможность покупки ЖД билетов", () ->
            railwayTicketsPage.setFindByRailwayTickets()
                    .setSearchButton()
        );
    }

    @DisplayName("Проверка перевода бонусов на благотворительность")
    @Test
    @Owner("KravchukK")
    void searchTransfersAndExchangesTest() {
        step("В разделе меню 'Переводы и обмен' переходим на страницу 'Благотворительность'", () ->
                spasiboSberbankPage.openPage()
                        .removeBanners()
                        .hoverToElementTransfersAndExchanges()
        );
        step("Проверяем возможность перевода бонусов на благотворительность", () ->
                charityPage.setFindBySectionСharity()
                        .setSearchСharity()
        );
    }

    @DisplayName("Проверка подписки СберПрайм")
    @Test
    @Owner("KravchukK")
    void searchSubscriptionTest() {
        step("Переходим в раздел меню 'СберПрайм'", () ->
            spasiboSberbankPage.openPage()
                    .removeBanners()
                    .hoverToElementSberPrime()
        );
        step("Проверяем наличие подписки СберПрайм", () ->
            sberPrimePage.setSberPrimePage()
        );
    }

    @DisplayName("Проверка вариантов Лотереи")
    @Test
    @Owner("KravchukK")
    void searchShouldHaveLotteriesTest() {
        step("Переходим в раздел меню 'Лотереи'", () ->
                spasiboSberbankPage.openPage()
                        .removeBanners()
                        .hoverToElementLotteries()
        );
        step("Проверяем наличие Лотереи", () ->
                lotteryPage.setLotteryPage()
        );
    }

}
