package com.dismas.autotests.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import static com.codeborne.selenide.Selenide.open;

@Epic("Первый набор тестов")
@Feature("Tests for stepOne.feature")
public class TestStepOne {

    @Autowired
    Environment environment;

    @When("^call test1$")
    @Step("Открываем Chrome")
    @Owner(value = "Ответственный за тест - Dismas")
    //@DisplayName("Открываем { browser.url }")
    public void openGoogle(){
        open(environment.getProperty("browser.url"));
    }

    @Then("^call test2$")
    @Step("Открываем ya.ru")
    //@DisplayName("Открываем ya.ru")
    public void openYandex(){
        open("https://ya.ru/");
    }
}
