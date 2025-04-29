package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.$;

public class CouponsPage {

    private final SelenideElement
        couponsListPage = $(".coupons-list-page__main");

    public CouponsPage setCouponsListPage() {
        couponsListPage.shouldNotBe(empty);

        return this;
    }
}
