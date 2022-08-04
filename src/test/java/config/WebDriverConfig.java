package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${host}.properties")
public interface WebDriverConfig extends Config {

    @Config.Key("baseUrl")
    @Config.DefaultValue("https://google.com")
    String getBaseUrl();

    @Config.Key("browser")
    @Config.DefaultValue("FIREFOX")
    Browser getBrowser();

    @Key("browserVersion")
    @DefaultValue("97.0")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("isRemote")
    @DefaultValue("true")
    boolean remote();

    @Key("remoteUrl")
    String getRemoteUrl();
}
