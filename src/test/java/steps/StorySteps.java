package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pivotal.ui.pages.StoryForm;

import java.util.List;
import java.util.Map;

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

    @Given("^I add a new Story in Current Operation and Backlog panel with the following data$")
    public void addStory(DataTable test) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<Map<String, String>> list = test.asMaps(String.class, String.class);
        System.out.println(list.get(0).get("name_Story"));
        System.out.println(list.get(0).get("blockers_story"));

    }
}
