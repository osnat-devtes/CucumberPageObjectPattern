package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{

    public LogInPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"login_form\"]/h3")
    private WebElement alreadyRegisteredInfo;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailLoginInput;

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    private WebElement passwordLoginInput;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    private WebElement signedInButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    private WebElement loggedInInfo;

    public void signIn() {
        signInButton.click();
    }

    public String registeredPageInfo(){
        return alreadyRegisteredInfo.getText();
    }

    public void userLogIn(String emailLogin, String passwordLogin){
        emailLoginInput.clear();
        emailLoginInput.sendKeys(emailLogin);

        passwordLoginInput.clear();
        passwordLoginInput.sendKeys(passwordLogin);

        signedInButton.click();
    }
    public String loginPageInfo(){
        return loggedInInfo.getText();
    }

}
