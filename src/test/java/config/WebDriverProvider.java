package config;


import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.open;


public class WebDriverProvider {

    WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public void configure() {
        Configuration.browser = String.valueOf(webDriverConfig.getBrowser());
        Configuration.browserSize = webDriverConfig.getBrowserSize();
        Configuration.baseUrl = webDriverConfig.getBaseUrl();
        Configuration.browserVersion = webDriverConfig.getBrowserVersion();

        if (webDriverConfig.remote()) {
            Configuration.remote = webDriverConfig.getRemoteUrl();
        }

        open(Configuration.baseUrl);
    }


}
