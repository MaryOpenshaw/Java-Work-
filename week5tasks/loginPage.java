package AT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

	@FindBy(name = "username")
	private WebElement usernameInput1;

	@FindBy(name = "password")
	private WebElement passwordInput1;

	@FindBy(name = "FormsButton2")
	private WebElement saveButton;

	public void enterName(String username1) {
		usernameInput1.sendKeys(username1);
	}

	public void enterPass(String password1) {
		passwordInput1.sendKeys(password1);
	}

	public void clickButton1() {
		saveButton.click();
	}

}
