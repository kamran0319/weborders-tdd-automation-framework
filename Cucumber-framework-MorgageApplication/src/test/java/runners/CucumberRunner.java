package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions (
        tags = " @DB" ,
        features = "src/test/resources", // the path where feature files are located
        glue = "stepDefinitions", // the path where step definitions are located
        plugin = {
                "pretty", //for more detailed console output
                "html:target/cucumber-report/report.html" // generates a built in html report
        },
        publish = true //generates a cloud based report
//          ,stepNotifications = true // displays detailed step results
//          ,dryRun = true // to generate step definitions quickly without running the code

)

@RunWith(Cucumber.class)
public class CucumberRunner {
}
