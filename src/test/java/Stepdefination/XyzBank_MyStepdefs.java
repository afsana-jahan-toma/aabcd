package Stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class XyzBank_MyStepdefs {
    WebDriver driver;
    @Given("add customer page")
    public void addCustomerPage() throws InterruptedException {
        ChromeOptions options = new ChromeOptions(); //
        Map<String, Object> prefs = new HashMap<>();
        Map<java.lang.String, Map<java.lang.String, Integer>> profile = new HashMap<>();
        Map<String, Integer> contentSettings;
        contentSettings = new HashMap<>();
        contentSettings.put("notifications", 2);
        contentSettings.put("geolocation", 2);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust");
        driver.manage().window().maximize();
        //return driver;
        Thread.sleep(2000);

    }

    @When("Customer input {string} and {string} and {string}")
    public void customerInputFirstNameAndLastNameAndPostCode(String FirstName,String LastName,String PostCode) {

        driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys(FirstName);
        driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys(LastName);
        driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys(PostCode);
    }

    @And("Click the add customer button")
    public void clickTheAddCustomerButton() {
        driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();

    }

    @Then("go to the nest page")
    public void goToTheNestPage() {
    }
}
