package com.dismas.autotests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import static com.codeborne.selenide.Selenide.*;

@SpringBootApplication
public class AutotestsApplication implements CommandLineRunner {

	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(AutotestsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.setProperty("selenide.browser", "Chrome");
		open(environment.getProperty("browser.url"));
		Thread.sleep(3000);
	}
}
