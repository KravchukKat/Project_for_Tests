package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CharityPage {

    private final SelenideElement
            findByСharity = $$(".app-navigation-item__submenu-text").findBy(text("Благотворительность")),
            searchСharity = $(".charity-header__title");

    public CharityPage setFindBySectionСharity() {
        findByСharity.click();
        return this;
    }

    public CharityPage setSearchСharity() {
        searchСharity.shouldHave(text("Бонусы на добрые дела"));

        return this;
    }
}
