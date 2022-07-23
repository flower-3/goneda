package com.gonedacore.utils;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class NaverCrawler implements CustomCrawler{

    private final ChromeDriver chromeDriver;
    private final String domain = "https://naver.com";

    @SneakyThrows
    @Override
    public String crawler(){
//        if(chromeDriver.getSessionId() == null){
//            ChromeDriver chromeDriver2 = new ChromeDriver();
//            chromeDriver2.get(domain);
//            System.out.println("세션"+chromeDriver2.getSessionId());
//            return chromeDriver2.getTitle();
//        }
        // TODO 크롬드라이버 옵션 debug로 설정해보니 test코드 종료시에 자동으로 quit 설정된다.
        // 크롬 드라이버 세션id는 드라이버 객체당 하나, 생각해보니 동시성 문제 가능성. que등을 통해 쌓아놓고 비동기로 처리해야하나? 고민필요
        chromeDriver.get(domain);
        return chromeDriver.getTitle();
    }
}
