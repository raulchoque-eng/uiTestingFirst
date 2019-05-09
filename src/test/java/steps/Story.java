package steps;

import cucumber.api.java.en.And;
import pivotal.ui.pages.StoryForm;

/**
 * Story class
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class Story {

    private StoryForm storyForm = new StoryForm();

    @And("^I create a new Story in Current Operation and Backlog panel with name \"([^\"]*)\"$")
    public void createStory(String nameStory) {

        storyForm.createStory(nameStory);
    }
}
