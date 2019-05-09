package steps;

import cucumber.api.java.en.And;
import pivotal.ui.pages.ProjectPage;

public class Project {
    ProjectPage projectPage = new ProjectPage();

    @And("^I navigate to Story in Project page$")
    public void i_navigate_to_Project_Dashboard_page() {
        projectPage.addStory();
    }
}
