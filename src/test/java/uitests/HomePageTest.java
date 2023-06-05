package uitests;

import org.junit.jupiter.api.Test;
import uitests.Specifications.BaseSeleniumTest;

import static uitests.Locators.HomePageLocator.*;

public class HomePageTest extends BaseSeleniumTest {

    @Test // TC001
    public void logoRedirectionTest(){
        homePage.clickLogo(logoXpath);
        homePageValidator.validateLogoRedirect();
    }
    @Test // Начало TC002
    public void serviceBannerTest(){
        homePage.clickBanner(serviceBanner);
        homePageValidator.validateServiceBanner();
    }
    @Test
    public void rulesBannerTest(){
        homePage.clickBanner(rulesBanner);
        homePageValidator.validateRulesBanner();
    }
    @Test
    public void suggestionsBannerTest(){
        homePage.clickBanner(suggestionsBanner);
        homePageValidator.validateSuggestionsBanner();
    }
    @Test
    public void programBannerTest(){
        homePage.clickBanner(programBanner);
        homePageValidator.validateProgramBanner();
    }
    @Test
    public void lawsBannerTest(){
        homePage.clickBanner(lawsBanner);
        homePageValidator.validateLawsBanner();
    }
    @Test // Конец TC002
    public void planBannerTest(){
        homePage.clickBanner(planBanner);
        homePageValidator.validatePlanBanner();
    }

    @Test
    public void digitalAccessTest(){
        homePage.clickFooterLink(digitalAccess);
        homePageValidator.validateDigitalAccess();
    }

    @Test
    public void siteNavigationTest(){
        homePage.clickFooterLink(siteNavigation);
        homePageValidator.validateSiteNaigation();
    }

    @Test
    public void sitesOfMoscowTest(){
        homePage.clickFooterLink(sitesOfMoscow);
        homePageValidator.validateSitesOfMoscow();
    }

    @Test
    public void sitesOfRussiaTest(){
        homePage.clickFooterLink(sitesOfRussia);
        homePageValidator.validateSitesOfRussia();
    }
}
