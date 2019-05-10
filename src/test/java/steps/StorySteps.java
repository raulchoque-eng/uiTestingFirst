package steps;

import cucumber.api.java.en.And;
import pivotal.ui.pages.StoryForm;

/**
 * StorySteps class
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class StorySteps {

    private StoryForm storyForm = new StoryForm();

    @And("^I create a new Story in Current Operation and Backlog panel with name \"([^\"]*)\"$")
    public void createStory(String nameStory) {

//        // Populate entity information
//        story = storyList.get(0);
//
//        // Create StorySteps by UI
//        storyForm.createStory(story);
        storyForm.createStory(nameStory);
    }
}
