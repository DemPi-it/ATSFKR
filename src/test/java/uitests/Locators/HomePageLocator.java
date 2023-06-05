package uitests.Locators;

import org.openqa.selenium.By;

public class HomePageLocator {
    public final static By logoXpath = By.xpath("/html/body/header/div[2]/div/div/div[1]/a/picture/img");
    public final static By serviceBanner = By.xpath("/html/body/main/section[1]/div/div/div[1]/a/div[1]/picture/img");
    public final static By rulesBanner = By.xpath("/html/body/main/section[1]/div/div/div[2]/a/div[1]/picture/img");
    public final static By suggestionsBanner = By.xpath("/html/body/main/section[1]/div/div/div[4]/a/div[1]/picture/img");
    public final static By programBanner = By.xpath("/html/body/main/section[1]/div/div/div[5]/a/div[1]/picture/img");
    public final static By lawsBanner = By.xpath("/html/body/main/section[1]/div/div/div[6]/a/div[1]/picture/img");
    public final static By planBanner = By.xpath("/html/body/main/section[1]/div/div/div[7]/a/div[1]/picture/img");

    public final static By digitalAccess = By.xpath("//*[@id=\"next_footer\"]/footer/div[1]/div[2]/div/a");
    public final static By siteNavigation = By.xpath("//*[@id=\"next_footer\"]/footer/div[1]/div[2]/div/button[1]");
    public final static By sitesOfMoscow = By.xpath("//*[@id=\"next_footer\"]/footer/div[1]/div[2]/div/button[2]");
    public final static By sitesOfRussia = By.xpath("//*[@id=\"next_footer\"]/footer/div[1]/div[2]/div/button[3]");


    public final static By siteNavigationTitleXpath = By.xpath("/html/body/div[8]/div/div/header/h2");
    public final static By sitesOfMoscowTitleXpath = By.xpath("/html/body/div[6]/div/div/header/h2");
    public final static By sitesOfRussiaTitleXpath = By.xpath("/html/body/div[7]/div/div/header/h2");
}



