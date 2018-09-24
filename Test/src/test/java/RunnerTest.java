import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/E2E.feature",
        plugin = {"pretty", "html:output/report", "json:output/report.json"}
)
public class RunnerTest { }
