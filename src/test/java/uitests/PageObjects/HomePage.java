package uitests.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePageObject {
    public HomePage(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public HomePage clickBanner(By bannerXpath){
        waiter.until(ExpectedConditions.elementToBeClickable(bannerXpath));
        driver.findElement(bannerXpath).click();
        return this;
    }

    public HomePage clickLogo(By logoXpath){
        waiter.until(ExpectedConditions.elementToBeClickable(logoXpath));
        driver.findElement(logoXpath).click();
        return this;
    }

    public HomePage clickFooterLink(By footerLinkXpath){
        waiter.until(ExpectedConditions.elementToBeClickable(footerLinkXpath));
        driver.findElement(footerLinkXpath).click();
        return this;
    }
}
