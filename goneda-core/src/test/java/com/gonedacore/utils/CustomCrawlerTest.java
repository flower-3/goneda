package com.gonedacore.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.gonedacore.config.SeleniumConfig;

@SpringBootTest
public class CustomCrawlerTest {

	@Autowired
	ChromeDriver chromeDriver;

	@Autowired
	SeleniumConfig seleniumConfig;

	@DisplayName("크롤러 정상동작 테스트")
	@Test
	public void workTest(){
		chromeDriver.get("https://naver.com");
		Assertions.assertThat("NAVER".equals(chromeDriver.getTitle()));
	}

}
