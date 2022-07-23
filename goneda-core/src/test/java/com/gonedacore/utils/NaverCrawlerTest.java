package com.gonedacore.utils;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class NaverCrawlerTest {

    @Autowired
    NaverCrawler naverCrawler;

    @Test
    public void crawler() {
        assertThat("NAVER".equals(naverCrawler.crawler()));
    }
}