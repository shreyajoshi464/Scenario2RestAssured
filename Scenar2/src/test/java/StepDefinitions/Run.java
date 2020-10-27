package StepDefinitions;

import io.cucumber.junit.CucumberOptions;

//RUnWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features" , glue={"StepDefinitions"})
public class Run extends Step {

}
