package base.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import utilities.aspects.TakeFullScrShot;

import javax.annotation.PostConstruct;

@Component
@Scope("cucumber-glue")
public abstract class BasePage {
    @Autowired protected WebDriver driver;

    @PostConstruct
    private void postConstruct() {
        PageFactory.initElements(driver, this);
    }

    @TakeFullScrShot
    public WebDriver getDriver() {
        return driver;
    }

}
