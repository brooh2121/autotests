package com.dismas.autotests;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Before;

import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@CucumberContextConfiguration
public class AutotestsApplicationTest {

    @Before
    @DisplayName("Подключаем драйвер Chrome")
    public void firstTest() {
        System.setProperty("selenide.browser", "Chrome");
        System.out.println("Полетели тесты");
    }
}
