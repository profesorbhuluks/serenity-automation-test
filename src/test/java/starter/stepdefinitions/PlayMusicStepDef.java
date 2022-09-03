package starter.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.PlayMusicSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PlayMusicStepDef {

    @Steps
    PlayMusicSteps playMusicSteps;


    @Given("^User on youtube music page$")
    public void userOnYoutubeMusicPage() throws Throwable {
        playMusicSteps.homePage();
    }

    @When("^User click quick pick music$")
    public void userClickQuickPickMusic() throws Throwable {
       playMusicSteps.clickPlayMusic();
    }

    @Then("^User see music played$")
    public void userSeeMusicPlayed() throws Throwable {
        assertThat("Button notappears", playMusicSteps.getPalypauseBtn(),equalTo(Boolean.TRUE));
    }
}
