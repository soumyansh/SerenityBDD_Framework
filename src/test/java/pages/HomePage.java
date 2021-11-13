package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

	public void navigate() {
		open();

	}

	public void enterUsername() {
		find(By.id("txtUsername")).sendKeys("Admin");
	}

	public void enterPassword() {
		find(By.id("txtPassword")).sendKeys("admin123");
	}

	public void loginButton() {
		find(By.id("btnLogin")).click();
	}
}
