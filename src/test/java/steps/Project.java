package steps;

import cucumber.api.java.en.And;
import pivotal.ui.pages.ProjectPage;

public class Project {
    private ProjectPage projectPage = new ProjectPage();

    @And("^I navigate to Story in Project page$")
    public void navigateToProjectDashboardPage() {
        projectPage.addStory();
    }
}
