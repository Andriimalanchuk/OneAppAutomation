package page.activity;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class PrimaryActivity extends BasePage {

    private static final String SCREEN_NAME = "DashboardScreen";

    public PrimaryActivity(AndroidDriver driver) {

        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Dashboard']")
    public WebElement dashboardButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Devices']")
    public WebElement devicesButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Automations']")
    public WebElement automationsButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='Delete']")
    public WebElement popUpDeleteButton;
}