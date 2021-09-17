package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Feature/login.feature",glue= {"stepDefination"})
//@CucumberOptions(features="Feature/datatable.feature",glue= {"stepDefination"})
//@CucumberOptions(features="Feature/scenariooutline.feature",glue= {"stepDefination"})
//@CucumberOptions(features="Feature/backgrounddemo.feature",glue= {"stepDefination"})
//@CucumberOptions(features="Feature/logout.feature",glue= {"stepDefination"})
//@CucumberOptions(features="Feature/login.feature",glue= {"stepDefination"},tags= {"@invalid"})


//@CucumberOptions(features="Feature",glue= {"stepDefination"},tags= {"@smoke"},plugin= {"pretty"},monochrome=true)
//@CucumberOptions(features="Feature",glue= {"stepDefination"},tags= {"@smoke"},plugin= {"usage"})
//@CucumberOptions(features="Feature",glue= {"stepDefination"},tags= {"@smoke"},plugin= {"pretty","html:target/cucumberhtmlreport"})
//@CucumberOptions(features="Feature",glue= {"stepDefination"},tags= {"@smoke"},plugin= {"pretty","json:jsonreport/cucumberjsonreport"})
@CucumberOptions(features="Feature/login.feature",glue= {"stepDefination"},tags= {"@smoke"},plugin= {"pretty","junit:junitreport/cucumberjunitreport.xml"})
public class TestRunner {
	
}
