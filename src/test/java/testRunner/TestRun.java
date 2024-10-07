package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//features/login.feature"},// to run this particular feature file
                             //{".//feature"}, // to run all feature files present inside the folder
                             //{".//feature/login.feature",".feature/register.feature"},//to run two feature file
                             //  {"@target/rerun.txt"},//to run failed TCs
                               glue="stepDefinitions")














public class TestRun {



}
