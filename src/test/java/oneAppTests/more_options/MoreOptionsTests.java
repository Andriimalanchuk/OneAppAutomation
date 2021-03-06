package oneAppTests.more_options;

import oneAppTests.BaseAppiumTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.dashboard.HelpFragmentPage;
import page.fragment.dashboard.MoreOptionsFragmentPage;
import page.fragment.dashboard.SmartthingsSettingsFragmentPage;
import page.view.ToolbarPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;

@Test
public class MoreOptionsTests extends BaseAppiumTest {

    private static final String TEST_NAME = MoreOptionsTests.class.getName();

    private DashboardFragmentPage dashboardFragmentPage;
    private PrimaryActivity primaryActivity;
    private ToolbarPage toolbarPage;
    private MoreOptionsFragmentPage moreOptionsFragmentPage;
    private SmartthingsSettingsFragmentPage smartthingsSettingsFragmentPage;
    private HelpFragmentPage helpFragmentPage;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        toolbarPage = new ToolbarPage(driver);
        helpFragmentPage = new HelpFragmentPage(driver);
        moreOptionsFragmentPage = new MoreOptionsFragmentPage(driver);
        smartthingsSettingsFragmentPage = new SmartthingsSettingsFragmentPage(driver);
    }

    @Test(priority = 1)
    public void helpTesting() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("More Options Menu: Help Option");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Help Option - Start");

        primaryActivity.getDashboardButton();
        dashboardFragmentPage.verifyAndClickMoreOptionsButton();
        moreOptionsFragmentPage.verifyAndClickHelpButton();
        helpFragmentPage.verifyHelpMyQuestionIsDisplayed();
        helpFragmentPage.verifyFAQIsDisplayed();
        helpFragmentPage.verifyEmailCustomerServiceIsDisplayed();
        helpFragmentPage.verifyCallCustomerServiceIsDisplayed();
        helpFragmentPage.verifyReportProblemIsDisplayed();
        toolbarPage.verifyAndClickBackButton();
        dashboardFragmentPage.verifySmartthingsLogoIsPresent();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Help Option - End");
    }

    @Test(priority = 2)
    public void settingsTesting() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("More Options Menu: Settings Option");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Setting Option - Start");

        primaryActivity.getDashboardButton();
        dashboardFragmentPage.verifyAndClickMoreOptionsButton();
        moreOptionsFragmentPage.verifyAndClickSettingssButton();
        //smartthingsSettingsFragmentPage.getSmartthingsSettingsFragmentPage();
        smartthingsSettingsFragmentPage.verifySamsungAccountTextIsDisplayed();
        toolbarPage.verifyAndClickBackButton();
        dashboardFragmentPage.verifySmartthingsLogoIsPresent();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Setting Option - End");
    }

    @Test(priority = 3)
    public void wiFiAndBluetoothVerificationTest() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("More Options Menu: Settings Option");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Setting Option - Start");

        primaryActivity.getDashboardButton();
        dashboardFragmentPage.verifyAndClickMoreOptionsButton();
        moreOptionsFragmentPage.verifyAndClickSettingssButton();
        //smartthingsSettingsFragmentPage.getSmartthingsSettingsFragmentPage();
        smartthingsSettingsFragmentPage.verifyWifiAndBluetoothAutoOnAndToggable();
        toolbarPage.verifyAndClickBackButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Setting Option - End");
    }

    @Test(priority = 4)
    public void useLocationInformationVerificationTest() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("More Options Menu: Settings Option");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Setting Option - Start");

        primaryActivity.getDashboardButton();
        dashboardFragmentPage.verifyAndClickMoreOptionsButton();
        moreOptionsFragmentPage.verifyAndClickSettingssButton();
        //smartthingsSettingsFragmentPage.getSmartthingsSettingsFragmentPage();
        smartthingsSettingsFragmentPage.verifyUseLocationInformationIsPresentAndToggable();
        toolbarPage.verifyAndClickBackButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Setting Option - End");
    }

    @Test(priority = 5)
    public void autoUpdateControllerVerificationTest() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("More Options Menu: Settings Option");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Setting Option - Start");

        primaryActivity.getDashboardButton();
        dashboardFragmentPage.verifyAndClickMoreOptionsButton();
        moreOptionsFragmentPage.verifyAndClickSettingssButton();
        //smartthingsSettingsFragmentPage.getSmartthingsSettingsFragmentPage();
        smartthingsSettingsFragmentPage.verifyAutoUpdateController();
        toolbarPage.verifyAndClickBackButton();
        toolbarPage.verifyAndClickBackButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Setting Option - End");
    }
}
