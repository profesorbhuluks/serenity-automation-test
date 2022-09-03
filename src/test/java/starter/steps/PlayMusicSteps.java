package starter.steps;


import net.thucydides.core.annotations.Step;
import starter.pages.LibraryPage;

public class LibrarySteps {
    LibraryPage libraryPage;


    @Step
    public void homePage() {
        libraryPage.openAt("https://music.youtube.com/library/playlists");
    }

    @Step
    public void clickNewPlaylist(){
        libraryPage.clicNewPlaylist();
    }

    @Step
    public void inputPlaylistTitle(String title){
        libraryPage.inputTitle(title);
    }

    @Step
    public void inputPlaylistDescription(String title){
        libraryPage.inputDescription(title);
    }

    @Step
    public void clickCreatePalaylistBtn(){
        libraryPage.clickCreateBtn();
    }

    @Step
    public String getTitle(){
        return libraryPage.getTitle();
    }



}
