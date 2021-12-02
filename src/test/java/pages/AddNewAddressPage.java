package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressPage extends BasePage{
    public AddNewAddressPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"user_info_acc\"]")
    private WebElement menuButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/ul/li[1]/a")
    private WebElement accountsButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div/ul/li[3]/a")
    private WebElement myAddressesButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/a/span")
    private WebElement addNewAddressButton;

    @FindBy(xpath = "//*[@id=\"address1\"]")
    private WebElement addressInput;

    @FindBy(xpath = "//*[@id=\"postcode\"]")
    private WebElement postCodeInput;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement cityInput;

    @FindBy(xpath = "//*[@id=\"phone_mobile\"]")
    private WebElement mobileInput;

    @FindBy(xpath = "//*[@id=\"alias\"]")
    private WebElement addressReferenceInput;

    @FindBy(xpath = "//*[@id=\"submitAddress\"]/span")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/p[2]")
    private WebElement checkingPhraseAddresses;

    public void goToMenu(){
        menuButton.click();
    }
    public void goToAccounts(){
        accountsButton.click();
    }
    public void clickAddresses(){
        myAddressesButton.click();
    }
    public void addNewAddress(){
        addNewAddressButton.click();
    }
    public void setClientInfo(String address, String postcode, String city, String mobile, String addressReference){
        addressInput.clear();
        addressInput.sendKeys(address);

        postCodeInput.clear();
        postCodeInput.sendKeys(postcode);

        cityInput.clear();
        cityInput.sendKeys(city);

        mobileInput.clear();
        mobileInput.sendKeys(mobile);

        addressReferenceInput.clear();
        addressReferenceInput.sendKeys(addressReference);

        saveButton.click();
    }
    public String yourAddressesInfo(){
        return checkingPhraseAddresses.getText();
    }
}

