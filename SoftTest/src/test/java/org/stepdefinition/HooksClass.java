package org.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{
	@Before(order=1)
	private void precondition2() {
		launchBrowser();
		System.out.println("launth the browser");
	}
	@Before(order=2)
	private void precondition1() {
	windowMaximize();
	System.out.println();
		
	}
	@Before(order=3, value="@Sanity")
	private void precondition3() {
		System.out.println("precondition 3");;
		}
	@After(order=10, value="@Smoke")
	private void postcondition2() {
		System.out.println("Take screen shot of scenorios");
	}
	@After(order=4)
	private void postcondition1() {
		System.out.println("Close the entire browser");
		closeEntireBrowser();
	}

}
