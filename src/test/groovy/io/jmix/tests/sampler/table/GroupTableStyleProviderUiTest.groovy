package io.jmix.tests.sampler.table

import io.jmix.masquerade.component.GroupTable
import io.jmix.tests.extension.ChromeExtension
import io.jmix.tests.sampler.BaseSamplerUiTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.openqa.selenium.interactions.Actions

import static com.codeborne.selenide.Condition.cssValue
import static com.codeborne.selenide.WebDriverRunner.getWebDriver
import static io.jmix.masquerade.Conditions.VISIBLE
import static io.jmix.masquerade.Selectors.$j
import static io.jmix.masquerade.Selectors.byText

@ExtendWith(ChromeExtension)
class GroupTableStyleProviderUiTest extends BaseSamplerUiTest {

    public static final String STANDARD = "Standard (9)"
    public static final String HIGH = "High (4)"
    public static final String PREMIUM = "Premium (4)"
    public static final String BLUE_COLOR = 'rgba(0, 0, 255, 1)'
    public static final String GREEN_COLOR = 'rgba(0, 128, 0, 1)'
    public static final String RED_COLOR = 'rgba(255, 0, 0, 1)'

    @Test
    @DisplayName("Check expand and collapse all rows with style provider of group table")
    void checkGroupTableExpandCollapseRowsWithStyleProvider() {
        openSample('grouptable-style-provider')
        // Wait for the screen will be completely loaded
        new Actions(getWebDriver())
                .pause(200)
                .perform()

        def table = $j(GroupTable.class, 'customerTable')
        checkBackgroundColor(table)
        table.expandAll()
        def row = table
                .asTable()
                .getRow(byText("Potter"))
        row.shouldBe(VISIBLE)
        checkBackgroundColor(table)
        table.collapseAll()
        row.shouldNotBe(VISIBLE)
        checkBackgroundColor(table)
    }

    @Test
    @DisplayName("Check expand and collapse row with style provider of group table")
    void checkGroupTableExpandCollapseRowWithStyleProvider() {
        openSample('grouptable-style-provider')
        def table = $j(GroupTable.class, 'customerTable')
        checkBackgroundColor(table)
        table.expand(byText(HIGH))
        def row = table
                .asTable()
                .getRow(byText("Potter"))
        row.shouldBe(VISIBLE)
        checkBackgroundColor(table)
        table.collapse(byText(HIGH))
        row.shouldNotBe(VISIBLE)
        checkBackgroundColor(table)
    }

    private void checkBackgroundColor(def table) {
        [
                [STANDARD, BLUE_COLOR],
                [PREMIUM, RED_COLOR],
                [HIGH, GREEN_COLOR]
        ].each {
            table
                    .asTable()
                    .getRow(byText(it[0]))
                    .shouldBe(VISIBLE)
                    .shouldHave(cssValue('background-color', it[1]))
        }
    }
}
