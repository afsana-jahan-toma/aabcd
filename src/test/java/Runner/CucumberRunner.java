package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/XYZ.Feature"},
        glue = {"Stepdefination"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports.html"
        })
@Test
public class CucumberRunner extends AbstractTestNGCucumberTests {

}