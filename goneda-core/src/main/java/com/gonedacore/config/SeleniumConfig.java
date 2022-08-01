package com.gonedacore.config;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverLogLevel;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class SeleniumConfig {

	public SeleniumConfig(@Value("${crawler.driver.path}") String driverPath) {
		System.setProperty("webdriver.chrome.driver", driverPath);
		System.setProperty("webdriver.chrome.whitelistedIps", "");
		ChromeDriverManager.chromedriver().setup();
	}

	@Bean(destroyMethod = "quit")
	public ChromeDriver chromeDriver(ChromeOptions chromeOptions){
		return new ChromeDriver(chromeOptions);
	}

	@Bean
	public ChromeOptions chromeOptions(@Value("${crawler.driver.path}") String driverPath){
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		options.setBinary(driverPath);
		options.addArguments("--whitelisted-ips");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-dev-shm-usage");
		options.setImplicitWaitTimeout(Duration.ofMillis(2000));
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setLogLevel(ChromeDriverLogLevel.WARNING);
		return options;
	}


}
