package com.dismas.autotests.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import static com.codeborne.selenide.Selenide.open;

public class TestStepOne {

    @Autowired
    Environment environment;

    @When("^call test1$")
    public void openGoogle(){
        open(environment.getProperty("browser.url"));
    }

    @Then("^call test2$")
    public void openYandex(){
        open("https://ya.ru/");
    }
}
