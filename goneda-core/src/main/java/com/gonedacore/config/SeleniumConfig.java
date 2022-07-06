package com.gonedacore.config;

import javax.annotation.PostConstruct;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
public class SeleniumConfig {
	private String driverPath;

	public SeleniumConfig(@Value("${crawler.driver.path}") String driverPath) {
		this.driverPath = driverPath;
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriverManager.chromedriver().setup();
	}

	@Bean
	public ChromeDriver chromeDriver(ChromeOptions chromeOptions){
		return new ChromeDriver(chromeOptions);
	}

	@Bean
	public ChromeOptions chromeOptions(){
		return new ChromeOptions();
	}


}
