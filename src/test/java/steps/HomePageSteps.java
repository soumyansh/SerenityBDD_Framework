package steps;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomePageSteps {
	HomePage home;

	@Step("Performing login")
	public void doLogin() {
		home.navigate();

		home.enterUsername();
		Serenity.takeScreenshot();
		home.enterPassword();
		home.loginButton();

	}
}
