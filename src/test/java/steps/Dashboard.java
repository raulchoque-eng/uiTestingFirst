package steps;

import cucumber.api.java.en.When;
import pivotal.ui.pages.DashboardPage;

public class Dashboard {

    private DashboardPage dashboardPage = new DashboardPage();

    @When("^I navigate to a Project in Dashboard page$")
    public void navigateToProjectDashboardPage() {
        dashboardPage.goIntoProject();
    }
}
