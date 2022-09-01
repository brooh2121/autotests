package com.dismas.autotests;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.BeforeStep;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import java.io.File;

@SpringBootTest
@CucumberContextConfiguration
public class AutotestsApplicationTest {



    @Autowired
    Environment environment;

    @BeforeStep
    @DisplayName("Подключаем драйвер Chrome")
    public void firstTest() {
        File driverFile = new File (environment.getProperty("webdriver.chrome.path"));
        System.setProperty("webdriver.chrome.driver",driverFile.getAbsolutePath());
        System.setProperty("selenide.browser", "Chrome");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--start-maximized");
        options.addArguments("--headless");
        options.setBinary(environment.getProperty("brawser.bin.path"));
        ChromeDriver driver = new ChromeDriver(options);
        WebDriverRunner.setWebDriver(driver);
        System.out.println("Полетели тесты");
    }
}
