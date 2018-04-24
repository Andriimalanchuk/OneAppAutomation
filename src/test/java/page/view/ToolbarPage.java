package page.view;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.BasePage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

public class ToolbarPage extends BasePage {

    private static final String SCREEN_NAME = "DashboardScreen";

    public ToolbarPage(AndroidDriver driver) {
        super(driver);
        loadPage();
    }

    @Override
    public String getScreenName() {
        return SCREEN_NAME;
    }

    @AndroidFindBy(accessibility = "Navigate up")
    public WebElement backArrow;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_action_button")
    public WebElement deleteButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/save_menu")
    public WebElement saveButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/cancel_menu")
    public WebElement cancelButton;

    @AndroidFindBy(id = "com.samsung.android.oneconnect:id/rule_fragment_action_button")
    public WebElement addButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Done']")
    public WebElement doneButton;

    public void verifyAndClickBackButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Navigate Back Button is displayed");
        Logger.logStep("Verify Back Button is displayed");
        backArrow.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Back Button");
        Logger.logStep("Click on Back Button");
        backArrow.click();
    }

    public void verifyAndClickDeleteButton() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Delete Button is displayed");
        Logger.logStep("Verify Delete Button is displayed");
        deleteButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Delete Button");
        Logger.logStep("Click on Delete Button");
        deleteButton.click();
        Thread.sleep(3000L);
    }

    public void verifyAndClickSaveButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Save Button is displayed");
        Logger.logStep("Verify Save Button is displayed");
        saveButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Save Button");
        Logger.logStep("Click on Save Button");
        saveButton.click();
    }

    public void verifyAndClickCancelButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Cancel Button is displayed");
        Logger.logStep("Verify Cancel Button is displayed");
        cancelButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Cancel Button");
        Logger.logStep("Click on Cancel Button");
        cancelButton.click();
    }

    public void verifyAndClickAddButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Add Button is displayed");
        Logger.logStep("Verify Add Button is displayed");
        addButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Add Button");
        Logger.logStep("Click on Add Button");
        addButton.click();
    }

    public void verifyAndClickDoneButton() {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify Done Button is displayed");
        Logger.logStep("Verify Done Button is displayed");
        doneButton.isDisplayed();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Done Button");
        Logger.logStep("Click on Done Button");
        doneButton.click();
    }
}
