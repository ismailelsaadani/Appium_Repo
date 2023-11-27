package Automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class appium {
    @Test
    public  void OpenWebApp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"TestMobile");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.claro.eg.MainActivity");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.claro.eg");

        AndroidDriver  driver = new AndroidDriver (new URL(" http://127.0.0.1:4723/wd/hub"), caps);

    }

}

