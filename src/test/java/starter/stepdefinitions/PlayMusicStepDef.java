package starter.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.LibrarySteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LibraryMusicStepdef {

    @Steps
   LibrarySteps librarySteps;

    @Given("^User on youtube music library page$")
    public void userOnYoutubeMusicLibraryPage() throws Throwable {
        librarySteps.homePage();
    }

    @When("^User click new playlist$")
    public void userClickNewPlaylist() throws Throwable {
        librarySteps.clickNewPlaylist();
    }

    @And("^User input title \"([^\"]*)\"$")
    public void userInputTitle(String title) throws Throwable {
       librarySteps.inputPlaylistTitle(title);
    }

    @And("^User input description \"([^\"]*)\"$")
    public void userInputDescription(String description) throws Throwable {
        librarySteps.inputPlaylistDescription(description);
        librarySteps.clickCreatePalaylistBtn();
    }


    @Then("^User see created library$")
    public void userSeeCreatedLibrary() throws Throwable {
        assertThat("Title not match", librarySteps.getTitle(), equalTo("Musik Kerja"));
    }
}
