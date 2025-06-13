package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.assertThat;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

public class StepDefinitions {
    private String today;
    private String actualAnswer;



    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertThat(actualAnswer).isEqualTo(expectedAnswer);
    }


    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        System.out.println("User is on the home page.");
    }

    @When("I enter {string} In location")
    public void i_enter_location(String location) {
        System.out.println("Entered location: " + location);
        
    }

    @When("I search for {string}")
    public void i_search_for(String location) {
        System.out.println("Searching for: " + location);
        
    }

    @When("I click the search button")
    public void i_click_the_search_button() {
        System.out.println("Clicked the search button.");
        
    }

    @Then("I should see a list of garage sales closest to me")
    public void i_should_see_a_list_of_garage_sales_closest_to_me() {
        System.out.println("Garage sales list displayed.");
        
    }

    @Then("I should see a message {string}")
    public void i_should_see_a_message(String message) {
        System.out.println("Expected message: " + message);
        
    }
}