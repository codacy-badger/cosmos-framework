package com.cosmos.webdriver.config;

import java.io.File;
import java.net.URL;

import com.cosmos.webdriver.manager.BrowsersEnum;
import com.cosmos.webdriver.manager.ExecutionTypesEnum;
import com.cosmos.webdriver.manager.StepContextScopesEnum;

public interface IConfiguration {

	BrowsersEnum getBrowser();
	ExecutionTypesEnum getExecutionType();
	URL getRemoteGridHubUrl();
	void setDesiredBrowser(BrowsersEnum browser);
	void setExecutionType(ExecutionTypesEnum executionType);
	void setRemoteGridHubUrl(URL gridHubUrl);
	File getDriverExecutableLocation();
	void setChromeDriverExecutableLocation(File executable);
	URL getAppUnderTestUrl();
	void setAppUnderTestUrl(URL autUrl);
	StepContextScopesEnum getStepsContextScope();
	void setStepsContextScope(StepContextScopesEnum scope);
	
}
