package base.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DriverContext {

    @Bean
    @Scope("cucumber-glue")
    @ConditionalOnProperty(name = "application.browser" , havingValue = "chrome", matchIfMissing = true)
    public WebDriver setChromeDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        return new ChromeDriver(new ChromeOptions());
    }
}
