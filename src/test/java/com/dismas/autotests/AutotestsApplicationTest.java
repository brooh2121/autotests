package com.dismas.autotests;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@CucumberContextConfiguration
public class AutotestsApplicationTest {

    @Before
    public void firstTest() {
        System.setProperty("selenide.browser", "Chrome");
        System.out.println("Полетели тесты");
    }

    @Test
    public void dummyTest(){
        System.out.println("Драсте");
        closeWebDriver();
    }

}
