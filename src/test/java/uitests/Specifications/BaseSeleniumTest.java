package uitests.Specifications;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitests.PageObjects.BasePageObject;
import uitests.PageObjects.HomePage;
import uitests.Validators.HomePageValidator;

import java.time.Duration;

public class BaseSeleniumTest {
    public final static String BaseURL = "https://fond.mos.ru/";
    protected WebDriver driver;
    protected WebDriverWait waiter;
    protected HomePage homePage;
    protected HomePageValidator homePageValidator;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();

    }
    @BeforeEach
    void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        waiter =  new WebDriverWait(driver, Duration.ofSeconds(10));
        BasePageObject basePageObject = new BasePageObject(driver, waiter);
        homePage = new HomePage(driver, waiter);
        homePageValidator = new HomePageValidator(driver, waiter);
        driver.get(BaseURL);
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}
