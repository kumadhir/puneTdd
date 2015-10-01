package test.java;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource", 
glue="test.java.background",
format = {"pretty", "html:target/cucumber"},
tags="~@barclays")
public class TestRegression {

}
