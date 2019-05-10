package pivotal.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProjectPage extends BasePage {

    @FindBy(id = "panel_backlog_2336605")
    private WebElement panelBackog;

    @FindBy(xpath = "//div[@id=\"panel_backlog_2336605\"]//a[@title=\"Add Story\"]")
    private WebElement addStoryBtn;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(panelBackog));
    }

    public void addStory() {
        addStoryBtn.click();
    }

//    @FindBy(css = "div.projectPaneSection")
//    private WebElement projectSection;
//
//    @FindBy(xpath = "//a[contains(text(), \"Project for update workspace\")]")
//    private WebElement projectLink;
//
//    @Override
//    public void waitUntilPageObjectIsLoaded() {
//        wait.until(ExpectedConditions.visibilityOf(projectSection));
//    }
//
//    public void goIntoProject() {
//        projectLink.click();
//    }
//
//    public void validateProjectName(String nameProject) {
//        if (projectLink != null) {
//            //create a project with "nameProject" by API
//            //refresh the web page
//        } else {
//            projectLink.getAttribute("text");
//        }
//
//    }
}
