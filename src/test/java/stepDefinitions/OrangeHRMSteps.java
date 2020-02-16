package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRMSteps {

    WebDriver driver;

    @Given("Open the browser and load the URL")
    public void open_the_browser_and_load_the_URL() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();  //Launch browser and URL
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
    }

    @When("^URL opens provide Username and Password$")
    public void url_opens_provide_Username_and_Password() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
    }

    @When("^Click on the Login button$")
    public void click_on_the_Login_button() throws Throwable {
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        Thread.sleep(1000);
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Then("^validate the logo presence post login$")
    public void validate_the_logo_presence_post_login() throws Throwable {
       boolean logo_presence = driver.findElement(By.xpath("//div[@id='branding']//a//img")).isDisplayed();
       Assert.assertEquals(true, logo_presence);
    }

    @Then("^close browser$")
    public void close_browser() throws Throwable {

        //driver.quit();
    }


}
