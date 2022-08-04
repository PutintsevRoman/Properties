package properties;

import config.WebDriverProvider;
import org.junit.jupiter.api.BeforeEach;


public class TestBase {

    private WebDriverProvider driver = new WebDriverProvider();

    @BeforeEach
    public void startDriver() {
        driver.configure();
    }


}
