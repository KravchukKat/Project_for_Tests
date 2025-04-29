package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.$;

public class LotteryPage {

    private final SelenideElement
            lotteryPage = $(".lottery-page__content");

    public LotteryPage setLotteryPage() {
        lotteryPage.shouldNotBe(empty);

        return this;
    }
}
