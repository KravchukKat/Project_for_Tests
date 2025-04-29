package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

@Tag("MyProject")
@Owner("KravchukK")
public class SpasiboSberbankTests extends TestBase{
    SpasiboSberbankPage spasiboSberbankPage = new SpasiboSberbankPage();
    CouponsPage couponsPage = new CouponsPage();
    RailwayTicketsPage railwayTicketsPage = new RailwayTicketsPage();
    CharityPage charityPage = new CharityPage();
    SberPrimePage sberPrimePage = new SberPrimePage();
    LotteryPage lotteryPage = new LotteryPage();

    @DisplayName("Переходим на страницу 'Купоны' и проверяем наличие купонов")
    @Test
    void searchShouldHaveCouponsTest() {
        spasiboSberbankPage.openPage()
                        .removeBanners()
                        .hoverToElementСoupons();
        couponsPage.setCouponsListPage();
    }

    @DisplayName("В разделе меню 'Тревел' переходим на страницу 'ЖД' и проверяем возможность покупки жд билетов")
    @Test
    void searchTravelTicketsTest() {
        spasiboSberbankPage.openPage()
                    .removeBanners()
                    .hoverToElementTravel();
        railwayTicketsPage.setFindByRailwayTickets()
                    .setSearchButton();
    }

    @DisplayName("В разделе меню 'Переводы и обмен' переходим на страницу 'Благотворительность' и проверяем возможность перевода бонусов на благотворительность")
    @Test
    void searchTransfersAndExchangesTest() {
        spasiboSberbankPage.openPage()
                        .removeBanners()
                        .hoverToElementTransfersAndExchanges();
        charityPage.setFindBySectionСharity()
                        .setSearchСharity();
    }

    @DisplayName("Переходим в раздел меню 'СберПрайм' и Проверяем наличие подписки СберПрайм")
    @Test
    void searchSubscriptionTest() {
        spasiboSberbankPage.openPage()
                    .removeBanners()
                    .hoverToElementSberPrime();
        sberPrimePage.setSberPrimePage();
    }

    @DisplayName("Переходим в раздел меню 'Лотереи' и Проверяем наличие лотереи")
    @Test
    void searchShouldHaveLotteriesTest() {
        spasiboSberbankPage.openPage()
                        .removeBanners()
                        .hoverToElementLotteries();
        lotteryPage.setLotteryPage();
    }

}
