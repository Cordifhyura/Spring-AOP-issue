package stepdefs;

import base.SpringContextConfiguration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {SpringContextConfiguration.class})
public class Hooks {
    @Autowired private WebDriver driver;

    @Before
    public void beforeScenario(Scenario scenario){
        System.out.println("Starting - " + scenario.getName());
        System.out.println(driver);
    }

    @After
    public void afterScenario(Scenario scenario){
        driver.quit();
    }
}
