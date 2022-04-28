package base.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HoloPage extends BasePage {
    @FindBy(css = "a[href*=\"member\"]#custom-btn")
    public WebElement memberButton;

}
