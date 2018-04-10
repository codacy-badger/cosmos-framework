package com.cosmos.webdriver.manager.impl;

import java.net.URL;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.cosmos.webdriver.config.IConfiguration;
import com.cosmos.webdriver.manager.BrowsersEnum;
import com.cosmos.webdriver.manager.IDriverManager;
import com.cosmos.webdriver.manager.IDriverServiceManager;

public abstract class AbstractRemoteDriverManager extends DefaultRemotingDriverManager {

	public AbstractRemoteDriverManager(IConfiguration config, IDriverServiceManager driverServiceManager)
	{
		super(config, driverServiceManager);		
	}
		
	/*protected WebDriver driver;
	protected URL hubUrl;
	protected BrowsersEnum browser;	
	private final Map<BrowsersEnum, Supplier<Capabilities>> lamCapsMap = new EnumMap<>(BrowsersEnum.class);
	
	public AbstractRemoteDriverManager(IConfiguration config, IDriverServiceManager driverServiceManager)
	{
		this.hubUrl = config;
		this.browser = driverServiceManager;
		lamCapsMap.put(BrowsersEnum.CHROME, ChromeOptions::new);
		lamCapsMap.put(BrowsersEnum.IE, InternetExplorerOptions::new);
	}
	
	@Override
	public WebDriver getDriver()
	{
		if (null == driver) {			
			Capabilities caps = Optional.ofNullable(lamCapsMap.get(browser))
								.orElseThrow(() -> new RuntimeException("Browser " + browser + " is not supported for remote execution."))
								.get()
								;
			driver = new RemoteWebDriver(hubUrl, caps);
        }
		return driver;
	}

	@Override
	public void quitDriver()
	{
		if (null != driver) {
            driver.quit();
            driver = null;
        }	
	}

	@Override
	public void quit()
	{
		quitDriver();		
	}*/

}