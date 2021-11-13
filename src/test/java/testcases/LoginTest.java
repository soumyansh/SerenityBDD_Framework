package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.HomePageSteps;


@RunWith(SerenityRunner.class)
public class LoginTest {

	@Managed
	WebDriver driver;

	@Steps
	HomePageSteps steps;
	
	@Title("Executing Login Test 1")
	@Test
	public void loginTest1() {
		steps.doLogin();
	}
	@Title("Executing Login Test 2")
	@Test
	public void loginTest2() {
		steps.doLogin();
	}
	}
