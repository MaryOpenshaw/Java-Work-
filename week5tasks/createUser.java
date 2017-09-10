package AT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createUser {

	@FindBy(name = "username")
	private WebElement usernameInput;

	@FindBy(name = "password")
	private WebElement passwordInput;

	@FindBy(name = "FormsButton2")
	private WebElement saveButton;

	public void enterUserName(String username) {
		usernameInput.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	public void clickButton() {
		saveButton.click();
	}

}
