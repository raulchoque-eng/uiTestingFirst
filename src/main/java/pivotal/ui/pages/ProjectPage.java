package pivotal.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProjectPage extends BasePage {

    @FindBy(id = "view173")
    private WebElement inProject;

    @FindBy(xpath = "//div[@id=\"panel_backlog_2336605\"]//a[@title=\"Add Story\"]")
    private WebElement addStoryBtn;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(inProject));
    }

    public void addStory() {
        addStoryBtn.click();
    }
}
