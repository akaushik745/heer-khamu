package net.serenitybdd.cucumber.features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
			"src/test/resources/net/serenitybdd/cucumber/features/PresentationManager.feature"
		}, plugin = { "html:target/html",
				"json:target_json/cucumber.json" })

public class Batch1TestSuite {

}
