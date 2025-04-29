package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.$;

public class SberPrimePage {

    private final SelenideElement
            sberPrimePage = $(".sberprime-page__container");

    public SberPrimePage setSberPrimePage() {
        sberPrimePage.shouldNotBe(empty);;

        return this;
    }
}
