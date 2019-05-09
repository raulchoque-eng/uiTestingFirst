package steps;

import cucumber.api.java.en.When;
import pivotal.ui.pages.DashboardPage;

public class Dashboard {


    DashboardPage dashboardPage = new DashboardPage();

    @When("^I navigate to a Project in Dashboard page$")
    public void i_navigate_to_Project_Dashboard_page() {
        dashboardPage.goIntoProject();
    }
}
