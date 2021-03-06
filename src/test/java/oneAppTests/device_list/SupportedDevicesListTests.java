package oneAppTests.device_list;

import oneAppTests.BaseAppiumTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.activity.PrimaryActivity;
import page.fragment.dashboard.DashboardFragmentPage;
import page.fragment.dashboard.SupportedDevicesFragmentPage;
import page.view.ToolbarPage;
import utility.ExtentReports.ExtentTestManager;
import utility.Logger;
import utility.events.Events;
import utility.events.EventsFactory;

@Test
public class SupportedDevicesListTests extends BaseAppiumTest {

    private static final String TEST_NAME = SupportedDevicesListTests.class.getName();

    private PrimaryActivity primaryActivity;
    private ToolbarPage toolbarPage;
    private DashboardFragmentPage dashboardFragmentPage;
    private SupportedDevicesFragmentPage supportedDevicesFragmentPage;
    private Events events;

    @Override
    public String getTestName() {
        return TEST_NAME;
    }

    @BeforeTest
    public void setUp() {
        primaryActivity = new PrimaryActivity(driver);
        toolbarPage = new ToolbarPage(driver);
        dashboardFragmentPage = new DashboardFragmentPage(driver);
        supportedDevicesFragmentPage = new SupportedDevicesFragmentPage(driver);
        events = EventsFactory.getEvents(driver);
    }

    @Test(priority = 1)
    public void deviceListCatalog() throws InterruptedException {
        ExtentTestManager.getTest().setDescription("Supported Devices Catalog Tests");
        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Supported Devices Catalog - Start");

        primaryActivity.getDashboardButton();
        dashboardFragmentPage.verifyAndClickSupportedDevciesTile();
        supportedDevicesFragmentPage.verifyTVButtonIsPresent();
        supportedDevicesFragmentPage.verifyAVButtonIsPresent();
        supportedDevicesFragmentPage.verifyAirConditionerButtonIsPresent();
        supportedDevicesFragmentPage.verifyWasherButtonIsPresent();
        supportedDevicesFragmentPage.verifyRobotVacuumButtonIsPresent();
        supportedDevicesFragmentPage.verifyRefrigeratorButtonIsPresent();
        supportedDevicesFragmentPage.verifyOvenButtonIsPresent();
        supportedDevicesFragmentPage.verifyRangeButtonIsPresent();
        supportedDevicesFragmentPage.verifyCooktopButtonIsPresent();
        supportedDevicesFragmentPage.verifyWiFiHubButtonIsPresent();
        supportedDevicesFragmentPage.verifyBluRayButtonIsPresent();
        supportedDevicesFragmentPage.verifyHubsButtonIsPresent();
        supportedDevicesFragmentPage.verifyMoistureSensorButtonIsPresent();
        supportedDevicesFragmentPage.verifyMotionSensorButtonIsPresent();
        supportedDevicesFragmentPage.verifyMultiFunctionalSensorButtonIsPresent();
        events.scrollTo("Valve");
        supportedDevicesFragmentPage.verifyOpenClosedSensorButtonIsPresent();
        supportedDevicesFragmentPage.verifyPresenceSensorButtonIsPresent();
        supportedDevicesFragmentPage.verifyADTSecurityDevicesButtonIsPresent();
        supportedDevicesFragmentPage.verifyCameraButtonIsPresent();
        supportedDevicesFragmentPage.verifyDoorbellButtonIsPresent();
        supportedDevicesFragmentPage.verifyLightBulbButtonIsPresent();
        supportedDevicesFragmentPage.verifyLockButtonIsPresent();
        supportedDevicesFragmentPage.verifyOutletButtonIsPresent();
        supportedDevicesFragmentPage.verifySmokeDetectorButtonIsPresent();
        supportedDevicesFragmentPage.verifySirenButtonIsPresent();
        supportedDevicesFragmentPage.verifySpeakerButtonIsPresent();
        supportedDevicesFragmentPage.verifySwitchDimmerButtonIsPresent();
        supportedDevicesFragmentPage.verifyThermostatButtonIsPresent();
        supportedDevicesFragmentPage.verifyValveButtonIsPresent();
        toolbarPage.verifyAndClickBackButton();

        Logger.logAction(" \"" + TEST_NAME + "\"  Test: Supported Devices Catalog - End");
    }
}
