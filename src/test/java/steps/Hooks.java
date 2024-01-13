package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.SeleniumUtility;

public class Hooks extends SeleniumUtility {
  @Before
    public void open_browser() {
        openBrowser();
    }

    @After
    public void close_browser() { closeBrowser();}
@AfterStep
  public void takeScreenShotsAfterStep(Scenario scenario){

    byte [] screenShots = tekScreenShots();
    scenario.attach(screenShots ,"image/png","Screenshots");
  }
}


