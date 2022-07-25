package com.gonedacore.utils;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
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

    @DisplayName("네이버 크롤러 정상작동 확인")
    @Test
    public void 네이버_크롤러_정상작동학인() {
        assertThat("NAVER".equals(naverCrawler.crawler()));
    }
}