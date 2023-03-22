package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CheckVisibleAgreementTest extends BaseTest {
    @Test
    public void CheckVisibleAgreementAndValidationHelpForm(){
        open("");
        $(".dlay-cookienotice-button").click();
        $x("//* [contains(@class,'b24-form-control-desc')]").click();
        $(".b24-window-popup-title").shouldBe(Condition.visible);
        $(".b24-window-close").click();
        $("div form .b24-form-btn-block").click();
        $(".b24-form-control-alert-message").shouldHave(text("Поле обязательно для заполнения"));
    }
}
