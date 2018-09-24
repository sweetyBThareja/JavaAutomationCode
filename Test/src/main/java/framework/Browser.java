package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static framework.Config.getBrowser;

public class Browser {
    private static WebDriver driver;

    private static void start() {
        try {

            switch (Config.getBrowser().toLowerCase()) {
                case "firefox":
                    break;

                case "ie":
                    break;

                default:
                    System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
                    driver = new ChromeDriver();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void maximize(){
      driver.manage().window().maximize();
    }

    public static boolean isStarted(){
        return driver != null;
    }

    public static WebDriver getDriver(){
        if(!isStarted()){
            start();
            maximize();
        }
        return driver;
    }

    public static void quit(){
        if (isStarted()){
            driver.quit();
            driver = null;
        }
    }

}
