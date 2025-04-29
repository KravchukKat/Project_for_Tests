package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class RailwayTicketsPage {

    private final SelenideElement
            findByRailwayTickets = $$(".app-navigation-item__submenu-text").findBy(text("ЖД")),
            searchButton = $(".search__button-text");

    public RailwayTicketsPage setFindByRailwayTickets() {
        findByRailwayTickets.click();
        return this;
    }

    public RailwayTicketsPage setSearchButton() {
        searchButton.shouldHave(text("Найти билеты"));

        return this;
    }
}
