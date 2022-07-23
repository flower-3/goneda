package com.gonedacore.utils;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class KaKaoCrawler implements CustomCrawler{

    private final ChromeDriver chromeDriver;
    private final String domain = "https://www.daum.net/";

    @Override
    public String crawler() {
        return "";
    }
}
