package com.gonedacore.utils;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("local")
class NaverCrawlerTest {

    @Autowired
    NaverCrawler naverCrawler;

    @Test
    void crawler() {
        assertThat("NAVER".equals(naverCrawler.crawler()));

    }
}