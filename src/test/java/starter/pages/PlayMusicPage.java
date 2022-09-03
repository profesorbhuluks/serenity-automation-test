package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class PlayMusicPage extends PageObject {

    @FindBy(xpath = "//ytmusic-responsive-list-item-renderer[1]//yt-icon[@class='icon style-scope ytmusic-play-button-renderer']")
    private WebElementFacade playMusic;

    @FindBy(xpath = "//tp-yt-paper-icon-button[@id='play-pause-button']/tp-yt-iron-icon[@id='icon']")
    private WebElementFacade playPauseBtn;

    public void clickMusic() {
        playMusic.click();
    }

    public boolean isBtnPlayPauseAppears() throws InterruptedException {
        Thread.sleep(15000);
        return playPauseBtn.isDisplayed();
    }



}
