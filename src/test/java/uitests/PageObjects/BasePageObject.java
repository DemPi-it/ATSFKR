package uitests.PageObjects;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@RequiredArgsConstructor
public class BasePageObject{
    protected final WebDriver driver;
    protected final WebDriverWait waiter;
}
