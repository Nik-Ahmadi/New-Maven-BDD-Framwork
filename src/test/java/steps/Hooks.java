package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.SeleniumUtility;

public class Hooks extends SeleniumUtility {
  @Before
    public void open_browser() {
        openBrowser();
    }
    @After
    public void close_browser() { closeBrowser();}
}
