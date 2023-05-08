import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/mindcurv/featurefiles"
        , glue = {"com.mindcurv.stepdefinitions","com.mindcurv.hooks" },tags = "@Smoke", dryRun = false , monochrome = true , plugin = { "pretty", "html:target/cucumber-reports" }
)
public class Runner {


}
