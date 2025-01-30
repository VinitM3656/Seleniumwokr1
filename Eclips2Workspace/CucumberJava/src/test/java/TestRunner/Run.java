package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(
    features = "D://Eclips//Eclips2Workspace//CucumberJava//Features//LoginFeature.feature",
    glue = "stepdefinition",
    dryRun = true,
    monochrome = true,
    plugin = {"pretty"}
)
public class Run {
}
