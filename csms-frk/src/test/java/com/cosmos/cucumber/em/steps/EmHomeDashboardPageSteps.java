package com.cosmos.cucumber.em.steps;

import com.cosmos.cucumber.context.ITestUiContext;
import com.cosmos.pageobject.em.manager.PageObjectManager;

import cucumber.api.java.en.Then;

public class EmHomeDashboardPageSteps extends EmStepsBase {

	private final ITestUiContext<PageObjectManager> uiContext;
	private final PageObjectManager pageObjectManager;

	public EmHomeDashboardPageSteps (ITestUiContext<PageObjectManager> uiContext)
	{
		this.uiContext = uiContext;
		this.pageObjectManager = uiContext.getPageObjectManager();
	}	
	
	@Then("^Dashboard page shows$")
	public void dashboard_page_shows() throws Exception {
		System.out.println(pageObjectManager.getHomeDashboard().isAt());
	}
	
	@Then("^user logs off from Dashboard$")
	public void user_logs_off_from_Dashboard() throws Exception {
		pageObjectManager.getHomeDashboard().logout();
	}
	
}
