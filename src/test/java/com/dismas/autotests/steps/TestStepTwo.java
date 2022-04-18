package com.dismas.autotests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.*;
import org.junit.Assert;


import static com.codeborne.selenide.Selenide.open;

@Epic("Второй набор тестов")
@Feature("Tests for stepTwo.feature")
@Severity(value = SeverityLevel.MINOR)
public class TestStepTwo {

    String strFirst = "Hello";
    String strSecond = "World";

    public String concatTwoStrings(String strOne, String strTwo) {
        String result = strOne + ", " + strTwo;
        return result;
    }

    @When("^call test3$")
    @Step("Открываем yahoo")
    @Description(value = "Вызываем selenide для перехода на yahoo")
    //@DisplayName("Открываем yahoo")
    public void openYahoo(){
        open("https://www.yahoo.com/");
    }

    @Then("^call test4$")
    @Step("Открываем yaplakal")
    @Description(value = "Вызываем selenide для перехода на yaplakal")
    //@DisplayName("Открываем yaplakal")
    public void openYaplakal(){
        open("https://www.yaplakal.com/");
    }

    @And("^call test5$")
    @Step("Concat two strings")
    @Description(value = "Складываем два слова")
    @Attachment
    public boolean checkString() {
        return concatTwoStrings(strFirst,strSecond).getClass().equals(String.class);
    }

    @And("^call test6$")
    @Step("Assert false")
    @Description(value = "Бросаем ошибку сравнения чисел")
    @Attachment
    public void thowfalse() {
        Assert.assertEquals(1,2);
    }
}
