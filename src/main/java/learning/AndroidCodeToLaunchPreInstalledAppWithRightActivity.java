package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class AndroidCodeToLaunchPreInstalledAppWithRightActivity {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "android");
        dc.setCapability("appium:automationName", "UiAutomator2");
        dc.setCapability("appium:app", System.getProperty("user.dir") + File.separator + "apks" + File.separator + "Amazon.apk");
        dc.setCapability("appium:appPackage", "com.amazon.mShop.android.shopping");
        dc.setCapability("appium:appActivity", "com.amazon.mShop.home.HomeActivity");
        AppiumDriver driver = new AppiumDriver(new URI("http://127.0.0.1:4723/").toURL(), dc);
        driver.quit();
    }
}
