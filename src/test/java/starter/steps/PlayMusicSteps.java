package starter.steps;


import net.thucydides.core.annotations.Step;
import starter.pages.PlayMusicPage;

public class PlayMusicSteps {
    PlayMusicPage libraryPage;


    @Step
    public void homePage() {
        libraryPage.openAt("https://music.youtube.com/");
    }

    @Step
    public void clickPlayMusic(){
        libraryPage.clickMusic();
    }

    @Step
    public boolean getPalypauseBtn() throws InterruptedException {
        Thread.sleep(10000);
        return libraryPage.isBtnPlayPauseAppears();
    }



}
