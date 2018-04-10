package page.fragment.devices.scenes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.Logger;

public class SceneInformationFragmentPage extends BasePage {
    private static final String SCREEN_NAME = "SceneInformationScreen";

    public SceneInformationFragmentPage(AppiumDriver driver) {
        super(driver);
        loadPage();
    }
    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }
    @AndroidFindBy(id = "android:id/button2")
    public WebElement editButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Add scene']")
    public WebElement addSceneButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/mode_name_new")
    public WebElement createdScene;

    public void verifyAndClickEditButton() {
        Logger.logStep("Verify Edit Button is displayed");
        editButton.isDisplayed();
        Logger.logStep("Click on Edit Button");
        editButton.click();
    }
}
