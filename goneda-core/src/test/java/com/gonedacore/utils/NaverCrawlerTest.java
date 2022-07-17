package com.gonedacore.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles({"local", "beta"})
class NaverCrawlerTest {

    @Autowired
    NaverCrawler naverCrawler;

    @Test
    void crawler() {
        assertThat("NAVER".equals(naverCrawler.crawler()));
    }
}