package uitests.Validators;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitests.PageObjects.BasePageObject;

import java.util.ArrayList;

import static uitests.Locators.BannersLocators.*;
import static uitests.Locators.HomePageLocator.*;

public class HomePageValidator extends BasePageObject {
    public final String expectedHomePageTitle = "Фонд капитального ремонта г. Москвы";
    public final String expectedServiceTitle = "Получить сведения Фонда капитального ремонта";
    public final String expectedRulesTitle = "Правила поведения сотрудников в Фонде капитального ремонта Москвы на период коронавирусной инфекции";
    public final String expectedSuggestionsTitle = "Предложения собственникам о проведении капитального ремонта общего имущества в многоквартирных домах города Москвы";
    public final String expectedProgramTitle = "Региональная программа капитального ремонта | Главная";
    public final String expectedLawsTitle = "Нормативные правовые акты города Москвы";
    public final String expectedPlanTitle = "Краткосрочный план реализации в 2021, 2022 и 2023 годы";

    public final String expectedDigitalAccesTitle = "Цифровая доступность";
    public final String expectedSiteNavigationTitle = "Карта сайта";
    public final String expectedSitesOfMoscowTitle = "Сайты Москвы";
    public final String expectedSitesOfRussiaTitle = "Сайты России";

    public HomePageValidator(WebDriver driver, WebDriverWait waiter) {
        super(driver, waiter);
    }

    public HomePageValidator validateLogoRedirect(){
        waiter.until(ExpectedConditions.elementToBeClickable(logoXpath));
        String actualPageTitle = driver.getTitle();
        Assertions.assertEquals(actualPageTitle, expectedHomePageTitle);
        return this;
    }

    public HomePageValidator validateServiceBanner(){
        String parentTab = driver.getWindowHandle();
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles()) ;
        if(parentTab.equals(tab2.get(0))){
            driver.switchTo().window(tab2.get(1));
        }
        else{
            driver.switchTo().window(tab2.get(0));
        }
        String actualPageTitle = driver.getTitle();
        Assertions.assertEquals(expectedServiceTitle, actualPageTitle);
        return this;
    }

    public HomePageValidator validateRulesBanner(){
        String parentTab = driver.getWindowHandle();
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles()) ;
        if(parentTab.equals(tab2.get(0))){
            driver.switchTo().window(tab2.get(1));
        }
        else{
            driver.switchTo().window(tab2.get(0));
        }
        String actualPageTitle = driver.getTitle();
        Assertions.assertEquals(expectedRulesTitle, actualPageTitle);
        return this;
    }
    public HomePageValidator validateSuggestionsBanner(){
        String parentTab = driver.getWindowHandle();
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles()) ;
        if(parentTab.equals(tab2.get(0))){
            driver.switchTo().window(tab2.get(1));
        }
        else{
            driver.switchTo().window(tab2.get(0));
        }
        String actualPageTitle = driver.getTitle();
        Assertions.assertEquals(expectedSuggestionsTitle, actualPageTitle);
        return this;
    }
    public HomePageValidator validateProgramBanner(){
        String parentTab = driver.getWindowHandle();
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles()) ;
        if(parentTab.equals(tab2.get(0))){
            driver.switchTo().window(tab2.get(1));
        }
        else{
            driver.switchTo().window(tab2.get(0));
        }
        String actualPageTitle = driver.getTitle();
        Assertions.assertEquals(expectedProgramTitle, actualPageTitle);
        return this;
    }
    public HomePageValidator validateLawsBanner(){
        String parentTab = driver.getWindowHandle();
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles()) ;
        if(parentTab.equals(tab2.get(0))){
            driver.switchTo().window(tab2.get(1));
        }
        else{
            driver.switchTo().window(tab2.get(0));
        }
        String actualPageTitle = driver.getTitle();
        Assertions.assertEquals(expectedLawsTitle, actualPageTitle);
        return this;
    }
    public HomePageValidator validatePlanBanner(){
        String parentTab = driver.getWindowHandle();
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles()) ;
        if(parentTab.equals(tab2.get(0))){
            driver.switchTo().window(tab2.get(1));
        }
        else{
            driver.switchTo().window(tab2.get(0));
        }
        String actualPageTitle = driver.getTitle();
        Assertions.assertEquals(expectedPlanTitle, actualPageTitle);
        return this;
    }

    public void validateDigitalAccess(){
        String parentTab = driver.getWindowHandle();
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles()) ;
        if(parentTab.equals(tab2.get(0))){
            driver.switchTo().window(tab2.get(1));
        }
        else{
            driver.switchTo().window(tab2.get(0));
        }
        String actualPageTitle = driver.getTitle();
        Assertions.assertEquals(expectedDigitalAccesTitle, actualPageTitle);
    }
    public void validateSiteNaigation(){
        waiter.until(ExpectedConditions.elementToBeClickable(siteNavigationTitleXpath));
        String actualTitle = driver.findElement(siteNavigationTitleXpath).getText();
        Assertions.assertEquals(expectedSiteNavigationTitle, actualTitle);
    }
    public void validateSitesOfMoscow(){
        waiter.until(ExpectedConditions.elementToBeClickable(sitesOfMoscowTitleXpath));
        String actualTitle = driver.findElement(sitesOfMoscowTitleXpath).getText();
        Assertions.assertEquals(expectedSitesOfMoscowTitle, actualTitle);
    }
    public void validateSitesOfRussia(){
        waiter.until(ExpectedConditions.elementToBeClickable(sitesOfRussiaTitleXpath));
        String actualTitle = driver.findElement(sitesOfRussiaTitleXpath).getText();
        Assertions.assertEquals(expectedSitesOfRussiaTitle, actualTitle);
    }

}
