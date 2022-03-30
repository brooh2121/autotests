package com.dismas.autotests;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/"/*, glue = {"src/test/java/com/dismas/autotests/steps/" , "src/test/java/com/dismas/autotests/hooks/"}*/
)
public class CucumberTest {
}
