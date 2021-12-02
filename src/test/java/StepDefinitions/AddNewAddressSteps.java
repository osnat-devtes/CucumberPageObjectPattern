package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddNewAddressPage;
import pages.LogInPage;

import java.util.concurrent.TimeUnit;

public class AddNewAddressSteps {
    public WebDriver driver;

    @Given("an open browser with HotelTestlabCoderslab")
    public void anOpenBrowserWithHttpsHotelTestlabCoderslabPl() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://hotel-testlab.coderslab.pl/");
    }

    @When("^the form is filled in with an email (.*) and a password (.*)$")
    public void fillingInTheFormWithLoginAndPassword(String emailLogin, String passwordLogin) {
        LogInPage userLogin = new LogInPage(driver);
        userLogin.signIn();
        Assert.assertEquals("ALREADY REGISTERED?", userLogin.registeredPageInfo());
        userLogin.userLogIn(emailLogin, passwordLogin);
        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", userLogin.loginPageInfo());
    }

    @Then("^the form is filled in with an address (.*) and a postcode (.*) and a city (.*) and a mobile number (.*) and an address name (.*)$")
    public void FillingTheFormWithAddressData(String address, String postcode, String city, String mobile, String addressReference) {
        AddNewAddressPage addAddress = new AddNewAddressPage(driver);

        addAddress.goToMenu();
        addAddress.clickAddresses();
        addAddress.addNewAddress();
        addAddress.setClientInfo(address, postcode, city, mobile, addressReference);
        Assert.assertEquals("Your addresses are listed below.", addAddress.yourAddressesInfo());
    }
}

