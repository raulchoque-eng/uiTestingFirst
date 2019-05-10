package steps;

import cucumber.api.java.en.And;
import pivotal.ui.pages.ProjectPage;

public class ProjectSteps {
    private ProjectPage projectPage = new ProjectPage();

    @And("^I navigate to Story in Project page$")
    public void navigateToProjectDashboardPage() {
        projectPage.addStory();
    }

//    @And("^I have a Project with name \"([^\"]*)\" in Dashboard page$")
//    public void isProjectOnDashboardPage( String nameProject) {
//        projectPage.validateProjectName(nameProject);
//    }
//
//    @When("^I navigate to a Project in Dashboard page$")
//    public void navigateToProjectDashboardPage() {
//        dashboardPage.goIntoProject();
//    }
}
