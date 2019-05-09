package pivotal.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * StoryForm class
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class StoryForm extends BasePage{

   @FindBy(xpath = "//div[@class=\"edit details new\"]")
    private WebElement editStory;

    @FindBy(xpath = "//textarea[@aria-label=\"story title\"]")
    private WebElement nameStoryTextBox;

    @FindBy(xpath = "//button[contains(text(), \"Save\")]\n")
    private WebElement clickSaveStoryBtn;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(editStory));
    }

    public void createStory(String nameStory) {
        setNameStory(nameStory);
        clickSaveStoryBtn();

    }

    private  void setNameStory(String name) {
        nameStoryTextBox.sendKeys(name);
    }
    private void clickSaveStoryBtn() {
        clickSaveStoryBtn.click();
    }
}
