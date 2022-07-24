package com.gonedacore.utils;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
class NaverCrawlerTest {

    @Autowired
    NaverCrawler naverCrawler;

    @Test
    public void crawler() {
        assertThat("NAVER".equals(naverCrawler.crawler()));
    }
    @AfterEach
    public void test(){
        ChromeDriverManager.chromedriver().reset();
    }
}