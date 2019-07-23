package pack1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\A08019dirP_C2b.02.13\\workspace\\Cucumber_CaseStudy1\\src\\resources\\test\\casestudy1.feature",
plugin={"html:target\\Reports"})
public class TestRunner1 {
 
}
