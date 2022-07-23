package com.gonedacore.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CustomCrawlerTest {

	@Autowired
	ChromeDriver chromeDriver;

	@DisplayName("크롤러 정상동작 테스트")
	@Test
	public void workTest(){
		chromeDriver.get("https://www.daum.net");
		Assertions.assertThat(chromeDriver.getTitle().contains("Daum"));
	}

}