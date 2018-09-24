package framework;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Hooks {

    private final static Logger logger = Logger.getLogger("Hooks");

    public static Logger log() {
        return logger;
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        try {
            FileHandler fileHandler = new FileHandler("output/log.txt");
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario){
        if(scenario.getStatus().equals("failed")){

        }
        Browser.quit();

    }

}
