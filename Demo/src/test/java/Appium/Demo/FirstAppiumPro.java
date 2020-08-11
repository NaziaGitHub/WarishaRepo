package Appium.Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstAppiumPro {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"TKQ8WOGIEYQ4TKRC");
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\ACCER\\Desktop\\Apk_Sample\\Sales_Deals_Discounts_Buy_Save_with_eBay (1).apk");
		AndroidDriver<AndroidElement> androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	}

}
