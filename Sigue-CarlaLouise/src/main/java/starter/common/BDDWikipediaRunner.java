package starter.common;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/starter/features"}, glue = {"classpath:starter.wikipedia"})

public class BDDWikipediaRunner {

}
