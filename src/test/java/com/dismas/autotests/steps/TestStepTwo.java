package com.dismas.autotests.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class TestStepTwo {

    @When("^call test3$")
    public void openYahoo(){
        open("https://www.yahoo.com/");
    }

    @Then("^call test4$")
    public void openYaplakal(){
        open("https://www.yaplakal.com/");
    }
}
