package pivotal.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {

    @FindBy(css = "div.projectPaneSection")
    private WebElement projectSection;

    @FindBy(xpath = "//a[contains(text(), \"Project to add a Story\")]")
    private WebElement projectLink;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(projectSection));
    }

    public void goIntoProject() {
        projectLink.click();
    }

}
