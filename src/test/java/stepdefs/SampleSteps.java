package stepdefs;

import base.PO.HoloPage;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class SampleSteps {
    @Autowired
    private HoloPage holoPage;

    @Given("I'm on holo homepage")
    public void iMOnThePage() {
        System.out.println(holoPage.getClass().getName());
        System.out.println(holoPage.getDriver());
    }
}
