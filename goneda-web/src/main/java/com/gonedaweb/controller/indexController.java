package com.gonedaweb.controller;

import com.gonedacore.utils.NaverCrawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @Autowired
    NaverCrawler naverCrawler;
    @GetMapping("/")
    public String index() { return "index"; }
}
