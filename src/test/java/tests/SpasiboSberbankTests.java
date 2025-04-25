package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SpasiboSberbankPage;

import static io.qameta.allure.Allure.step;

public class SpasiboSberbankTests extends TestBase{
    SpasiboSberbankPage spasiboSberbankPage = new SpasiboSberbankPage();


    @DisplayName("Проверка наличия купонов")
    @Test
    @Owner("KravchukK")
    void searchShouldHaveCoupons() {
        step("Переходим на страницу Купоны и проверяем наличие купонов", () ->
                spasiboSberbankPage.openPage()
                        .removeBanners()
                        .hoverToElementСoupons()
                        .setCouponsListPage()
        );
    }

    @DisplayName("Проверка возможности покупки ЖД билетов")
    @Test
    @Owner("KravchukK")
    void searchTravelTickets() {
        step("В разделе меню 'Тревел' проверяем возможность покупки ЖД билетов", () ->
            spasiboSberbankPage.openPage()
                    .removeBanners()
                    .hoverToElementTravel()
                    .setFindByRailwayTickets()
                    .setSearchButton()
        );
    }

    @DisplayName("Проверка перевода бонусов на благотворительность")
    @Test
    @Owner("KravchukK")
    void searchTransfersAndExchanges() {
        step("В разделе меню 'Переводы и обмен' проверяем возможность перевода бонусов на благотворительность", () ->
                spasiboSberbankPage.openPage()
                        .removeBanners()
                        .hoverToElementTransfersAndExchanges()
                        .setFindBySectionСharity()
                        .setSearchСharity()
        );
    }

    @DisplayName("Проверка подписки СберПрайм")
    @Test
    @Owner("KravchukK")
    void searchSubscription() {
        step("В разделе меню 'СберПрайм' проверяем наличие подписки", () ->
            spasiboSberbankPage.openPage()
                    .removeBanners()
                    .hoverToElementSberPrime()
                    .setSberPrimePage()
        );
    }

    @DisplayName("Проверка вариантов Лотереи")
    @Test
    @Owner("KravchukK")
    void searchShouldHaveLotteries() {
        step("В разделе меню 'Лотереи' проверяем наличие Лотереи", () ->
                spasiboSberbankPage.openPage()
                        .removeBanners()
                        .hoverToElementLotteries()
                        .setLotteryPage()
        );
    }

}
